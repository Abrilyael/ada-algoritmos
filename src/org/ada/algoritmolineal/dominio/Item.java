package org.ada.algoritmolineal.dominio;
import java.util.Date;

public class Item {
    private final double IVA = 0.21;
    private String name;
    private double price;
    private double tax;
    private Date expirationDate;

    public Item(String name, double price, Date expirationDate){
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }
    public void calculateTax(){
        tax = price * IVA;
    }
    public double getTotalToPay(){
        return price + tax; // cuando nos definen un retorno, luego de los procesos que haga tengo que poner
        // return para que en caso de estructuras de control o cualquier algoritmo.
    }
    //public boolean cantItBeSold() {
      //  Date currentDate = new Date();


        //return currentDate.after(expirationDate);
}

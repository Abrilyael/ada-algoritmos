package org.ada.algoritmolineal.dominio;


import java.util.Date;

public class Account {
    private final String DEPOSIT = "DEPOSIT";
    private final String GET = "GET";
    private String holder;
    private double balance;
    private String lastTransaction;
    private Date lastTransactionDate; // objeto que sirve para poder colocar fechas exactas..

    public Account(String holder, double balance){
        this.holder = holder;
        this.balance = balance;
    }
    public String depositMoney(double value){
        balance = balance + value;
        lastTransaction = DEPOSIT;
        lastTransactionDate = new Date();

        return "El nuevo saldo después de depositar es: " + balance;

    }
    public String getMoney(double value){
        if (balance >= value) {
            balance = balance - value;
            lastTransaction = GET;
            lastTransactionDate = new Date();

            return "El nuevo saldo después de retirar es: " + balance;
        } else {
            return "No es posible retirar " + value + " el saldo actual es : " + balance;
        }
    }
}

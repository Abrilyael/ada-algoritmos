import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;
import org.ada.algoritmolineal.Calculador;
import org.ada.algoritmolineal.EstructuraDeControl;
import org.ada.algoritmolineal.EstructuraDeRepeticion;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.Callable;

import org.ada.algoritmolineal.dominio.*;

public class Main {
    public static void main(String args[]) {
        //Calculador calculador = new Calculador();
        //calculador.multiplicarNumeros();
        //byte edad = 3;
        //Perro Luz = new Perro("Luz", "Callejera",edad );
        //Luz.decirCaractObligatorias();
       // Animal animal = new Animal("GATO", "MICHI", "MESTIZO");
        //animal.Sleep();
       // double price = 120;
        //Item orangeJuice = new Item("Naranja", price , new Date(2022, 04, 18));
        //orangeJuice.cantItBeSold();
        //System.out.println("El valor a pagar es " + " " + orangeJuice.getTotalToPay());
        Account abrilAccount = new Account("Abril", 100);
        System.out.println(abrilAccount.depositMoney(50));
        System.out.println(abrilAccount.getMoney(200));
    }
}



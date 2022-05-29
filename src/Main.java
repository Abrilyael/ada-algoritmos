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
       // Account abrilAccount = new Account("Abril", 100);
        //System.out.println(abrilAccount.depositMoney(50));
        //System.out.println(abrilAccount.getMoney(200));
        Joyas joyas = new Joyas("pulcera", "Acero");// con la palabra new instanciamos (darle valores, tangibles en la compu) un dato de tipo objeto en la memoria
        System.out.println(joyas.saberPrecio()); // para que sde impriman los resultados de los metodos que retornen algun tipo de dato tenemos que usar S.O.P
        // una instancia es un elemento tangible generado a partir de una definicion en la clase, cuando creamos la clase luego de hacer new el objeto queda registrado
        // dentro de la nueva clase, sería como una fucion de la clase ya formada mas la clase con la informacion. Es cpmo un plano, el objeto creado dentro del plano
        // se le llama instancia = objeto.

    }
}



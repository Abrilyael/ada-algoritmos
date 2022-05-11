package org.ada.algoritmolineal;

import java.util.Scanner;

public class EstructuraDeControl {
    public void identificarNumMayor() {
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        int a = lectorDatos.nextInt();
        System.out.println("Ingrese el valor de B: ");
        int b = lectorDatos.nextInt();
        int numMayor;
        if (a > b) {
            numMayor = a;
            System.out.println("A es mayor que B");
        } else {
            System.out.println("B es mayor que A");
        }
    }

    public void identificarMayorCero() {
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("ingrese valor del número: ");
        int numero = lectorDatos.nextInt();
        if (numero >= 0) {
            System.out.println("el numero es positivo ");
        } else {
            System.out.println("el numero es negativo ");

        }
    }

    public void identificarPago() {
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("ingrese cantidad de lapices: ");
        int cantidadLap = lectorDatos.nextInt();
        int precioT;
        if (cantidadLap > 1000) {
            precioT = cantidadLap * 85;
        } else {
            precioT = cantidadLap * 90;
        }
        System.out.println("El pago total por la cantidad de lapiz es: " + precioT);
    }

    public void identificarCantidadMayor() {
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("ingrese cantidad A: ");
        int a = lectorDatos.nextInt();
        System.out.println("ingrese cantidad B: ");
        int b = lectorDatos.nextInt();
        System.out.println("ingrese cantidad C: ");
        int c = lectorDatos.nextInt();
        int numeroMayor;
        if (a > b) {
            if (a > c) {
                numeroMayor = a;
            } else {
                numeroMayor = c;
            }
            if (b > c) {
                numeroMayor = b;
            }
        }
        System.out.println(" la cantidad mayor es: ");
    }

    public void identificarPrecioTotal() {
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("Ingrese el precio del traje: ");
        int traje = lectorDatos.nextInt();
        int precioTotal;
        int porcentajeQ = 15;
        int porcentajeO = 8;
        int descuentoQ = traje * porcentajeQ / 100;
        int descuentoA = traje * porcentajeO / 100;
        if (traje > 2500) {
            precioTotal = traje - descuentoQ;
        } else {
            precioTotal = traje - descuentoA;
        }
        System.out.println("El precio total del traje es:" + precioTotal);
    }

    public void identificarPresupuesto() {
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("Ingrese cantidad de personas: ");
        int personas = lectorDatos.nextInt();
        int totalB;
        if (personas <= 300) {
            totalB = personas * 850;
        } else {
            if (personas > 300) {
                totalB = personas * 750;
            }
             else {
                 totalB = personas* 950;
            }
        }
        System.out.println("el presupuesto total es de: " + totalB);
    }

}


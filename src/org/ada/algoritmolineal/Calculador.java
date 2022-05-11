package org.ada.algoritmolineal;
import java.util.Scanner;

 public class Calculador {
     public void sumarNumeros() {
         Scanner lectorDatos = new Scanner(System.in);
         System.out.println("Ingrese sumando A");
         int sumandoA = lectorDatos.nextInt();
         System.out.println("Ingrese sumando B");
         int sumandoB = lectorDatos.nextInt();
         int resultado = sumandoA + sumandoB;
         System.out.println("El resultado de la suma es: " + resultado);
     }
     public void multiplicarNumeros() {
         Scanner lectorDatos = new Scanner(System.in);
         System.out.println("Ingrese numero A: ");
         int numeroA = lectorDatos.nextInt();
         System.out.println("Ingrese numero B: ");
         int numeroB = lectorDatos.nextInt();
         int resultado = numeroA * numeroB;
         System.out.println("El resultado de la multiplicacion es: " + resultado);
     }

     public void calcularPromedio() {
         final byte CANTIDAD_NOTAS = 4;
         Scanner lectorDatos = new Scanner(System.in);
         System.out.println("ingrese su primer nota");
         int nota1 = lectorDatos.nextInt();
         System.out.println("ingrese su segunda nota");
         int nota2 =lectorDatos.nextInt();
         System.out.println("ingrese su tercera nota");
         int nota3 = lectorDatos.nextInt();
         System.out.println("ingrese su cuarta nota");
         int nota4 = lectorDatos.nextInt();
         int resultadoSuma= nota1 + nota2 + nota3 + nota4;
         int promedio = resultadoSuma / 4;
         System.out.println("el promedio del alumno es: " + promedio);
     }
     public void calcularAreaR (){
         Scanner lectorDatos = new Scanner (System.in);
         System.out.println("ingrese altuta del rectangulo: ");
         int altura = lectorDatos.nextInt();
         System.out.println("ingrese la base del rectangulo:");
         int base = lectorDatos.nextInt();
         int area= base * altura;
         System.out.println("el resultado dela rea del rectangulo es: " + area );


     }
     public void calcularAreaC (){
         final double NUMERO_PI = 3.1413;
                 Scanner lectorDatos = new Scanner (System.in);
         System.out.println("ingrese radio de la circunsferencia: ");
         int radio = lectorDatos.nextInt();
         double areaC = NUMERO_PI * radio * radio;
         System.out.println("el area de la cincunsferenica es: " + areaC);


     }

 }
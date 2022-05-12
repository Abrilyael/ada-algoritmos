package org.ada.algoritmolineal;
import java.util.Scanner;
public class EstructuraDeRepeticion<CANTIDAD_ARRAY> {

    public void sumarVector(){
        int[] vectorNumeros = new int[10]; // siempre se va a tener que definir el numero de casillas que tenga el Array.
        // eso rojo se llama break point y sirve para mostrarnos el paso a paso del codigo, y se ejecuta con Debug.
        int sumatoria = 0;
        Scanner lectorDatos = new Scanner(System.in);
        // for (int i = 0; i < 10; i++) así seria normalmente,pero java tiene un objeto para los vectores que sirve para asegurarse
        // de que el array tenga un limite,como al que llamamos en la linea 5. es el nombre del vector mas la palabra ".length"
        // Las variables siempre se definen al comienzo del codigo
        // bucles :for se utiliza cuando sabemos exactamente el numero de veces que se repite.
        // empiezo "desde" el indice 0 de la columna, "mientras" hasta que se cumpla la condicion del num de columnas.
        for (int i = 0; i < vectorNumeros.length; i++) { // en esta linea se recorre el vector.
            System.out.println("Igrese el valor del vector: " + i);// usuario coloca datos.
            vectorNumeros[i] = lectorDatos.nextInt();


        }
        for (int i = 0; i < vectorNumeros.length; i++) {
            sumatoria = sumatoria + vectorNumeros[i];
        }
        System.out.println("La sumatoria de los valores es: "+ sumatoria);

        }
        public void obtenerVectorC(){
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("ingrese la dimension del vector: ");
        int numVector = lectorDatos.nextInt();

        double [] vectorA = new double[numVector];
        double [] vectorB = new double[numVector];
        double [] vectorC = new double[numVector];
        for (int i = 0; i < numVector; i++){
            System.out.println("Ingrese el  valor en la posicion" + i + "del vector A");
            vectorA[i] = lectorDatos.nextDouble();
            System.out.println("Ingrese el  valor en la posicion" + i + "del vector B");
            vectorB[i] = lectorDatos.nextDouble();
            vectorC[i] = vectorA[i] + vectorB[i];

        }
        for( int i = 0; i < numVector; i++){
            System.out.println("La sumatoria de los vectores A y B en la posición" + i + " es " + vectorC[i] );
        }

    }

    public void obtenerProm(){
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de ALUMNOS: ");
        int alumnos = lectorDatos.nextInt();
         String [] nombresAlum = new String [alumnos];
         int [] promedioAlum = new int [alumnos];

         for( int i = 0; i < alumnos; i++){
             System.out.println("Ingrese apellido del alumno" + (i + 1) + ".");
             nombresAlum[i] = lectorDatos.next();
             System.out.println("Ingrese el promedio general del alumno: " + (i + 1) + ".");
             promedioAlum[i] = lectorDatos.nextInt();

         }
         for (int i = 0; i < alumnos; i++){
             for( int j = i + 1; j < alumnos; i++){
                 if(promedioAlum[j] > promedioAlum[i]){
                     int promAux = promedioAlum[i];
                     promedioAlum[i] = promedioAlum[j];
                     promedioAlum[j] = promAux;
                     String nombresAux = nombresAlum[i];
                     nombresAlum[i] = nombresAlum[j];
                     nombresAlum[j] = nombresAux;
                 }
             }
         }
         for(int i = 0; i < alumnos; i++){
             System.out.println("El alumno " + nombresAlum[i] + "tiene un promedio de " + promedioAlum[i] + ".");
         }

    }
    public void obtenerControl(){
        Scanner lectorDatos = new Scanner(System.in);
        int [] vectorExistencia = new int[10];
        int [] vectorPedidos = new int [10];
        int [] vectorCompras = new int [10];
        for( int i = 0; i < vectorExistencia.length; i++){
            System.out.println("ingrese el codigo de los productos en la posicion :  " + vectorExistencia[i] );
            vectorExistencia[i] = lectorDatos.nextInt();
            System.out.println("ingresen los codigos faltantes en la posicion : " + vectorPedidos[i]);
            vectorPedidos[i] = lectorDatos.nextInt();
        }
        for( int i = 0; i < 10; i++ ){
            if (vectorExistencia[i] == vectorPedidos[i]){
                vectorCompras[i] = vectorExistencia[i];
            } else if (vectorPedidos[i] > vectorExistencia[i]){
                vectorCompras[i] = (vectorPedidos[i] - vectorExistencia[i]) + 2;

            } else {
                vectorCompras[i] = vectorPedidos[i];
            }
        }
        for(int i = 0; i < 10; i++){
            System.out.println("");
        }
    }
    public void contarLimite(){
        int numero = 100;
        int limite = 1;
        while( numero >= limite ){
            System.out.println(numero);
            numero--;
        }
    }
    public void contarConDoWhile(){// primero ejecutamos los pasos del algoritmo
        int numero = 1;
        do{// esctructura de repeticion, abrimos corchetes
          System.out.println(numero);
          numero++;
        } while(numero <= 10);// y luego evaluamos  la condicion

        }
        public void pedirNum(){
        Scanner lectorDatos = new Scanner(System.in);
        System.out.println("Ingrese diez numeros : ");
        int numeros = lectorDatos.nextInt();
        }
    }



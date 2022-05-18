package org.ada.algoritmolineal.dominio;

public class Perro {
    private String nombre;
    private String raza;
    private double edad;
    private String sonido;
    private String tamaño;
    private String colorDePelo;

    public Perro(String nombre, String raza , double edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    public void decirCaractObligatorias(){
        System.out.println("el nombre de mi mascota es" + nombre  );
        System.out.println("Su edad es" + edad + " " + "y su raza " + raza);

    }

    }

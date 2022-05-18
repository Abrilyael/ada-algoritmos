package org.ada.algoritmolineal.dominio;

public class Animal {
    private String brand;
    private String name;
    private String color;

    public Animal (String brand, String name, String color){
        this.brand = brand;
        this.name = name;
        this.color = color;

    }
    public void Move(){
        System.out.println( name + " " + "Se esta moviendo");

    }
    public void Sleep(){
        System.out.println(name + " " + "Está durmiendo");
    }
    public void Eat(){
        System.out.println(name + " " +  "Está comiendo");
    }
}

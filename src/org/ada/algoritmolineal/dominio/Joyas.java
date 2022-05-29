package org.ada.algoritmolineal.dominio;

public class Joyas {
    private String tipoDeJoya;
    private String material;
    private String color;
    private double tamaño;
    private int precioPorMayor;


    public Joyas(String tipoDeJoya, String material){// lo que pongo en parentesis se llama constructor y  es un parametro de lo que si o si tiene que saberse.
        //ésta es una manera de hacerlo,o luego de instanciar el objeto podemos ponerle un valor a cada atributo
        this.tipoDeJoya = tipoDeJoya;
        this.material = material;
    }

    public int saberPrecio() {
        int precioAcero = 2300;
        int precioPlata = 1500;
        int precioOro = 3000;
         precioPorMayor = precioAcero + precioOro + precioPlata;
        return  precioPorMayor;


    }
    public void mostrarInformacionDelProducto(){
        String color = "plateado";
        double tamaño = 1.23;
        String tipoDeJoya = "COLLAR";
        String material = "ACERO";
        int precio = 2100;
        System.out.println("El producto" + " " + tipoDeJoya + " " + " del material " + material + "y color "+ "" + color + "está evaluada en un total de " + precio);
    }
}

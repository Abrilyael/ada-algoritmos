package org.ada.algoritmolineal.dominio;

public class Persona {
    private String nombre;
    private String apellido;
    private byte edad;
    private double estatura;
    private char sexoBiologico;
    private String fechaDeNac;
    private String nacionalidad;
    private String colorDePelo;

    public Persona( String nombre, String apellido , byte edad , double estatura, char sexoBiologico){
      this.nombre = nombre;
      this.apellido = apellido;
      this.edad = edad;
      this.estatura = estatura;
      this.sexoBiologico = sexoBiologico;
    }

    public void decirNombreCompleto(){
        System.out.println("Mi nombre es " + nombre+ "" + apellido);

    }
}

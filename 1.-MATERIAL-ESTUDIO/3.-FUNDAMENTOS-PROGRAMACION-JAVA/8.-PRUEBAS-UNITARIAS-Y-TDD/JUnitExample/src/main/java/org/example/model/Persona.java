package org.example.model;

public class Persona {
    private String rut;
    private String nombre;

    //Constructor
    public Persona() {};

    //Constructor con parametros
    public Persona(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    //Getters y setters
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

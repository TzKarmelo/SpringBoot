package com.example.demo.models;

public class Proveedor {

    private String nombre;
    private String apellido;
    private String empresa;

    public Proveedor() {
    }

    public Proveedor(String nombre, String apellido, String empresa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido= apellido;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", empresa='" + empresa + '\'' +
                '}';
    }
}

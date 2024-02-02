package com.example.Ejercicio_5.Model;

public class Producto {

    private int Id;
    private String Nombre;

    public Producto(int id, String nombre) {
        Id = id;
        Nombre = nombre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Id=" + Id +
                ", Nombre='" + Nombre + '\'' +
                '}';
    }
}

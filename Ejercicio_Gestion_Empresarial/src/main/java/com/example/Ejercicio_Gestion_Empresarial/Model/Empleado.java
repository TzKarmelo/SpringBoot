package com.example.Ejercicio_Gestion_Empresarial.Model;

public class Empleado {
    private Long id;
    private Integer legajo;
    private String nombre;
    private String apellido;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(Long id, Integer legajo, String nombre, String apellido, double sueldo) {
        this.id = id;
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

    public Long getId() {
        return id;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", sueldo=" + sueldo + '}';
    }
}

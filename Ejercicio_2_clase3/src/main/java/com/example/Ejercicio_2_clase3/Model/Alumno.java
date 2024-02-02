package com.example.Ejercicio_2_clase3.Model;

public class Alumno {

    private int id;
    private String nombre;
    private String apellido;
    private int numeroMatricula;
    private double notaFinal;
    private String nivelEducativo;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, int numeroMatricula, double notaFinal, String nivelEducativo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroMatricula = numeroMatricula;
        this.notaFinal = notaFinal;
        this.nivelEducativo = nivelEducativo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public String getNivelEducativo() {
        return nivelEducativo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroMatricula=" + numeroMatricula +
                ", notaFinal=" + notaFinal +
                ", nivelEducativo='" + nivelEducativo + '\'' +
                '}';
    }
}

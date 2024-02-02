package com.example.Ejercicio_Gestion_Empresarial.Model;

import java.util.List;

public class Empresa {

    private Long id;
    private String nombre;
    List<Empleado> empleados;

    public Empresa() {
    }

    public Empresa(Long id, String nombre, List<Empleado> empleados) {
        this.id = id;
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", nombre=" + nombre + ", empleados=" + empleados + '}';
    }
}

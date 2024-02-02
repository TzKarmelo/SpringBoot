package com.example.Ejercicio_3_clase3.Model;

import java.util.List;

public class Pedido {

    private int id;
    private boolean estado;
    private String cliente;
    List<Plato> platos;

    public Pedido() {
    }

    public Pedido(int id, boolean estado, String cliente, List<Plato> platos) {
        this.id = id;
        this.estado = estado;
        this.cliente = cliente;
        this.platos = platos;
    }

    public int getId() {
        return id;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Plato> getPlatos() {
        return platos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setPlatos(List<Plato> platos) {
        this.platos = platos;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", estado=" + estado + ", cliente=" + cliente + ", platos=" + platos + '}';
    }
}

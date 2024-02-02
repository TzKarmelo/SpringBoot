package com.example.Ejercicio_1_clase_7.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Equipo {

    private Long id;
    private String nombre;
    private String ciudad;
    private List<Jugador> jugadores;
}

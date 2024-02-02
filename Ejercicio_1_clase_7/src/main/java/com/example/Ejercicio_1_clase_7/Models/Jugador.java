package com.example.Ejercicio_1_clase_7.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Jugador {

    private Long id;
    private String nombre;
    private Integer Edad;
    private Integer posicion;
}

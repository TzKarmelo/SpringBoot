package com.example.Ejercicio_Carreras.Model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Equipo {

    private Long id_equipo;
    private String nombre_equipo;
    private String pais;
    private List<Piloto> pilotos;
}

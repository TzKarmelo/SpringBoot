package com.example.Ejercicio_Carreras.DTO;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PilotoDTO implements Serializable {

    private String nombre_piloto;
    private String apellido_piloto;
    private String nombre_equipo;
}

package com.example.Ejercicio_Gestion_Escolar.Model;

import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer nroMatricula;
    private Double notaFinal;
    private String nivelEducativo;;
}

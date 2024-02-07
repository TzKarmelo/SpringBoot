package com.example.Ejercicio_2_clase_8.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.PrimitiveIterator;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServicioDTO implements Serializable {

    private Long id_paciente;
    private String nombre_paciente;
    private String nombre_duenio;
    private String tipo_servicio;
    private String fecha;
    private Double precio;
}

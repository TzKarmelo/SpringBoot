package com.example.Ejercicio_Inmobiliaria.DTO;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PropiedadDTO implements Serializable {

    private Long id_propiedad;
    private String tipo;
    private String direccion;
    private Double valor_alquiler;
    private String nombre_inquilino;
    private String apellido_inquilino;
}

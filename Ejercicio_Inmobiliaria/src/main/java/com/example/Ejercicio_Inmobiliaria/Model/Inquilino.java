package com.example.Ejercicio_Inmobiliaria.Model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Inquilino {

    private Long id_inquilino;
    private String dni;
    private String nombre;
    private String apellido;
    private String profesion;

}

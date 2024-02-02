package com.example.Ejercicio_Carreras.Model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Piloto {

    private Long id_piloto;
    private String nombre_piloto;
    private String apellido_piloto;
    private Integer edad;
    private String nacionalidad;

}

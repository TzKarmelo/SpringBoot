package com.example.Ejercicio_Repostera.Model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Ingredientes {

    private Long id;
    private String nombre_ingrediente;
    private String apto_celiaco;
}

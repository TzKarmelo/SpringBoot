package com.example.Ejercicio_Repostera.Model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Platos {

    private Long id_plato;
    private String nombre_plato;
    private Double precio;
    private List<Ingredientes> ingredientes;
    private String apto_celiaco;
}

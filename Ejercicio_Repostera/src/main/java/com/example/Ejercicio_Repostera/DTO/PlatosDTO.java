package com.example.Ejercicio_Repostera.DTO;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PlatosDTO implements Serializable {

        private Long id_plato;
        private String nombre_plato;
        private String apto_celiaco;
}

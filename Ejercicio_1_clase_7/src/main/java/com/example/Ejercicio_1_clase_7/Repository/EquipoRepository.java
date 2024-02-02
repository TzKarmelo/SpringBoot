package com.example.Ejercicio_1_clase_7.Repository;

import com.example.Ejercicio_1_clase_7.Models.Equipo;
import com.example.Ejercicio_1_clase_7.Models.Jugador;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EquipoRepository {

    List<Equipo> listaEquipos = Arrays.asList(
            new Equipo(1L,"Equipo 1", "Buenos Aires",
                    Arrays.asList(
                            new Jugador(11L,"Lionel",36,10),
                            new Jugador(12L,"Manuel",24,7),
                            new Jugador(13L,"Emiliano",32,1)
                    )),
            new Equipo(2L,"Equipo 2", "Rosario",
                    Arrays.asList(
                            new Jugador(21L,"Juan",33,3),
                            new Jugador(22L,"Marcelo",22,8)
                    ))
    );
    public List<Equipo> obtenerEquipos() {
        return listaEquipos;
    }
}

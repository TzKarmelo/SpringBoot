package com.example.Ejercicio_1_clase_7.Service;

import com.example.Ejercicio_1_clase_7.Models.Equipo;
import com.example.Ejercicio_1_clase_7.Models.Jugador;

import java.util.List;

public interface IEquipoService {

    public List<Equipo> obtenerEquipos();
    public Equipo obtenerEquipo(Long id);
    public List<Jugador> obtenerJugadores(Long id);
}

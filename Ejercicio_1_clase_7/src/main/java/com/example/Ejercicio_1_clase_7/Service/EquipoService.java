package com.example.Ejercicio_1_clase_7.Service;

import com.example.Ejercicio_1_clase_7.Models.Equipo;
import com.example.Ejercicio_1_clase_7.Models.Jugador;
import com.example.Ejercicio_1_clase_7.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EquipoService implements IEquipoService{

    @Autowired
    private EquipoRepository equipoRepository;

    @Override
    public List<Equipo> obtenerEquipos() {
        return equipoRepository.obtenerEquipos();
    }

    @Override
    public Equipo obtenerEquipo(Long id) {
        return equipoRepository.obtenerEquipos().stream()
                .filter(equipo -> equipo.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Jugador> obtenerJugadores(Long id) {

        return equipoRepository.obtenerEquipos().stream()
                .filter(equipo -> equipo.getId().equals(id))
                .findFirst()
                .map(Equipo::getJugadores)
                .orElse(new ArrayList<>());
    }
}

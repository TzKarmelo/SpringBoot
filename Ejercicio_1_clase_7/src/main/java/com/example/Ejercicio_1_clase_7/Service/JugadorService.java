package com.example.Ejercicio_1_clase_7.Service;

import com.example.Ejercicio_1_clase_7.Models.Jugador;
import com.example.Ejercicio_1_clase_7.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JugadorService implements IJugadorService{

    @Autowired
    private EquipoRepository equipoRepository;

    @Override
    public List<Jugador> obtenerJugadores() {

        /*List<Jugador> listJugadores = new ArrayList<>();
        List<Equipo> listEquipos = equipoRepository.obtenerEquipos();
        for(Equipo equipo : listEquipos){
            listJugadores.addAll(equipo.getJugadores());
        }
        return listJugadores;*/

        return equipoRepository.obtenerEquipos()
                .stream()
                .flatMap(equipo -> equipo.getJugadores().stream())
                .toList();
    }
}

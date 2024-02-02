package com.example.Ejercicio_1_clase_7.Controller;

import com.example.Ejercicio_1_clase_7.Models.Equipo;
import com.example.Ejercicio_1_clase_7.Models.Jugador;
import com.example.Ejercicio_1_clase_7.Service.IEquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/equipos")
public class EquipoController {

    @Autowired
    private IEquipoService equipoService;

    @GetMapping
    public List<Equipo> getEquipos(){
        return equipoService.obtenerEquipos();
    }

    @GetMapping("/{id}")
    public Equipo getEquipo(@PathVariable Long id){
        return equipoService.obtenerEquipo(id);
    }

    @GetMapping("/{id}/jugadores")
    public List<Jugador> getJugadores(@PathVariable Long id){
        return equipoService.obtenerJugadores(id);
    }

}

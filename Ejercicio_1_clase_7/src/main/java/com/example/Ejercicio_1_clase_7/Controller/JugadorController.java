package com.example.Ejercicio_1_clase_7.Controller;

import com.example.Ejercicio_1_clase_7.Models.Jugador;
import com.example.Ejercicio_1_clase_7.Service.IJugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jugadores")
public class JugadorController {

    @Autowired
    IJugadorService jugadorService;

    @GetMapping
    public List<Jugador> obtenerJugadores() {
        return jugadorService.obtenerJugadores();
    }
}

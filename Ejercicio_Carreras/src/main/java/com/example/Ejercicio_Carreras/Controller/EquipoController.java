package com.example.Ejercicio_Carreras.Controller;

import com.example.Ejercicio_Carreras.Model.Equipo;
import com.example.Ejercicio_Carreras.Service.PilotoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EquipoController {

    PilotoService pilotoService = new PilotoService();

    @PostMapping("/equipos/guardar")
    @ResponseBody
    public String guardarEquipo(@RequestBody Equipo equipo){

        return pilotoService.crearEquipo(equipo);
    }

    @GetMapping("/equipos/traer")
    @ResponseBody
    public List<Equipo> traerEquipos(){

        return pilotoService.obtenerEquipos();
    }

    @GetMapping("/equipos/traer/{nombre_equipo}")
    @ResponseBody
    public Equipo traerEquipoPorNombre(@PathVariable String nombre_equipo){

        return pilotoService.obtenerEquipoPorNombre(nombre_equipo);
    }
}

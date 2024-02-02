package com.example.Ejercicio_Carreras.Controller;

import com.example.Ejercicio_Carreras.DTO.PilotoDTO;
import com.example.Ejercicio_Carreras.Model.Piloto;
import com.example.Ejercicio_Carreras.Service.PilotoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PilotoController {

    PilotoService pilotoService = new PilotoService();

    @PostMapping("/pilotos/guardar")
    @ResponseBody
    public String guardarPiloto(@RequestBody Piloto piloto){

        return pilotoService.crearPiloto(piloto);
    }

    @GetMapping("/pilotos/traer")
    @ResponseBody
    public List<Piloto> traerPilotos(){

        return pilotoService.obtenerPilotos();
    }

    @GetMapping("/pilotos/traer/{nombre_equipo}")
    @ResponseBody
    public List<PilotoDTO> traerPilotosPorEquipo(@PathVariable String nombre_equipo){

        return pilotoService.devolverPilotos(nombre_equipo);
    }
}

package com.example.Ejercicio_Gestion_Escolar.Controller;

import com.example.Ejercicio_Gestion_Escolar.Model.Alumno;
import com.example.Ejercicio_Gestion_Escolar.Service.AlumnoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlumnoController {

    AlumnoService alumnoService = new AlumnoService();

    @PostMapping("/alumno")
    public String crearAlumno(@RequestBody Alumno alumno){

        return alumnoService.crearAlumno(alumno);
    }

    @GetMapping("/alumnos")
    public List<Alumno> obtenerAlumnos(){

        return alumnoService.obtenerAlumnos();
    }

    @GetMapping("/alumnos/{id}")
    public Alumno getAlumno(@PathVariable Integer id) {
        return alumnoService.buscarPorId(id);
    }

    @GetMapping("/alumnos/buscar")
    public List<Alumno> buscarPorNivel(@RequestParam String nivel) {
        return alumnoService.buscarPorNivel(nivel);
    }

}

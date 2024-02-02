package com.ejemplomulticapa.controller;
import com.ejemplomulticapa.model.Alumno;
import com.ejemplomulticapa.service.AlumnoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlumnoController {

    AlumnoService alumnoService = new AlumnoService();

    @PostMapping("/alumno")
    public String crearAlumno(@RequestBody Alumno alumno){

        alumnoService.crearAlumno(alumno);

        return "Alumno:" + alumno.getNombre();
    }

    @GetMapping("/alumnos")
    public List<Alumno> obtenerAlumnos(){
        //acá debería ir la lógica de devolver la lista de alumnos

        return alumnoService.obtenerAlumnos();
    }

    
}


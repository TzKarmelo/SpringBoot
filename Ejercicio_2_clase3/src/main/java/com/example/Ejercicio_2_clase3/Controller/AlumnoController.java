package com.example.Ejercicio_2_clase3.Controller;

import com.example.Ejercicio_2_clase3.Model.Alumno;
import org.springframework.context.annotation.Conditional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AlumnoController {

    List<Alumno> alumnos = new ArrayList<>();

    @PostMapping("/alumno")
    public String crearAlumno(@RequestBody Alumno alumno) {
        alumnos.add(alumno);
        return "Alumno creado" + alumno.toString();
    }

    @PostMapping("/alumnos")
    public String crearAlumno(@RequestBody List<Alumno> alumnos) {
        this.alumnos.addAll(alumnos);
        return "Alumnos creados";
    }

    @GetMapping("/alumnos/crear/{id}/{nombre}/{apellido}/{numeroMatricula}/{notaFinal}/{nivelEducativo}")
    public String crearAlumno(@PathVariable int id,@PathVariable String nombre,@PathVariable String apellido,@PathVariable int numeroMatricula,@PathVariable double notaFinal,@PathVariable String nivelEducativo) {
        Alumno alumno = new Alumno(id, nombre, apellido, numeroMatricula, notaFinal, nivelEducativo);
        alumnos.add(alumno);
        return "Alumno creado";
    }

    @GetMapping("/alumnos")
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    @GetMapping("/alumnos/{id}")
    public String getAlumno(@PathVariable int id) {
        for (Alumno alumno : alumnos) {
            if (alumno.getId() == id) {
                return alumno.toString();
            }
        }
        return "No se encontró el alumno";
    }

    @GetMapping("/alumnos/nivelEducativo/{nivelEducativo}")
    public List<Alumno> getAlumnosByNivelEducativo(@PathVariable String nivelEducativo) {
        return alumnos.stream()
                .filter(alumno -> alumno.getNivelEducativo().equals(nivelEducativo))
                .toList();
    }

}

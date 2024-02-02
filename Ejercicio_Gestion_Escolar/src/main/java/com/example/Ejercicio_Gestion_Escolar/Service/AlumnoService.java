package com.example.Ejercicio_Gestion_Escolar.Service;

import com.example.Ejercicio_Gestion_Escolar.Model.Alumno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlumnoService implements IAlumnoService {

    List<Alumno> listaAlumnos = new ArrayList<>();
    @Override
    public String crearAlumno(Alumno alu) {
        listaAlumnos.add(alu);
        return "Alumno creado: " + alu.getNombre();

    }
    @Override
    public List<Alumno> obtenerAlumnos() {

        return listaAlumnos;
    }

    @Override
    public Alumno buscarPorId(Integer id) {
        return listaAlumnos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .get();
    }

    @Override
    public List<Alumno> buscarPorNivel(String nivel) {
        return listaAlumnos.stream()
                .filter(p -> p.getNivelEducativo().equalsIgnoreCase(nivel))
                .collect(Collectors.toList());
    }
}

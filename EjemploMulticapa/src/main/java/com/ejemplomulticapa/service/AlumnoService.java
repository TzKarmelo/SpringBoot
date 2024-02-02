package com.ejemplomulticapa.service;

import com.ejemplomulticapa.model.Alumno;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService implements IAlumnoService{

    List<Alumno> listaAlumnos = new ArrayList<>();

    @Override
    public void crearAlumno(Alumno alu) {

        listaAlumnos.add(alu);

        System.out.println("Persona Creada");

    }

    @Override
    public List<Alumno> obtenerAlumnos() {

        return listaAlumnos;
    }
    
    //métodos de lógica de negocio
    
    
}

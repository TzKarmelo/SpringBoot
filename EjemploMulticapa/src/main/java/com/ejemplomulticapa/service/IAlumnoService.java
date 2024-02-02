
package com.ejemplomulticapa.service;

import com.ejemplomulticapa.model.Alumno;
import java.util.List;

public interface IAlumnoService {
    
    //declarando métodos sin implementar
    public void crearAlumno (Alumno alu);
    public List<Alumno> obtenerAlumnos();
    
}


package com.example.Ejercicio_Gestion_Escolar.Service;

import com.example.Ejercicio_Gestion_Escolar.Model.Alumno;

import java.util.List;

public interface IAlumnoService {
    
    //declarando métodos sin implementar
    public String crearAlumno (Alumno alu);
    public List<Alumno> obtenerAlumnos();
    public Alumno buscarPorId(Integer id);
    public List<Alumno> buscarPorNivel(String nivel);
}

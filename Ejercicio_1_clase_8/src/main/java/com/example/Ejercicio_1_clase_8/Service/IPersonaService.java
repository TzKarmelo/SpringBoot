package com.example.Ejercicio_1_clase_8.Service;

import com.example.Ejercicio_1_clase_8.Model.Persona;

import java.util.List;

public interface IPersonaService {

    public List<Persona> getPersonas();
    public void savePersona (Persona persona);
    public void deletePersona (Long id);
    public Persona findPersona (Long id);
    public Persona findByNombre (String nombre);

}

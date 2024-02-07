package com.example.Ejercicio_1_clase_8.Service;

import com.example.Ejercicio_1_clase_8.Model.Persona;
import com.example.Ejercicio_1_clase_8.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository persoRepo;

    @Override
    public List<Persona> getPersonas () {

        return persoRepo.findAll();

    }

    @Override
    public void savePersona(Persona perso) {
        persoRepo.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {

        return persoRepo.findById(id).orElse(null);

    }

    @Override
    public Persona findByNombre(String nombre) {
        return persoRepo.findByNombre(nombre);
    }

}
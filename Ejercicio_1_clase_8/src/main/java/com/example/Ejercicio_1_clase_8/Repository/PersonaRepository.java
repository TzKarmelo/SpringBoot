package com.example.Ejercicio_1_clase_8.Repository;

import com.example.Ejercicio_1_clase_8.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// La interface extiende de JpaRepository (ecargada por defecto de manejo de repositorios JPA)
// En los parámetros <> deben ir: <Clase a persistir, tipo de dato de su Id>
@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {

    // Optional<Persona> findByNombre(String nombre);

    // List<Persona> findByNombre(String nombre);

    @Query("SELECT p FROM Persona p WHERE p.nombre = ?1")
    public Persona findByNombre(String nombre); // List<Persona> findByNombre(String nombre);

}
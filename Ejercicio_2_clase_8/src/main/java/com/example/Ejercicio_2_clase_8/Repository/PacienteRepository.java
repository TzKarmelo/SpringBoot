package com.example.Ejercicio_2_clase_8.Repository;

import com.example.Ejercicio_2_clase_8.Model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}

package com.example.Ejercicio_2_clase_8.Repository;

import com.example.Ejercicio_2_clase_8.Model.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Long> {
}

package com.example.Ejercicio_Carreras.Service;

import com.example.Ejercicio_Carreras.DTO.PilotoDTO;
import com.example.Ejercicio_Carreras.Model.Equipo;
import com.example.Ejercicio_Carreras.Model.Piloto;

import java.util.List;

public interface IPilotoService {

    public List<Equipo> obtenerEquipos();
    public List<Piloto> obtenerPilotos();
    public Equipo obtenerEquipoPorNombre(String nombre_equipo);
    public List<PilotoDTO> devolverPilotos(String nombre_equipo);
    public String crearPiloto(Piloto piloto);
    public String crearEquipo(Equipo equipo);
}

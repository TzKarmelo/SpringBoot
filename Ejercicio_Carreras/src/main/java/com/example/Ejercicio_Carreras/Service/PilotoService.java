package com.example.Ejercicio_Carreras.Service;

import com.example.Ejercicio_Carreras.DTO.PilotoDTO;
import com.example.Ejercicio_Carreras.Model.Equipo;
import com.example.Ejercicio_Carreras.Model.Piloto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PilotoService implements IPilotoService{

    List<Piloto> pilotosList = new ArrayList<>();
    List<Equipo> equiposList = new ArrayList<>();
    @Override
    public List<Equipo> obtenerEquipos() {

        return equiposList;
    }

    @Override
    public List<Piloto> obtenerPilotos() {

        return pilotosList;
    }

    @Override
    public Equipo obtenerEquipoPorNombre(String nombre_equipo) {
        return equiposList.stream()
                .filter(equipo -> equipo.getNombre_equipo().equals(nombre_equipo))
                .findFirst()
                .get();
    }

    @Override
    public List<PilotoDTO> devolverPilotos(String nombre_equipo) {

        List<PilotoDTO> pilotoDTOList = new ArrayList<>();

        for (Piloto piloto : pilotosList) {
            if (piloto.getNombre_piloto().equals(equiposList.stream()
                    .filter(equipo -> equipo.getNombre_equipo().equals(nombre_equipo))
                    .findFirst()
                    .get().getNombre_equipo())) {

                PilotoDTO pilotoDTO = new PilotoDTO();
                pilotoDTO.setNombre_piloto(piloto.getNombre_piloto());
                pilotoDTO.setApellido_piloto(piloto.getApellido_piloto());
                pilotoDTO.setNombre_equipo(nombre_equipo);
                pilotoDTOList.add(pilotoDTO);
            }
        }
        return pilotoDTOList;
    }

    @Override
    public String crearPiloto(Piloto piloto) {
        pilotosList.add(piloto);
        return "Piloto guardado" + piloto.getNombre_piloto();
    }

    @Override
    public String crearEquipo(Equipo equipo) {
        equiposList.add(equipo);
        return "Equipo guardado" + equipo.getNombre_equipo();
    }
}

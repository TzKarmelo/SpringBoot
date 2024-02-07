package com.example.Ejercicio_2_clase_8.Service;

import com.example.Ejercicio_2_clase_8.DTO.ServicioDTO;
import com.example.Ejercicio_2_clase_8.Model.Paciente;
import com.example.Ejercicio_2_clase_8.Model.Servicio;
import com.example.Ejercicio_2_clase_8.Repository.PacienteRepository;
import com.example.Ejercicio_2_clase_8.Repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioService implements IServicioService{

    @Autowired
    private ServicioRepository servicioRepository;

    @Override
    public List<Servicio> getServicios() {
        return servicioRepository.findAll();
    }

    @Override
    public Servicio findServicioById(Long id) {
        return servicioRepository.findById(id).orElse(null);
    }

    @Override
    public ServicioDTO findServicio(Long id) {

        Servicio servicio = servicioRepository.findById(id).orElse(null);
        ServicioDTO servicioDTO = new ServicioDTO();
        assert servicio != null : "Servicio no encontrado";
        servicioDTO.setId_paciente(servicio.getId_paciente());
        servicioDTO.setTipo_servicio(servicio.getTipo_servicio());
        servicioDTO.setFecha(servicio.getFecha());
        servicioDTO.setPrecio(servicio.getPrecio());

        return servicioDTO;
    }

    @Override
    public void saveServicio(Servicio servicio) {
        servicioRepository.save(servicio);
    }

    @Override
    public void deleteServicio(Long id) {
        servicioRepository.deleteById(id);
    }
}

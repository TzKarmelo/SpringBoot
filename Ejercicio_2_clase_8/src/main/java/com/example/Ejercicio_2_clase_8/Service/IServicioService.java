package com.example.Ejercicio_2_clase_8.Service;

import com.example.Ejercicio_2_clase_8.DTO.ServicioDTO;
import com.example.Ejercicio_2_clase_8.Model.Servicio;

import java.util.List;

public interface IServicioService {

    public List<Servicio> getServicios();
    public Servicio findServicioById(Long id);
    public ServicioDTO findServicio(Long id);
    public void saveServicio(Servicio servicio);
    public void deleteServicio(Long id);

}

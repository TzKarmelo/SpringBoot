package com.example.Ejercicio_2_clase_8.Controller;

import com.example.Ejercicio_2_clase_8.DTO.ServicioDTO;
import com.example.Ejercicio_2_clase_8.Model.Servicio;
import com.example.Ejercicio_2_clase_8.Service.ServicioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicios")
public class ServicioController {

    ServicioService servicioService = new ServicioService();

    @PostMapping("/agregar")
    public String agregarServicio(Servicio servicio){
        servicioService.saveServicio(servicio);
        return "Servicio agregado";
    }

    @GetMapping("/lista")
    public List<Servicio> listarServicios(){
        return servicioService.getServicios();
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarServicio(@PathVariable Long id){
        servicioService.deleteServicio(id);
        return "Servicio eliminado";
    }

    @GetMapping("/buscar/{id}")
    public ServicioDTO buscarServicio(@PathVariable Long id){
        return servicioService.findServicio(id);
    }

    @PutMapping("/editar/{id}")
    public Servicio editarServicio(@PathVariable Long id,
                                   @RequestParam("id_paciente") Long id_pacienteModif,
                                   @RequestParam("tipo_servicio") String tipo_servicioModif,
                                   @RequestParam("fecha") String fechaModif,
                                   @RequestParam("precio") Double precioModif) {
        Servicio servicio = servicioService.findServicioById(id);
        servicio.setId_paciente(id_pacienteModif);
        servicio.setTipo_servicio(tipo_servicioModif);
        servicio.setFecha(fechaModif);
        servicio.setPrecio(precioModif);

        servicioService.saveServicio(servicio);

        return servicio;
    }

}

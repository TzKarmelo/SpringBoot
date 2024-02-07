package com.example.Ejercicio_2_clase_8.Controller;

import com.example.Ejercicio_2_clase_8.Model.Paciente;
import com.example.Ejercicio_2_clase_8.Service.PacienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    PacienteService pacienteService = new PacienteService();

    @PostMapping("/registrar")
    public String registrarPaciente(Paciente paciente){
        pacienteService.savePaciente(paciente);
        return "Paciente registrado con éxito";
    }

    @GetMapping("/lista")
    public List<Paciente> listarPacientes(){
        return pacienteService.getPacientes();
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarPaciente(@PathVariable Long id){
        pacienteService.deletePaciente(id);
        return "Paciente eliminado con éxito";
    }

    @GetMapping("/buscar/{id}")
    public Paciente buscarPaciente(@PathVariable Long id){
        return pacienteService.findPaciente(id);
    }

    @PutMapping("/editar/{id}")
    public Paciente editarPaciente(@PathVariable Long id,
                                   @RequestParam("nombre") String nombreModif,
                                   @RequestParam("nombre_duenio") String nombreDuenioModif,
                                   @RequestParam("especie") String especieModif,
                                   @RequestParam("edad") Integer edadModif) {
        Paciente paciente = pacienteService.findPaciente(id);
        paciente.setNombre(nombreModif);
        paciente.setNombre_duenio(nombreDuenioModif);
        paciente.setEspecie(especieModif);
        paciente.setEdad(edadModif);

        pacienteService.savePaciente(paciente);

        return paciente;
    }


}

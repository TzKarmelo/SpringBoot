package com.example.Ejercicio_2_clase_8.Service;

import com.example.Ejercicio_2_clase_8.Model.Paciente;
import com.example.Ejercicio_2_clase_8.Repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacienteService implements IPacienteService{

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public List<Paciente> getPacientes() {
        return pacienteRepository.findAll();
    }

    @Override
    public Paciente findPaciente(Long id) {
        return pacienteRepository.findById(id).orElse(null);
    }

    @Override
    public void savePaciente(Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    @Override
    public void deletePaciente(Long id) {
        pacienteRepository.deleteById(id);

    }
}

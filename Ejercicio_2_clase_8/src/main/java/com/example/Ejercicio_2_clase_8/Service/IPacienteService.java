package com.example.Ejercicio_2_clase_8.Service;

import com.example.Ejercicio_2_clase_8.Model.Paciente;

import java.util.List;

public interface IPacienteService {
    public List<Paciente> getPacientes();
    public Paciente findPaciente(Long id);
    public void savePaciente(Paciente paciente);
    public void deletePaciente(Long id);
}

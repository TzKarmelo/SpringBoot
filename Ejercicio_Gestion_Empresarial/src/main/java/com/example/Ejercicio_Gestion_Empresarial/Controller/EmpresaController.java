package com.example.Ejercicio_Gestion_Empresarial.Controller;

import com.example.Ejercicio_Gestion_Empresarial.Model.Empresa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class EmpresaController {

    List<Empresa> empresas = new ArrayList<>();

    @PostMapping("/empresa")
    public String crearEmpresa(@RequestBody Empresa empresa) {
        empresas.add(empresa);
        return "Empresa creada" + empresa.toString();
    }

    @GetMapping("/empresas")
    public List<Empresa> getEmpresas() {
        return empresas;
    }

    @GetMapping("/empresa/{id}")
    public String getEmpresa(@PathVariable Long id) {
        Optional<Empresa> empresaOptional = empresas.stream()
                .filter(empresa -> empresa.getId() == id)
                .findFirst();

        return empresaOptional.map(Empresa::toString)
                .orElse("No se encontró la empresa");
    }

    @GetMapping("/empresa/{id}/empleados")
    public String getEmpleados(@PathVariable Long id) {
        Optional<Empresa> empresaOptional = empresas.stream()
                .filter(empresa -> empresa.getId() == id)
                .findFirst();

        return empresaOptional.map(empresa -> empresa.getEmpleados().toString())
                .orElse("No se encontró la empresa");
    }

}

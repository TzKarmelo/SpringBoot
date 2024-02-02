package com.example.Ejercicio_Repostera.Controller;

import com.example.Ejercicio_Repostera.DTO.PlatosDTO;
import com.example.Ejercicio_Repostera.Model.Ingredientes;
import com.example.Ejercicio_Repostera.Model.Platos;
import com.example.Ejercicio_Repostera.Service.PlatosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlatosController {

    PlatosService platosService = new PlatosService();

    @GetMapping("/platos/{id}")
    @ResponseBody
    public PlatosDTO devolverPlato(@PathVariable Long id) {

        return platosService.devolverPlato(id);
    }
}

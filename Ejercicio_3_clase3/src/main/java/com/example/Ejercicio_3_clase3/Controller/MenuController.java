package com.example.Ejercicio_3_clase3.Controller;

import com.example.Ejercicio_3_clase3.Model.Plato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MenuController {

    List<Plato> menu = new ArrayList<>();

    @PostMapping("/menu/agregar")
    public String agregarPlato(@RequestBody Plato plato) {
        menu.add(plato);
        return "Plato agregado: " + plato.toString();
    }

    @GetMapping("/menu")
    public List<Plato> getMenu() {
        return menu;
    }

}

package com.example.demo.controllers;

import com.example.demo.models.Proveedor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProveedorController {

    Proveedor proveedor = new Proveedor("Javier", "Espinosa", "Espinosa S.A.");
    Proveedor proveedor2 = new Proveedor("Jose", "Gomez", "Gomez S.A.");
    Proveedor proveedor3 = new Proveedor("Pedro", "Gonzalez", "Gonzalez S.A.");
    @GetMapping("/proveedor")
    public List<Proveedor> obtenerTodos() {
        List<Proveedor> proveedores = List.of(proveedor, proveedor2, proveedor3);
        return proveedores;
    }
}

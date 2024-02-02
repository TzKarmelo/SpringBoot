package com.example.Ejercicio_1_clase3.Controller;

import com.example.Ejercicio_1_clase3.Model.Producto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductoController {

    @PostMapping("/productos")
    public String crearProducto(@RequestBody Producto nuevoProducto){
        return "Producto creado: " + nuevoProducto.getNombre();
    }
}

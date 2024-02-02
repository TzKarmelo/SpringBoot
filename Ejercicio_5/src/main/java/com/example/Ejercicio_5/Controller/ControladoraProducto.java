package com.example.Ejercicio_5.Controller;

import com.example.Ejercicio_5.Model.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControladoraProducto {

    @GetMapping("/producto/{Id}")
    public String producto(@PathVariable int Id) {

        List<Producto> productos = List.of(
                new Producto(1, "Producto 1"),
                new Producto(2, "Producto 2"),
                new Producto(3, "Producto 3"),
                new Producto(4, "Producto 4"),
                new Producto(5, "Producto 5"),
                new Producto(6, "Producto 6"),
                new Producto(7, "Producto 7"),
                new Producto(8, "Producto 8"),
                new Producto(9, "Producto 9"),
                new Producto(10, "Producto 10")
        );

        return productos.stream()
                .filter(producto -> producto.getId() == Id)
                .findFirst()
                .map(producto -> "El producto con id " + Id + " es " + producto.getNombre())
                .orElse("No existe el producto con id " + Id);

    }
}

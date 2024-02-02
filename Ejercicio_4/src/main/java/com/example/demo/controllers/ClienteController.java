package com.example.demo.controllers;

import com.example.demo.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ClienteController {

    Cliente cliente = new Cliente("Jaime", "Gonzalez");
    Cliente cliente2 = new Cliente("Jordi", "Martinez");
    @GetMapping("/clientes")
    public List<Cliente> obtenerTodos() {
        List<Cliente> cliente = List.of(this.cliente, cliente2);
        return cliente;
    }
}

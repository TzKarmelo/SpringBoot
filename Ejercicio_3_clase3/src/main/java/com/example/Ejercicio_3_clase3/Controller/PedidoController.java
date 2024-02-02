package com.example.Ejercicio_3_clase3.Controller;

import com.example.Ejercicio_3_clase3.Model.Pedido;
import com.example.Ejercicio_3_clase3.Model.Plato;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PedidoController {

    List<Pedido> pedidos = new ArrayList<>();

    @PostMapping("/pedido")
    public String crearPedido(@RequestBody Pedido pedido) {
        pedidos.add(pedido);
        return "Pedido creado" + pedido.toString();
    }

    @GetMapping("/pedido/{id}")
    public String getPedido(@PathVariable int id) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == id) {
                return pedido.toString();
            }
        }
        return "No se encontró el pedido";
    }

}

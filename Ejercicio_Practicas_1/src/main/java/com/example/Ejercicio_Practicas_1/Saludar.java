package com.example.Ejercicio_Practicas_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludar {

    @GetMapping("/saludar1")
    public String Saludar(@RequestParam String nombre) {
        return "Hola Mundo " + nombre + "!";
    }
    @GetMapping("/saludar2")
    public String Saludar(@RequestParam String nombre, @RequestParam int edad) {
        return "Hola Mundo " + nombre + " de " + edad + " años de edad.";
    }
    @GetMapping("/saludar3")
    public String Saludar(@RequestParam String nombre, @RequestParam int edad, @RequestParam String profesion) {
        return "Hola Mundo " + nombre + " de " + edad + " años de edad, que trabaja como " + profesion + "!";
    }
}

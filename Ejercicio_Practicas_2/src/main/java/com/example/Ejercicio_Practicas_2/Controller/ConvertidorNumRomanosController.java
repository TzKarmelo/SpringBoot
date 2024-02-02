package com.example.Ejercicio_Practicas_2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertidorNumRomanosController {

    @GetMapping("/convertir/{numeroDecimal}")
    public String convertirANumeroRomano(@PathVariable int numeroDecimal) {
        if (numeroDecimal < 1 || numeroDecimal > 1000) {
            return "El número debe estar entre 1 y 1000";
        }
        String numeroRomano = convertirNumeroRomano(numeroDecimal);
        return "El número " + numeroDecimal + " en romano es " + numeroRomano;
    }

    private String convertirNumeroRomano(int numero) {

        int[] valoresDecimales = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] valoresRomanos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder resultado = new StringBuilder();

        int indice = 0;

        while (numero > 0) {
            if (numero >= valoresDecimales[indice]) {
                resultado.append(valoresRomanos[indice]);
                numero -= valoresDecimales[indice];
            } else {
                indice++;
            }
        }

        return resultado.toString();
    }
}

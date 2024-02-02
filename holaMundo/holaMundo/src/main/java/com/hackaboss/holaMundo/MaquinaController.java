package com.hackaboss.holaMundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaquinaController {

    @GetMapping
    public String realizarSorteo() {

        //10 nums aleatorios entre 0 y 100

        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }
        return "Los numeros son: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2] + ", " + numeros[3] + ", " + numeros[4] + ", " + numeros[5] + ", " + numeros[6] + ", " + numeros[7] + ", " + numeros[8] + ", " + numeros[9];

    }

    @GetMapping("/sorteo")
    public String realizarSorteo1() {

        //10 nums aleatorios entre 0 y 100

        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }
        return "Los numeros del segundo sorteo son: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2] + ", " + numeros[3] + ", " + numeros[4] + ", " + numeros[5] + ", " + numeros[6] + ", " + numeros[7] + ", " + numeros[8] + ", " + numeros[9];

    }
}
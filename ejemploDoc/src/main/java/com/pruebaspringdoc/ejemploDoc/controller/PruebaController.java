package com.pruebaspringdoc.ejemploDoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/documentation")
public class PruebaController {

    @GetMapping("/get")
    public String ejemploGet() {

        return "Prueba get";
    }

    @PostMapping("/post")
    public String ejemploPost() {

        return "Prueba post";
    }


}

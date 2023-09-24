package com.example.Desafio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/saludo")
public class Saludocontroller {
    @GetMapping ("/hello")
public String hello() {
        return "Hola mundo!";
    }
    @PostMapping("/goodbye")
    public String goodbye() {
        return "Adios, Hasta luego!";
    }
}



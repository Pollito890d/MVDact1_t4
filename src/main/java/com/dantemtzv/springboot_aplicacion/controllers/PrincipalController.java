package com.dantemtzv.springboot_aplicacion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class PrincipalController {
    @GetMapping("/proyecto")
    public String getNombre() {
        return "Proyecto de Dante Martínez Villalobos alias Pollito890d";
    }
    
}

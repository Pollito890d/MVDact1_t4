package com.dantemtzv.springboot_aplicacion.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class TecnologiasController {
    @GetMapping("/tecnologias")

    public Map<String,Object> getTecnologias() {
        Map<String,Object> respuesta = new HashMap<>();
        respuesta.put("tecnologias", Arrays.asList("Java", "Spring Boot", "MySQL", "HTML","CSS","JavaScript"));
        return respuesta;
    }
}

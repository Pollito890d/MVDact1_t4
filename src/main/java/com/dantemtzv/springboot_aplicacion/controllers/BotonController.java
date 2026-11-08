package com.dantemtzv.springboot_aplicacion.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class BotonController {
    @GetMapping("/boton")

    public Map<String,Object> BateriaBotones() {
        Map<String,Object> respuesta = new HashMap<>();
        respuesta.put("Boton Mesa 1","100");
        respuesta.put("Boton Mesa 2","80");
        respuesta.put("Boton Mesa 3","95");
        respuesta.put("Boton Mesa 4","10");
        respuesta.put("Boton Mesa 5","40");
        respuesta.put("Boton Mesa 6","60");
        respuesta.put("Boton Mesa 7","70");
        respuesta.put("Boton Mesa 8","50");
        respuesta.put("Boton Mesa 9","25");
        return respuesta;
    }
}

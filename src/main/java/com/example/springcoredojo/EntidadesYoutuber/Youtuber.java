package com.example.springcoredojo.EntidadesYoutuber;

import org.springframework.stereotype.Component;

@Component
public class Youtuber {
    private String nombre = "Yoss";

    public String getNombre() {
        return nombre;
    }
}

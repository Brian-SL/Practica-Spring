package com.example.springcoredojo.entidades;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Usuario.class)
public class Config {

    @Bean
    public Alumno getAlumno(){return new Alumno("Brian", "Segura", 22);}
}

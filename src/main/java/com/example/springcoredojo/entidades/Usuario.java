package com.example.springcoredojo.entidades;

import org.springframework.stereotype.Component;

@Component
public class Usuario {
    private Alumno alumno;

    public Usuario(Alumno alumno) {
        this.alumno = alumno;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "alumno=" + alumno +
                '}';
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}

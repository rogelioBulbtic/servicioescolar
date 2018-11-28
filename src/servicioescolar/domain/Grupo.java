/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.domain;

import java.util.List;

/**
 *
 * @author Bulbtic
 */
public class Grupo {
    private Semestre semestre;
    private String nombre;
    private byte maximoAlumnos;
    private byte numeroAlumnos;
    private List<Alumno> alumnos;

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getMaximoAlumnos() {
        return maximoAlumnos;
    }

    public void setMaximoAlumnos(byte maximoAlumnos) {
        this.maximoAlumnos = maximoAlumnos;
    }

    public byte getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNumeroAlumnos(byte numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
}

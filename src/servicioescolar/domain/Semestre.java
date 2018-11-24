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
public class Semestre {
    private String nombre;
    private List<Materia> materias;
    private List<Parcial> parciales;
    private float calificacion;
    
    

    public Semestre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public List<Parcial> getParciales() {
        return parciales;
    }

    public void setParciales(List<Parcial> parciales) {
        this.parciales = parciales;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.domain;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Bulbtic
 */
public class Alumno extends Persona{
    private PlanEstudio planEstudio;
    private boolean inscrito;
    private String matricula;

    public PlanEstudio getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(PlanEstudio planEstudio) {
        this.planEstudio = planEstudio;
    }

    public boolean isInscrito() {
        return inscrito;
    }

    public void setInscrito(boolean inscrito) {
        this.inscrito = inscrito;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Alumno{"  + "nombre=" + nombre + 
                ", apellidos=" + apellidos + 
                ", edad=" + edad + 
                ", domicilio=" + domicilio + 
                ", fechaNacimiento=" + fechaNacimiento + 
                ", curp=" + curp + 
                ", genero=" + genero + 
                ", correo=" + correo + 
                ", planEstudio=" + planEstudio + 
                ", inscrito=" + inscrito + 
                ", matricula=" + matricula + '}';
    }
    
    
} 
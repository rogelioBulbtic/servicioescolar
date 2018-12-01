/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.domain;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Bulbtic
 */
public class Profesor extends Persona {

    private String cedula;
    private List<Materia> materias;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + 
                ", apellidos=" + apellidos + 
                ", edad=" + edad + 
                ", domicilio=" + domicilio + 
                ", fechaNacimiento=" + fechaNacimiento + 
                ", curp=" + curp + 
                ", genero=" + genero + 
                ", correo=" + correo + 
                "cedula=" + cedula + 
                ", materias=" + materias + '}';
    }

}

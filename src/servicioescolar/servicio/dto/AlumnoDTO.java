/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.servicio.dto;

import java.time.LocalDate;
import servicioescolar.domain.Alumno;
import servicioescolar.domain.PlanEstudio;

/**
 *
 * @author Bulbtic
 */
public class AlumnoDTO {

    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private byte edad;
    private String domicilio;
    private PlanEstudio planEstudio;

    public AlumnoDTO() {
    }

    public AlumnoDTO(Alumno alumno) {
       /* this.nombres = alumno.getNombres();
        this.apellidos = alumno.getApellidos();
        this.edad = alumno.getEdad();
        this.domicilio = alumno.getDomicilio();
        this.planEstudio = alumno.getPlanEstudio();
        this.fechaNacimiento = alumno.getFechaNacimiento();*/
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public PlanEstudio getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(PlanEstudio planEstudio) {
        this.planEstudio = planEstudio;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}

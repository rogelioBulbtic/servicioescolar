/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.servicio.dto;

import java.time.LocalDate;
import servicioescolar.domain.Ficha;
import servicioescolar.domain.enums.EstadoAspiranteEnum;

/**
 *
 * @author Bulbtic
 */
public class AspiranteDTO {

    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private byte edad;
    private String domicilio;
    protected String curp;
    private String numeroFicha;
    protected char genero;
    private String correo;
    private EstadoAspiranteEnum estadoAspiranteEnum;

    public AspiranteDTO() {
    }

    public AspiranteDTO(Ficha ficha) {
        this.nombre = ficha.getNombre();
        this.apellidos = ficha.getApellidos();
        this.fechaNacimiento = ficha.getFechaNacimiento();
        this.edad = ficha.getEdad();
        this.domicilio = ficha.getDomicilio();
        this.curp = ficha.getCurp();
        this.numeroFicha = ficha.getNumero();
        this.genero = ficha.getGenero();
        this.correo = ficha.getCorreo();
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public String getNumeroFicha() {
        return numeroFicha;
    }

    public void setNumeroFicha(String numeroFicha) {
        this.numeroFicha = numeroFicha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public EstadoAspiranteEnum getEstadoAspiranteEnum() {
        return estadoAspiranteEnum;
    }

    public void setEstadoAspiranteEnum(EstadoAspiranteEnum estadoAspiranteEnum) {
        this.estadoAspiranteEnum = estadoAspiranteEnum;
    }

    @Override
    public String toString() {
        return "AspiranteDTO{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + ", domicilio=" + domicilio + ", curp=" + curp + ", numeroFicha=" + numeroFicha + ", genero=" + genero + ", correo=" + correo + ", estadoAspiranteEnum=" + estadoAspiranteEnum + '}';
    }
    
    
    
}

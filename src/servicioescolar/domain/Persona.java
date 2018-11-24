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
public abstract class Persona extends Object{
    
    protected String nombre;
    protected String apellidos;
    protected byte edad;
    protected String domicilio;
    protected LocalDate fechaNacimiento;
    protected String curp;
    protected char genero;
    
    public Persona(String nombre,String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public Persona(){
    
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
    
    public abstract void comprar(String producto);

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", domicilio=" + domicilio + ", fechaNacimiento=" + fechaNacimiento + ", curp=" + curp + ", genero=" + genero + '}';
    }
    
    
}

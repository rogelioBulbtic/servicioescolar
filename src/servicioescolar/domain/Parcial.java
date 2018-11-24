/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.domain;

/**
 *
 * @author Bulbtic
 */
public class Parcial {
    
    private byte numero;
    private float calificacion;

    public Parcial(byte numero) {
        this.numero = numero;
    }
    
    

    public byte getNumero() {
        return numero;
    }

    public void setNumero(byte numero) {
        this.numero = numero;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
    
}

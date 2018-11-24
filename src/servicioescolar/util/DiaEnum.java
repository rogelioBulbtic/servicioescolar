/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.util;

/**
 *
 * @author Bulbtic
 */
public enum DiaEnum {
    LUNES_ENUM(1),MARTES_ENUM(2),MIERCOLES_ENUM(3),JUEVES_ENUM(4),VIERNES_ENUM(5),SABADO_ENUM(6),DOMINGO_ENUM(7);

    private int dia;
    
    private DiaEnum(int dia){
        this.dia = dia;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.servicio;

/**
 *
 * @author Bulbtic
 */
public interface InscripcionService {
    public String inscribir(String materia, Integer cantidad);
    public default void pagar(Integer cantidad){
        System.out.println("Voy a pagar la cantidad de  " + cantidad);
    }
}

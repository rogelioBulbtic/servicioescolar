/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.servicio;

import servicioescolar.domain.Carrera;
import servicioescolar.servicio.dto.AlumnoDTO;
import servicioescolar.servicio.dto.AspiranteDTO;

/**
 *
 * @author Bulbtic
 */
public interface AlumnoService {

    AlumnoDTO inscribir(AspiranteDTO aspiranteDTO, Carrera carrera);
    
    default void respirar(){
        System.out.println("Estoy respirando por la nariz");
    }

}

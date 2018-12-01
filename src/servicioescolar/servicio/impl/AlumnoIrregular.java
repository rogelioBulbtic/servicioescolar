/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.servicio.impl;

import servicioescolar.domain.Alumno;
import servicioescolar.domain.Carrera;
import servicioescolar.servicio.AlumnoService;
import servicioescolar.servicio.dto.AlumnoDTO;
import servicioescolar.servicio.dto.AspiranteDTO;

/**
 *
 * @author Bulbtic
 */
public class AlumnoIrregular implements AlumnoService {

    @Override
    public AlumnoDTO inscribir(AspiranteDTO aspiranteDTO, Carrera carrera) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.servicio.impl;

import servicioescolar.domain.Carrera;
import servicioescolar.servicio.AlumnoService;
import servicioescolar.servicio.dto.AlumnoDTO;
import servicioescolar.servicio.dto.AspiranteDTO;

/**
 *
 * @author Bulbtic
 */
public class AlumnoRegularServiceImpl implements AlumnoService{

    @Override
    public AlumnoDTO inscribir(AspiranteDTO aspiranteDTO, Carrera carrera) {
         /*Se busca un plan de estudio actual
           Se crea un nuevo alumno
           Se le asigna el plan de estudio
           Se actualiza al aspirante con el estado inscrito 
           Se registra al alumno
           */
            
           return new AlumnoDTO();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.domain;

import servicioescolar.servicio.SecretariaService;
import servicioescolar.servicio.dto.AlumnoDTO;

/**
 *
 * @author Bulbtic
 */
public abstract class Secretaria implements SecretariaService{
     @Override
    public Alumno inscribirAlumno(AlumnoDTO alumnoDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

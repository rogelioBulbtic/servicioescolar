/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.servicio.impl;

import servicioescolar.domain.Alumno;
import servicioescolar.servicio.AlumnoService;
import servicioescolar.servicio.dto.AlumnoDTO;

/**
 *
 * @author Bulbtic
 */
public class AlumnoIrregular implements AlumnoService{

    @Override
    public void pagar() {
        System.out.println("vooy a pagar");
    }

    @Override
    public Alumno inscribirAlumno(AlumnoDTO alumnoDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

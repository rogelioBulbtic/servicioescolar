/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.servicio.impl;

import servicioescolar.domain.Alumno;
import servicioescolar.domain.PlanEstudio;
import servicioescolar.servicio.AlumnoService;
import servicioescolar.servicio.PlanEstudioService;
import servicioescolar.servicio.dto.AlumnoDTO;

/**
 *
 * @author Bulbtic
 */
public class AlumnoRegularServiceImpl implements AlumnoService{

    private PlanEstudioService planEstudioService = new PlanEstudioServiceImpl();
    
    @Override
    public Alumno inscribirAlumno(AlumnoDTO alumnoDTO) {
        Alumno alumno = new Alumno();
        alumno.setApellidos(alumnoDTO.getApellidos());
        alumno.setDomicilio(alumnoDTO.getDomicilio());
        alumno.setEdad(alumnoDTO.getEdad());
        alumno.setNombre(alumnoDTO.getNombres());
        
        PlanEstudio planEstudio = planEstudioService.generarPlanEstudio();
        alumno.setPlanEstudio(planEstudio);
        
        return alumno;
    }

    @Override
    public void pagar() {
        System.out.println("vooy a pagar");
    }

    @Override
    public Alumno reinscribirAlumno(AlumnoDTO alumnoDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

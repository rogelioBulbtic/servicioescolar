/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.servicio;

import servicioescolar.domain.Alumno;
import servicioescolar.servicio.dto.AlumnoDTO;

/**
 *
 * @author Bulbtic
 */
public interface AlumnoService {
    
    public static final int maximoAlumno = 150;
    
    public default void pagar(){
        System.out.println("Aqui se va a pagar");
    }
    
    
    Alumno inscribirAlumno(AlumnoDTO alumnoDTO);
    
    Alumno reinscribirAlumno(AlumnoDTO alumnoDTO) throws Exception;
    
    static void estudiar(){
        System.out.println("Estoy estudiando");
    }
    
}

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
public class AlumnoIrregular implements AlumnoService {

    @Override
    public void pagar() {
        System.out.println("vooy a pagar");
    }

    @Override
    public Alumno inscribirAlumno(AlumnoDTO alumnoDTO) {
        Alumno alumno = new Alumno();
        alumno
                .nombre(alumnoDTO.getNombres())
                .apellidos(alumnoDTO.getApellidos());

        Alumno alumno2 = new Alumno();
        alumno.setApellidos(alumnoDTO.getApellidos());
        alumno.setNombre(alumnoDTO.getNombres());

        return alumno;
    }

    public Integer fallaInscripcion() throws Exception {
        throw new Exception();
    }

    @Override
    public Alumno reinscribirAlumno(AlumnoDTO alumnoDTO) throws Exception {
        if (alumnoDTO.isInscrito()) {
            Alumno alumno = new Alumno();
            alumno
                    .nombre(alumnoDTO.getNombres())
                    .apellidos(alumnoDTO.getApellidos());

            Alumno alumno2 = new Alumno();
            alumno.setApellidos(alumnoDTO.getApellidos());
            alumno.setNombre(alumnoDTO.getNombres());
            System.out.println("se inscribe al alumno");
            return alumno;
        } else {
            throw new Exception();
        }
    }

}

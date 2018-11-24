/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.servicio;

import servicioescolar.domain.Alumno;
import servicioescolar.domain.Semestre;

/**
 *
 * @author Bulbtic
 */
public interface SemestreService {
    Semestre construirSemestre(String numero);
    Semestre obtenerPorAlumno(Alumno alumno);
}

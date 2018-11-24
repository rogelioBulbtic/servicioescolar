/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.servicio;

import java.util.List;
import servicioescolar.domain.Alumno;
import servicioescolar.domain.Grupo;

/**
 *
 * @author Bulbtic
 */
public interface GrupoService {

    List<Grupo> generarGrupos(List<Alumno> alumnos);
    Grupo generaGrupo(List<Alumno> alumnos);
}

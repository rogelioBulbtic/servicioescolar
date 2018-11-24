/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.servicio.impl;

import java.util.ArrayList;
import java.util.List;
import servicioescolar.domain.Alumno;
import servicioescolar.domain.Grupo;
import servicioescolar.domain.Semestre;
import servicioescolar.servicio.GrupoService;
import servicioescolar.util.GrupoUtil;

/**
 *
 * @author Bulbtic
 */
public class GrupoServiceImpl implements GrupoService{

    @Override
    public List<Grupo> generarGrupos(List<Alumno> alumnos) {
        List<Grupo> grupos = new ArrayList<>();

        if(alumnos.size() <= GrupoUtil.MAXIMO_ALUMNOS){
        }
        return grupos;
    }

    @Override
    public Grupo generaGrupo(List<Alumno> alumnos) {
        Grupo grupo = new Grupo();
        grupo.setNombre("A");
        grupo.setSemestre(new Semestre("1"));
        grupo.setNumeroAlumnos((byte)alumnos.size());
        
        return grupo;
    }
    
}

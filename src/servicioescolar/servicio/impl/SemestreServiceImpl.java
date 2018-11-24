/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.servicio.impl;

import java.util.ArrayList;
import java.util.List;
import servicioescolar.domain.Alumno;
import servicioescolar.domain.Parcial;
import servicioescolar.domain.Semestre;
import servicioescolar.servicio.SemestreService;

/**
 *
 * @author Bulbtic
 */
public class SemestreServiceImpl implements SemestreService {

    @Override
    public Semestre construirSemestre(String numero) {
        List<Parcial> parciales = new ArrayList<>();
        parciales.add(new Parcial((byte) 1));
        parciales.add(new Parcial((byte) 2));
        parciales.add(new Parcial((byte) 3));
        
        Semestre semestre = new Semestre(numero);
        semestre.setParciales(parciales);
        return semestre;
    }

    @Override
    public Semestre obtenerPorAlumno(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

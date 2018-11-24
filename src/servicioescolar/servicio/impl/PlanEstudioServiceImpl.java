/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.servicio.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import servicioescolar.domain.PlanEstudio;
import servicioescolar.domain.Semestre;
import servicioescolar.servicio.PlanEstudioService;
import servicioescolar.servicio.SemestreService;

/**
 *
 * @author Bulbtic
 */
public class PlanEstudioServiceImpl implements PlanEstudioService {

    private SemestreService semestreService = new SemestreServiceImpl();

    @Override
    public PlanEstudio generarPlanEstudio() {
        PlanEstudio planEstudio = new PlanEstudio();
        planEstudio.setFin(LocalDate.now());
        planEstudio.setInicio(LocalDate.of(2023, 10, 29));
        planEstudio.setNombre("Plan A");
        planEstudio.setSemestres(generarSemestres());
        return planEstudio;
    }

    private List<Semestre> generarSemestres() {
        List<Semestre> semestres = new ArrayList<>();

        semestres.add(semestreService.construirSemestre("PRIMERO"));
        semestres.add(semestreService.construirSemestre("SEGUNDO"));
        semestres.add(semestreService.construirSemestre("TERCERO"));
        semestres.add(semestreService.construirSemestre("CUARTO"));
        semestres.add(semestreService.construirSemestre("QUINTO"));
        semestres.add(semestreService.construirSemestre("SEXTO"));
        semestres.add(semestreService.construirSemestre("SEPTIMO"));
        semestres.add(semestreService.construirSemestre("OCTAVO"));
        semestres.add(semestreService.construirSemestre("NOVENO"));
        semestres.add(semestreService.construirSemestre("DECIMO"));
        
        return semestres;
    }

}

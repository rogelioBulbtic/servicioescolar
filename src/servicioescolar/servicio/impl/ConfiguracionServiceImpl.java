/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.servicio.impl;

import servicioescolar.domain.LugarExamenSeleccion;
import servicioescolar.repository.LugarExamenSeleccionRepository;
import servicioescolar.servicio.ConfiguracionService;

/**
 *
 * @author Bulbtic
 */
public class ConfiguracionServiceImpl implements ConfiguracionService{

    private LugarExamenSeleccionRepository lugarExamenSeleccionRepository = LugarExamenSeleccionRepository.Instance();
    
    @Override
    public void crearLugarExamenSeleccion(LugarExamenSeleccion lugarExamenSeleccion) {
        

    }
    
}

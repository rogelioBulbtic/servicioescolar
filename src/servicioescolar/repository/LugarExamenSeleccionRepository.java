/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.repository;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bulbtic
 */
public class LugarExamenSeleccionRepository {

    private List<LugarExamenSeleccionRepository> lugares;

    private static LugarExamenSeleccionRepository _repository = null;

    private LugarExamenSeleccionRepository() {
        lugares = new ArrayList<>();
    }

    public static LugarExamenSeleccionRepository Instance() {
        if (_repository == null) {
            _repository = new LugarExamenSeleccionRepository();
        }
        return _repository;
    }
}

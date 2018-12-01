/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.repository;

import java.util.ArrayList;
import java.util.List;
import servicioescolar.domain.Ficha;

/**
 *
 * @author Bulbtic
 */
public class FichaRepository {
    private List<Ficha> fichas;
    
    private static FichaRepository _repository = null;
    
    private FichaRepository(){
       fichas = new ArrayList<>();
    }
    
    public static FichaRepository Instance(){
        if(_repository == null)
            _repository = new FichaRepository();
        return _repository;
    }

    public List<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }

    public int obtenerUltimoFolio() {
        return fichas.size();
    }

    
}

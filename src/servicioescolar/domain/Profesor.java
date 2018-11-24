/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.domain;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Bulbtic
 */
public class Profesor extends Persona{

    private String cedula;
    private List<Materia> materias;

    public Profesor(String cedula, List<Materia> materias, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.cedula = cedula;
        this.materias = materias;
    }

    public Profesor() {
    }
    
    public void comprar(String producto){
        System.out.println("Estoy comprando con el 20% de descuento el producto de" + producto);
    }
    
    public void calificarExamenes(){
        System.out.println("Estoy calificando los examenes");
    
    }

}

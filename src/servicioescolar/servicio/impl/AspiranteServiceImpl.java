/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.servicio.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import servicioescolar.domain.Ficha;
import servicioescolar.domain.enums.EstadoFichaEnum;
import servicioescolar.repository.FichaRepository;
import servicioescolar.servicio.AspiranteService;
import servicioescolar.servicio.dto.AspiranteDTO;

/**
 *
 * @author Bulbtic
 */
public class AspiranteServiceImpl implements AspiranteService {

    private FichaRepository fichaRepository = FichaRepository.Instance();
    
    @Override
    public AspiranteDTO solicitarFicha(AspiranteDTO aspiranteDTO) {
        Ficha ficha = new Ficha();
        ficha.setApellidos(aspiranteDTO.getApellidos());
        ficha.setCorreo(aspiranteDTO.getCorreo());
        ficha.setCurp(aspiranteDTO.getCurp());
        ficha.setDomicilio(aspiranteDTO.getDomicilio());
        ficha.setEdad(aspiranteDTO.getEdad());
        ficha.setFechaNacimiento(aspiranteDTO.getFechaNacimiento());
        ficha.setGenero(aspiranteDTO.getGenero());
        ficha.setNombre(aspiranteDTO.getNombre());
        ficha.setNumero(generarFolio());
        ficha.setEstado(EstadoFichaEnum.SOLICITUD);
        //guardamos en la base de datos
        fichaRepository.getFichas().add(ficha);
        return new AspiranteDTO(ficha);
    }

    @Override
    public List<AspiranteDTO> obtenerTodos() {
        List<Ficha> fichas = fichaRepository.getFichas();

        List<AspiranteDTO> aspirantes = fichas.stream()
                .map(ficha -> {
                    AspiranteDTO aspiranteDTO = new AspiranteDTO(ficha);
                    return aspiranteDTO;
                }).collect(Collectors.toList());
        
        return aspirantes;
    }

    @Override
    public AspiranteDTO actualizar(AspiranteDTO aspiranteDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String generarFolio(){
        int nuevoFolio = fichaRepository.obtenerUltimoFolio();
        return String.valueOf(nuevoFolio);
    }

    @Override
    public AspiranteDTO obtenerPorIndex(int index) {
        List<Ficha> fichas = fichaRepository.getFichas();
        AspiranteDTO aspiranteDTO = new AspiranteDTO();
       
        try{
            System.out.println(fichas.get(index));
        }catch(Exception e){
            aspiranteDTO.setNombre("Pedro");
            return aspiranteDTO;
        }
        finally{
            aspiranteDTO.setNombre("Pablo");
            return aspiranteDTO;
        }
        
    }

}

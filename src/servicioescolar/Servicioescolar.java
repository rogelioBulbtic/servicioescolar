/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import servicioescolar.domain.Alumno;
import servicioescolar.servicio.AlumnoService;
import servicioescolar.servicio.dto.AlumnoDTO;
import servicioescolar.servicio.impl.AlumnoRegularServiceImpl;
import static servicioescolar.util.AlumnoUtil.NOMBRES;
import static servicioescolar.util.AlumnoUtil.PRIMEROS_APELLIDOS;
import static servicioescolar.util.AlumnoUtil.SEGUNDOS_APELLIDOS;
import servicioescolar.util.DiaUtil;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import servicioescolar.domain.Grupo;
import servicioescolar.domain.Persona;
import servicioescolar.domain.Profesor;
import servicioescolar.servicio.GrupoService;
import servicioescolar.servicio.InscripcionService;
import servicioescolar.servicio.excepciones.InscribirAlumnoException;
import servicioescolar.servicio.excepciones.InscribirAlumnoPorDocumentosException;
import servicioescolar.servicio.impl.AlumnoIrregular;
import servicioescolar.servicio.impl.GrupoServiceImpl;
import servicioescolar.util.DiaEnum;
import servicioescolar.util.DiaNumericoUtil;

/**
 *
 * @author Bulbtic
 */
public class Servicioescolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
        InscripcionService inscripcion = (materia, cantidad) -> {System.out.println("Me estoy inscribiendo");
                                                                return "Orden de pago por la cantidad de " + cantidad + " por la materia de " + materia;
                                                                };
        
        String ordenPago = inscripcion.inscribir("Programación Orientada a Objetos", 100);
        System.out.println(ordenPago);*/

 /*AlumnoIrregular alumnoService = new AlumnoIrregular();
        
        try {
            alumnoService.fallaInscripcion();
        }catch (Exception e) {
            System.out.println("No se puede inscribir al alumno, por que debe materia, validar con el jefe de carrera");
        }*/
        List<Alumno> alumnosBaja = generaAlumnos();

        /*try{
                Grupo grupo = new Grupo();
                grupo.setAlumnos(alumnos);
        }catch(Exception e){
            
        }*/
        /*Grupo grupo = new Grupo();
        grupo.setAlumnos(alumnos);
        GrupoService grupoService = new GrupoServiceImpl();

        try {
            Alumno alumno = grupoService.obtenerAlumnoPorIndex(grupo, 101);
            System.out.println(alumno);
        } catch (Exception exception) {
            System.out.println("el alumno se ha dado de baja");
        }

        System.out.println("Seguimos con el flujo normal");*/
        
        AlumnoDTO alumnoDTO = new AlumnoDTO();
        alumnoDTO.setApellidos("Perez León");
        alumnoDTO.setNombres("Juan");
        AlumnoService alumnoService = new AlumnoIrregular();
        try{
            alumnoService.reinscribirAlumno(alumnoDTO);
            
            
        }catch(Exception e){
            System.out.println("El alumno no se a inscrito a esta universidad");
            
            try{
            alumnosBaja.get(101);
            }catch(Exception ex){
                System.out.println("El alumno tampoco fue de dado de baja");
            }
        }

    }

    public static void iniciarAlumno() {
        AlumnoService alumnoService = new AlumnoRegularServiceImpl();
        System.out.println("Bienvenido al Sistema Escolar de BULtic");
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del alumno");
        String nombre = sc.nextLine();
        System.out.println("Introduce los apellidos del alumno");
        String apellidos = sc.nextLine();
        System.out.println("Introduce la fecha de nacimiento del alumno empezando con dia, mes y año");
        int diaNacimiento = sc.nextInt();
        int mesNacimiento = sc.nextInt();
        int anioNacimiento = sc.nextInt();
        System.out.println("Introduce el domicilio del alumno");
        String domicillio = sc.nextLine();

        AlumnoDTO alumnoDTO = new AlumnoDTO();
        alumnoDTO.setApellidos(apellidos);
        alumnoDTO.setDomicilio(domicillio);
        alumnoDTO.setFechaNacimiento(LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento));

        Alumno alumno = alumnoService.inscribirAlumno(alumnoDTO);
        System.out.println("Se ha creado un alumno " + alumno);
        return;
    }

    public static List<Alumno> generaAlumnos() {

        List<Alumno> alumnos = new ArrayList<>();

        int i = 0;
        while (i < 100) {
            Alumno alumno = new Alumno();
            alumno.setApellidos(PRIMEROS_APELLIDOS.get(i) + " " + SEGUNDOS_APELLIDOS.get(i));
            alumno.setNombre(NOMBRES.get(i));
            alumnos.add(alumno);
            i++;
        }
        return alumnos;
    }

    /*
    public static List<Alumno> generaAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        /*System.out.println("nombres" + AlumnoUtil.nombres.size());
        System.out.println("Primer apellido" + AlumnoUtil.primerosApellidos.size());
        System.out.println("Segundo Apellidos" + AlumnoUtil.segundosApellidos.size());
        int i = 0;
        while(i<100){
            Alumno alumno = new Alumno();
            alumno.setApellidos(AlumnoUtil.primerosApellidos.get(i) + " " + AlumnoUtil.segundosApellidos.get(i));
            alumno.setNombres(AlumnoUtil.nombres.get(i));
            i++;
            /*
            if(AlumnoUtil.nombres.get(i) == "ROBERTO"){
                continue ;
            }*
            alumnos.add(alumno);
        }
        
        
        
        /*
        int j=0;
        do{
            Alumno alumno = new Alumno();
            alumno.setApellidos(AlumnoUtil.primerosApellidos.get(j) + " " + AlumnoUtil.segundosApellidos.get(j));
            alumno.setNombres(AlumnoUtil.nombres.get(j));
            alumnos.add(alumno);
            j++;
        }while(j<0);*/
 /*for (int i = 0; i < 2; i++) {
            Alumno alumno = new Alumno();
            alumno.setApellidos(AlumnoUtil.primerosApellidos.get(i) + " " + AlumnoUtil.segundosApellidos.get(i));
            alumno.setNombres(AlumnoUtil.nombres.get(i));
            alumno.setGenero((char) 64);
            alumnos.add(alumno);
        }
        return alumnos;
    }*/
}

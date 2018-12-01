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
import servicioescolar.servicio.AspiranteService;
import servicioescolar.servicio.ConfiguracionService;
import servicioescolar.servicio.dto.AlumnoDTO;
import servicioescolar.servicio.dto.AspiranteDTO;
import servicioescolar.servicio.impl.AlumnoRegularServiceImpl;
import static servicioescolar.util.AlumnoUtil.NOMBRES;
import static servicioescolar.util.AlumnoUtil.PRIMEROS_APELLIDOS;
import static servicioescolar.util.AlumnoUtil.SEGUNDOS_APELLIDOS;
import servicioescolar.servicio.impl.AlumnoIrregular;
import servicioescolar.servicio.impl.AspiranteServiceImpl;
import servicioescolar.servicio.impl.ConfiguracionServiceImpl;

/**
 *
 * @author Bulbtic
 */
public class Servicioescolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        AspiranteService aspiranteService = new AspiranteServiceImpl();
        List<AspiranteDTO> aspirantes = new ArrayList<>();
        
        
        System.out.println("Bienvenido al Sistema Escolar de Bulbtic");
        Scanner sc = new Scanner(System.in);

        // Solicitar Ficha
        System.out.println("Introduce el nombre del alumno");
        String nombre = sc.nextLine();
        System.out.println("Introduce los apellidos del alumno");
        String apellidos = sc.nextLine();
        System.out.println("Introduce tu correo");
        String correo = sc.nextLine();
        
        AspiranteDTO aspiranteDTO = new AspiranteDTO();
        aspiranteDTO.setApellidos(apellidos);
        aspiranteDTO.setCorreo(correo);
        aspiranteDTO.setNombre(nombre);
        
        aspiranteDTO = aspiranteService.solicitarFicha(aspiranteDTO);
        aspirantes.add(aspiranteDTO);
        
        System.out.println("Alumnos inscritos");
        
        aspirantes.stream().forEach(System.out::println);
        
        //programar Examen de selección.
        
        
        
        
    }
    
    public static void programarExamenSeleccion(AspiranteDTO aspiranteDTO){
        System.out.println("Selecciona la cede");
        ConfiguracionService configuracionService = new ConfiguracionServiceImpl();
        
        
        Scanner sc = new Scanner(System.in);
        int opcion  = sc.nextInt();
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

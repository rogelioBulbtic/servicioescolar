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
import servicioescolar.domain.Persona;
import servicioescolar.domain.Profesor;
import servicioescolar.util.DiaEnum;
import servicioescolar.util.DiaNumericoUtil;

/**
 *
 * @author Bulbtic
 */
public class Servicioescolar {

    public static void arreglo() {
        int[] arreglo1 = new int[4];

        /*
        for(int i=0;i<arreglo1.length;i++){
            System.out.println(arreglo1[i]);
        }*/
        System.out.println("El tamaño del arreglo es " + arreglo1.length);

        arreglo1 = new int[10];

        System.out.println("el nuevo tamaño de nuestro arreglo es " + arreglo1.length);
    }

    public static void copiaArreglo() {

        int[] myArray = {1, 2, 3, 4, 5, 6};
        int[] hold = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.arraycopy(myArray, 0, hold, 0, myArray.length);

        for (int numero : hold) {
            System.out.println(numero);
        }

    }

    public static void ordenarArreglo() {
        String[] numeros = {"2", "9", "1", "10"};
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static void buscarElemento() {

        int[] numeros = {20, 4, 10, 8};
        //{2,4,6,8,9}

        System.out.println(Arrays.binarySearch(numeros, 2));
        System.out.println(Arrays.binarySearch(numeros, 4));
        System.out.println(Arrays.binarySearch(numeros, 1));
        System.out.println(Arrays.binarySearch(numeros, 3));
        System.out.println(Arrays.binarySearch(numeros, 9));
    }

    public static void arreglosMultidimensionales() {
        int[][] arregloMultidimensional;
        int arregloMultidimensional2[][];
        int[] arregloMultidimensional3[];
        int[] arrglo1[], arreglo2[][];

        String[][] rectangulo = new String[4][];

        //rectangulo[0] = new String[]{"Maria", "Jose"};
        int[][] diferentesTamaños = {
            {1, 4},
            {3},
            {9, 7, 8},
            {1, 2, 3,}};

        for (int[] numeros : diferentesTamaños) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.println(numeros[j]);
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        AlumnoService alumnoService = new AlumnoRegularServiceImpl();
        alumnoService.pagar();
        
        AlumnoService.estudiar();
        
        /*Persona persona;
        persona = new Persona() {
            
            @Override
            public void comprar(String producto) {
                System.out.println("Esto comprando de forma anonima un " + producto);
                pagar();
            }
            
            private void pagar(){
                System.out.println("Estoy pagando");
            }
        };
        
        persona.comprar("Refresco ");
        
        
        /*Alumno alumno = new Alumno();
        alumno.setApellidos("Perez");
        alumno.setNombre("Juan");
        
        Alumno.MateriaExtra materiaExtraAlumno = new Alumno.MateriaExtra();
        materiaExtraAlumno.setNombreMateria("Ajedrez");
        
        materiaExtraAlumno.realizar();
         alumno.inscrbir();*/
         
         
        
        
        
        
        /*DiaEnum dia = new DiaEnum(3);

        switch (dia) {
            case LUNES_ENUM:
                System.out.println("Es lunes");
                break;
            case MARTES_ENUM:
                System.out.println("Es martes");
                break;
            case MIERCOLES_ENUM:
                System.out.println("Es miercoles");
                break;
            case JUEVES_ENUM:
                System.out.println("Es jueves");
                break;
            case VIERNES_ENUM:
                System.out.println("Es viernes");
                break;
            case SABADO_ENUM:
                System.out.println("Es sabado");
                break;
            case DOMINGO_ENUM:
                System.out.println("Es domingo");
                break;
        }*/

        //Alumno alumno = new Alumno();
        //alumno.presentarExamen("Matematicas I");
        //alumno.estudiarMateria("1","2","3","4","5","6","/", "%");
        /*Alumno alumno = new Alumno();
        alumno.setNombre("Ricardo");
        System.out.println(alumno.getNombre());
        alumno.comprar("Sabrita");*/
 /*
        Alumno alumno1 = new Alumno();
        alumno1.setApellidos("Perez");
        alumno1.setNombre("Juan");
        alumno1.setMatricula("20181117-801");
        
        Alumno alumno2 = new Alumno();
        alumno2.setApellidos("Perez");
        alumno2.setNombre("Juan");
        alumno2.setMatricula("20181117-801");
        
        
        
        Alumno alumno3 = alumno1;
        alumno3.setNombre("Pablo");
        alumno3.setMatricula("20181117-802");
         
        int x = 2;
        int y = 3;
                
        System.out.println("Usando == " + (alumno1 == alumno3));
        System.out.println("Usando el metodo equals " + (alumno1.equals(alumno3)));
         */
 /*final String nombreEscuela;
        
        
        nombreEscuela = "UBSA";
                
        
        List<Persona> personas = new ArrayList<>();
        personas.add(new Alumno());
        personas.add(new Profesor());
        personas.add(new Profesor());
        personas.add(new Alumno());
        
        
        Persona alumno = new Alumno();
        Persona profesor = new Profesor();
        
        
        /*
        Alumno alumno1 = new Persona(); //No compila
        Profesor profesor2 = new Persona(); // No compila*/
 /*
        for(Persona persona : personas){
            persona.comprar("Galleta");
            if(persona instanceof Alumno){
                System.out.println("Soy un alumno");
                ((Alumno) persona).resolverExamen();
            }
            if(persona instanceof Profesor){
                System.out.println("Soy un profesor");
                ((Profesor) persona).calificarExamenes();
            }
        }
        
        Alumno alumnoCast = new Alumno();
        alumnoCast.setNombre("Juan");
        alumnoCast.setApellidos("Perez");
        alumnoCast.setMatricula("20181112-801");
        
        
        
        Object alumnoObject = alumnoCast;
        Persona alumnoPersona = alumnoCast;
        Alumno alumnoCast2 = (Alumno)  alumnoPersona;
        Profesor profesor2 = new Profesor();
        
        
        Persona personaToAlumno = (Persona) alumnoCast;
        profesor = personaToAlumno;
        
        System.out.println("Esta es la matricula del alumno " + profesor.getNombre());*/
        //alumno.estudiar(" "," ","        ", "","","");
        //alumno.acreditar(123L);
        //alumno.estudiarMateria("Algebra Lineal");
        //alumno.estudiarMateria(54);
        //alumno.setEdad((byte)18);
        //alumno.estudiarMateria(0);
        //alumno.estudiarMateria(new String[]{"1","2","3"});
        //alumno.estudiarMateria("1","2","3");
        /*System.out.println("Veces intentado hasta la fecha" + alumno.numeroIntentos);
        System.out.println("veces intentos static " +  Alumno.numeroIntentos);
        
        
        alumno = null;
        
        System.out.println("Veces intentado hasta la fecha con null " + alumno.numeroIntentos);
        System.out.println("veces intentos static con null " +  Alumno.numeroIntentos);*/
        //ordenarArreglo();
        //buscarElemento();
        //arreglosMultidimensionales();
        //arreglo();
        //copiaArreglo();
        /*Alumno alumno1 = new Alumno();
        alumno1.setEdad((byte)1588);
        
        int edad =  alumno1.getEdad();
        
        
        System.out.println(edad);

        int hora = 20;*/
 /*String diaSemana = "Lunes";
        
        switch (diaSemana) {
            case DiaUtil.DIA_LUNES:
            case DiaUtil.DIA_MARTES:
                System.out.println("Es lunes o Es Martes");
                break;
            case DiaUtil.DIA_MIERCOLES:
                System.out.println("Es Miercoles");
                break;
            case DiaUtil.DIA_JUEVES:
                System.out.println("Es Jueves");
                break;
            case DiaUtil.DIA_VIERNES:
                System.out.println("Es Viernes");
                break;

        }*/
 /*if(hora<12){
            System.out.println("Buenos días");
            hora++;
        }else if(hora > 18){
            System.out.println("Buenas Noches");
        }else{
            System.out.println("Buenas tardes");
        }*/
 /*if (diaSemana == DiaUtil.DIA_LUNES) {
            System.out.println("El dia es lunes");
        } else if (diaSemana == DiaUtil.DIA_MARTES) {
            System.out.println("El dia es Martes");

        } else if (diaSemana == DiaUtil.DIA_MIERCOLES) {
            System.out.println("El dia es Miercoles");

        } else if (diaSemana == DiaUtil.DIA_JUEVES) {
            System.out.println("El dia es Jueves");

        } else if (diaSemana == DiaUtil.DIA_VIERNES) {
            System.out.println("El dia es Viernes");

        }
        String saludo = (hora < 12) ? "Buenos Días" : (hora > 18 ? "Buenas noches " : "Buenas tardes");

        System.out.println(saludo);*/

 /*Alumno[] alumnos = generaAlumnos();
        System.out.println("Tenemos " +alumnos.length+ " inscrito");
        
        for(int i=0; i<alumnos.length;i++){
            System.out.println("EL nombre del alumnos es " + alumnos[i].getNombres());
            System.out.println("El apellido del alumno es " + alumnos[i].getApellidos());
            
            /*for(int j = 0; j<8;j++){
                if(j==4){
                    System.out.println("No es posible asignarle esta materia");
                    continue PRIMER_FOR;
                }
                System.out.println("Esta es mi materia numero"+ (j));
            }
        }*/
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

    public static Alumno[] generaAlumnos() {

        Alumno[] alumnos = new Alumno[100];
        /*Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        
        Alumno[] alumnos1 = {alumno1,alumno2};
        Alumno alumnos2[] = {alumno1,alumno2};*
        
        Alumno[] alumnos1, alumnos2;*/

        int i = 0;
        while (i < 100) {
            Alumno alumno = new Alumno();
            /*alumno.setApellidos(PRIMEROS_APELLIDOS.get(i) + " " + SEGUNDOS_APELLIDOS.get(i));
            alumno.setNombres(NOMBRES.get(i));*/
            alumnos[i] = alumno;
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

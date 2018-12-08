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
    
    
    public static void listar(){
        ArrayList list = new ArrayList();
        
        list.add("Han solo");
        list.add(true);
        list.add(1);
        list.add(Integer.valueOf(0));
        
        System.out.println(list);
        
        ArrayList<String> listString = new ArrayList<>();
        listString.add("chubaca");
        
        System.out.println(listString);
        
        
        List<String> nombres = new ArrayList<>();
        
        nombres.add("Jose");   //[Jose]
        nombres.add(1,"Juan"); //[Jose, Juan]
        nombres.add(0, "Pedro");  //[Pedro, Jose, Juan]
        //nombres.add(5,"Pablo"); // manda una excepción 
        
        System.out.println(nombres);
        
        // ===== boolean remove(Object object);
        // ===== E remove(int index)
        
        List<String> flores = new ArrayList<>();
        
        flores.add("Azucenas");
        flores.add("Azaleas");
        
        System.out.println(flores.remove("Azucenas"));
        System.out.println(flores.remove("Crisantemo"));
        System.out.println(flores.remove(0));
        System.out.println(flores);
        
        
        
        
        
        
    }
    
    public static void clasesWraper(){
        Integer wrapper = Integer.valueOf(1234);
        int primitivo = Integer.parseInt("1234");
        System.out.println("la clase wrapper es " + wrapper);
        System.out.println("el numero primitivo es " + primitivo);
        
        try{
        //int malo = Integer.parseInt("qwerty");
        int malo2 = Integer.valueOf("1234.09");
        }catch(Exception e){
            System.out.println("El valor que has ingresado no es un numero, intente de nuevo por favor");
        }
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        clasesWraper();
        //listar();
        /*int tamaño;

        String pajaro = "Ruiseñor";

        tamaño = pajaro.length();

        System.out.println(tamaño);

        String string = "animales";

        
        System.out.println(string.charAt(2));
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(6));
        System.out.println(string.charAt(7));
        System.out.println(string.indexOf('a'));
        System.out.println(string.indexOf("al"));
        System.out.println(string.indexOf('a', 4));
        System.out.println(string.indexOf("al",5));
        System.out.println(string.substring(3));
        System.out.println(string.substring(3,4));
        System.out.println(string.substring(3,9));
        
        String mayusculas =string.toUpperCase();
        String minuString = string.toLowerCase();
        
        System.out.println(mayusculas);
        System.out.println(minuString);*/
        /*
        System.out.println("abc".equals("ABC"));   //false
        System.out.println("ABC".equals("ABC"));   // true;
        System.out.println("abc".equalsIgnoreCase("ABC"));  //true
        */
        /*
        System.out.println("abc".startsWith("a"));  //true
        System.out.println("abc".startsWith("A"));  // false;
        
        System.out.println("abc".endsWith("c"));   //true;
        System.out.println("abc".endsWith("b")); //false
        
        System.out.println("murcielago".contains("b"));
        System.out.println("murcielago".contains("a"));
        
        
        System.out.println("murcielago".replace('l','g'));
        System.out.println("murcielago".replace("lago","galo"));
        
        System.out.println("abc".trim());  //abc
        
        System.out.println(" abc".trim()); //abc
        
        System.out.println("abc ".trim()); //abc
        
        System.out.println(" a b c ".replace(" ", ""));*/
        /*
        StringBuilder abcdario = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animales");
        StringBuilder sb3 = new StringBuilder(10);
        for(char actual = 'a'; actual <= 'z'; actual ++){
            abcdario.append(actual);
        }
        System.out.println(abcdario);*/
        
        /*StringBuilder sb = new StringBuilder("animales");
        
        char ch = sb.charAt(6);
        
        System.out.println(ch);
        
        StringBuilder sb = new StringBuilder().append("mur").append("cie").append("lago");
        System.out.println(sb);
        
        //=============StringBuilder insert(int offset, string str);==========/
        
        StringBuilder sb = new StringBuilder("animales");
        
        sb.insert(7, "-");
        sb.insert(9, "-");
        sb.insert(4, "-");
        
        
        System.out.println(sb);*/
        
        /* ======
        StringBuilder delete(int start, ind end);
        
        StringBuilder deleteChartAt(int index); =====
        
        StringBuilder sb = new StringBuilder("abcdef");
        sb.delete(1, 3);   //adef
        sb.deleteCharAt(5);
        
        System.out.println(sb);
        
        // ==============StringBuilder reverse();===========
        
        
        StringBuilder sb = new StringBuilder("anitalavalatina1234");
        
        sb.reverse();
        
        System.out.println(sb); 
        
        StringBuilder sb = new StringBuilder("murcielago");
        
        String string = sb.toString();
        
        
        StringBuilder sb1 = new StringBuilder();
        
        StringBuilder sb3 = sb1.append("Bulbtic");
        
        System.out.println("Este es el valor de sb1 " + sb1);
        System.out.println("valor de sb3 " + sb3);*/
        
        
        
        
        
        
        

        /*AlumnoDTO alumnoDTO = new AlumnoDTO();
        
        alumnoDTO.setNombres("Juan");
        
        AlumnoDTO alumnoDTO2 = alumnoDTO;
        
        alumnoDTO2.setNombres("Juan");
        
        
        
        
        
        
        
        String nombre = "Jhon Snow";
        
        String nombre3 = new String("Jhon Snow");
        
        
       
        
        System.out.println(nombre == nombre3);
        
       /* System.out.println(nombre);
        System.out.println(nombre2);
        
        System.out.println(nombre + " " +nombre2);
        
        System.out.println(1+2); //3
        
        System.out.println("a" + "a");
        
        System.out.println("a" + "b" + 3);  //ab3
        
        
        System.out.println(1+2 + "abc");*/  //3abc
        /*AspiranteService aspiranteService = new AspiranteServiceImpl();
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
         */
        //programar Examen de selección.
    }

    public static void programarExamenSeleccion(AspiranteDTO aspiranteDTO) {
        System.out.println("Selecciona la cede");
        ConfiguracionService configuracionService = new ConfiguracionServiceImpl();

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
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

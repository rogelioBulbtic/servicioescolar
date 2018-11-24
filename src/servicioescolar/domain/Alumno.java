/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioescolar.domain;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Bulbtic
 */
public class Alumno extends Persona{
    
    public static class MateriaExtra extends Materia{
        
        
        public List<String> dias;
        
        public MateriaExtra(){
        
        }
    
    
        public void realizar(){
        
            System.out.println("Esta materia llamada " + nombreMateria );
        }
    }
    
    
    
    
    private PlanEstudio planEstudio;
    private boolean inscrito;
    private String matricula;
    
    

    public Alumno(PlanEstudio planEstudio, boolean inscrito, String matricula, String nombre, String apellidos) {
        this(planEstudio, nombre, apellidos);
        this.planEstudio = planEstudio;
        this.inscrito = inscrito;
        this.matricula = matricula;
    }

    public Alumno(PlanEstudio planEstudio, String nombre, String apellidos) {
        super(nombre, apellidos);
        super.nombre = nombre;
        this.planEstudio = planEstudio;
    }
    
    public Alumno(){
        super();
        ///comentario
    }

    public PlanEstudio getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(PlanEstudio planEstudio) {
        this.planEstudio = planEstudio;
    }

    public boolean isInscrito() {
        return inscrito;
    }

    public void setInscrito(boolean inscrito) {
        this.inscrito = inscrito;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        
        this.matricula = matricula;
    }
    
    
   public void inscrbir(){
       
           class OrdenPago{
           private float cantidad;
           private String numeroCuenta;
           private List<String> bancos;

            public OrdenPago() {
            }

            public float getCantidad() {
                return cantidad;
            }

            public void setCantidad(float cantidad) {
                this.cantidad = cantidad;
            }

            public String getNumeroCuenta() {
                return numeroCuenta;
            }

            public void setNumeroCuenta(String numeroCuenta) {
                this.numeroCuenta = numeroCuenta;
            }

            public List<String> getBancos() {
                return bancos;
            }

            public void setBancos(List<String> bancos) {
                this.bancos = bancos;
            }
           
           public void generarOrdenPago(){
               System.out.println("Orden de pago por la cantidad de " 
                       + cantidad + " a la cuenta de " + numeroCuenta + 
                       " por el alumno de nombre " + nombre + " " + apellidos);
           }
       }
       
       OrdenPago ordenPago = new OrdenPago();
       ordenPago.setCantidad(100.5f);
       ordenPago.setNumeroCuenta("10245678");
       ordenPago.generarOrdenPago();
       
   }
   
   public void comprar(String producto){
       System.out.println("voy a comprar con un descuento del 50% el producto " + producto);
   }
   
   public void comprar(){
   
   }
   
   public void comparar(float efectivo){
   
   }
   
   public void resolverExamen(){
       System.out.println("Estoy en un examen");
   }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        if (obj instanceof Alumno){
            System.out.println("Si es de la instancia alumno");
            return true;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }
   
   
   
    @Override
    public String toString() {
        return "Alumno{" + "nombres=" + nombre
                + ", apellidos=" + apellidos 
                + ", edad=" + edad 
                + ", domicilio=" + domicilio 
                + ", fechaNacimiento=" + fechaNacimiento 
                + ", genero=" + genero + '}';
    }
} 
    /*
    {
        System.out.println("soy un bloque de codigo");
    }
    
    
    static {
        numeroIntentos = 0;
        System.out.println("Soy un bloque de codigo statico " + numeroIntentos);
    }*/
    /*
    public Alumno(String nombres, String apellidosDeseados){
       nombres = this.nombres; //si compila pero no es buena idea
       apellidos = apellidosDeseados; //Se puede por que son de diferentes nombres
       this.edad = 20;
    }
    
    public Alumno(String nombres){
        this.nombres = nombres;
    }*/

    /*
    public Alumno() {
        super();
    }

    public Alumno(String nombres) {
        this();
        this.nombres = nombres;
    }
    
    public Alumno(String nombres, String apellidos) {
        this(nombres);
        this.apellidos = apellidos;
    }

    public Alumno(String nombres, String apellidos, byte edad) {
        this(nombres, apellidos);
        this.edad = edad;
    }

    public Alumno(String nombres, String apellidos, byte edad, String domicilio) {
        this(nombres, apellidos, edad);
        this.domicilio = domicilio;
    }
    
    
    public String getNombres() {
        return nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        System.out.println("Edad desde byte primitivo");
        if(edad > 0){
            this.edad = edad;
        }else{
        System.out.println("El valor de la edad no puede ser asignado");
        }
    }
    
    public void setEdad(Byte edad){
        System.out.println("Edad desde Wrapper");
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public PlanEstudio getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(PlanEstudio planEstudio) {
        this.planEstudio = planEstudio;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public boolean isInscrito() {
        return inscrito;
    }

    public void setInscrito(boolean inscrito) {
        this.inscrito = inscrito;
    }
    
    
    public static void presentarExamen(String materia){
        System.out.println("Voy a presentar el examen de " + materia);
    }
    
    private void pagarExamen(){
        System.out.println("Voy a pagar el examen ");
        presentarExamen(nombres);
    }
    
    void reservarLibro(String libro){
    }
    
    
    public void estudiar(String materia){
        System.out.println("1");
    }
    
    public void estudiar(String... materias){
        System.out.println("2");
    }
    
    public  void estudiar(Object materia){
        System.out.println("3");
    }
    
    public void estudiar(String materia1, String materia2){
        System.out.println("4");
    }
    
    
    /*public void estudiarMateria(int horas){
        System.out.println("Estoy estudiando mas que mucho");
        System.out.println("String");
        System.out.println(1);
        System.out.println(1.3);
    }*/
    
    /*public void estudiarMateria(String[] materias){
    
    }
    
    public void estudiarMateria(String... materias){
    
    }*/
    
    
    //default void estudiar2(){}
    
   /* public final void estudiar3(){}
    
    void estudiar4(){}
    
    public void acreditar(int creditos){
        System.out.println("creditos desde int");
    }
    
    public void acreditar(long creditos){
        System.out.println("creditos desde long");
    }

    @Override
    public String toString() {
        return "Persona{" + "nombres=" + nombres 
                + ", apellidos=" + apellidos 
                + ", edad=" + edad 
                + ", domicilio=" + domicilio 
                + ", fechaNacimiento=" + fechaNacimiento 
                + ", genero=" + genero + '}';
    }
    
}*/



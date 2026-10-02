package seresVivos;

import java.time.LocalDate;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private int edad;
    private String direccion;
    private int numCelular;
    private int DNI;
    private String mail;

    public Persona(String nombre,String apellido, String direccion, LocalDate fechaNac){
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

    public Persona(){
        nombre = "Martin";
        apellido = "Gutierrez";
        fechaNac = LocalDate.of(2000,9,8);
        edad = 15;
        direccion = "Olavarria 1456";
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, int numCelular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCelular = numCelular;
    }

    public Persona(String nombre, String apellido, LocalDate fechaNac, int numCelular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.numCelular = numCelular;
    }

    public Persona(String nombre, LocalDate fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public Persona(String nombre, LocalDate fechaNac, int DNI, String mail) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.DNI = DNI;
        this.mail = mail;
    }

    public Persona(String nombre, LocalDate fechaNac, int DNI) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.DNI = DNI;
    }

    public int getDNI() {
        return DNI;
    }
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public LocalDate getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumCelular() {
        return numCelular;
    }
    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public  void datosPersona(){

        System.out.println("El nombre es " + getNombre() + ", su edad es " + getEdad() + " y vive en " + getDireccion());
    }

}

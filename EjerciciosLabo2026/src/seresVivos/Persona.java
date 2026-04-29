package seresVivos;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private int edad;
    private String direccion;

    public Persona(String nombre,String apellido, String direccion, LocalDate fechaNac){
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
        this.apellido = apellido;
    }

    public Persona(){
        nombre = "Martin";
        apellido = "Gutierrez";
        fechaNac = LocalDate.of(2000,9,8);
        edad = 15;
        direccion = "Olavarria 1456";
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

    public void datosPersona(){

        System.out.println("El nombre es " + getNombre() + ", su edad es " + getEdad() + " y vive en " + getDireccion());
    }

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.datosPersona();
    }
}

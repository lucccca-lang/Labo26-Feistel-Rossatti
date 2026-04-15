package seresVivos;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona(String nombre, int edad, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public Persona(){
        nombre = "Martin";
        edad = 15;
        direccion = "Olavarria 1456";
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void datosPersona(){

        System.out.println("El nombre es " + getNombre() + ", su edad es " + getEdad() + " y vive en " + getDireccion());
    }

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.datosPersona();
    }
}

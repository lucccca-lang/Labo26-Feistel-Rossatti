package EjLlamadasProfe;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private String pais;

    public Persona(String nombre, String apellido, String dni, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.pais = pais;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getPais() {
        return pais;
    }

    public boolean tieneMismoDniQue(String dni) {
        return this.dni.equals(dni);
    }

    public boolean viveEnElMismoPaisQue(Persona otraPersona) {
        return this.pais.equalsIgnoreCase(otraPersona.getPais());
    }
}

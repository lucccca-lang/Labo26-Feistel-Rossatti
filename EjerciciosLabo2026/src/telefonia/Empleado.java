package telefonia;

import seresVivos.Persona;

public class Empleado extends Persona {
    private int dni;
    private String pais;
    private int numTelefono;

    public Empleado(String nombre, String apellido, int dni, String pais, int numTelefono){
        super(nombre, apellido);
        this.dni = dni;
        this.pais = pais;
        this.numTelefono = numTelefono;
    }

    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public int getNumTelefono() {
        return numTelefono;
    }
    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }



}

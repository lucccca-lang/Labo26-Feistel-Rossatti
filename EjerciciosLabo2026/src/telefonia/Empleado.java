package telefonia;

import seresVivos.Persona;

public class Empleado extends Persona {
    private int dni;
    private String pais;
    private int numTelefono;
    private String provincia;
    private int codPais;
    private int franjaHoraria;

    public Empleado(String nombre, String apellido, int dni, String pais, int numTelefono, String provincia, int codPais, int franjaHoraria){
        super(nombre, apellido);
        this.dni = dni;
        this.pais = pais;
        this.numTelefono = numTelefono;
        this.provincia = provincia;
        this.codPais = codPais;
        this.franjaHoraria = franjaHoraria;
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
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public int getCodPais() {
        return codPais;
    }
    public void setCodPais(int codPais) {
        this.codPais = codPais;
    }
    public int getFranjaHoraria() {
        return franjaHoraria;
    }
    public void setFranjaHoraria(int franjaHoraria) {
        this.franjaHoraria = franjaHoraria;
    }


}

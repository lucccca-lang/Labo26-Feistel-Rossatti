package EjLlamadasProfe;

import EjLlamadasProfe.Persona;

public class Empleado extends Persona {
    private String telefono;
    private String provincia;
    private String codigoPais;
    private String franjaHoraria;

    public Empleado(String nombre, String apellido, String dni, String pais,
                    String telefono, String provincia, String codigoPais, String franjaHoraria) {
        super(nombre, apellido, dni, pais);
        this.telefono = telefono;
        this.provincia = provincia;
        this.codigoPais = codigoPais;
        this.franjaHoraria = franjaHoraria;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public String getFranjaHoraria() {
        return franjaHoraria;
    }

    public boolean tieneTelefono(String telefono) {
        return this.telefono.equals(telefono);
    }
}

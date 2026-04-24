package deportes;

import java.time.LocalDate;

public class Jugador {
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private boolean capitan;
    private int dorsal;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public boolean isCapitan() {
        return capitan;
    }
    public void setCapitan(boolean capitan) {
        this.capitan = capitan;
    }
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }


}

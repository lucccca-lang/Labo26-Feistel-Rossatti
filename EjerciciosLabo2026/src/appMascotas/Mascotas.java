package appMascotas;

public abstract class Mascotas {
    private String nombre;
    private String dueño;
    private TipoMascota tipoMascota;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDueño() {
        return dueño;
    }
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    public TipoMascota getTipoMascota() {
        return tipoMascota;
    }
    public void setTipoMascota(TipoMascota tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public Mascotas(String nombre, String dueño, TipoMascota tipoMascota) {
        this.nombre = nombre;
        this.dueño = dueño;
        this.tipoMascota = tipoMascota;
    }

    public abstract String saludo();




    @Override
    public String toString() {
        return "Mascotas{" +
                "nombre='" + nombre + '\'' +
                ", dueño='" + dueño + '\'' +
                ", tipoMascota=" + tipoMascota +
                '}';
    }
}
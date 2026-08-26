package appMascotas;

public abstract class Mascotas {
    private String nombre;
    private String dueño;
    private TipoMascota tipoMascota;
    private int felicidad;

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
    public int getFelicidad() {
        return felicidad;
    }
    public void setFelicidad(int felicidad) {
        this.felicidad = felicidad;
    }

    public Mascotas(String nombre, String dueño, TipoMascota tipoMascota, int felicidad) {
        this.nombre = nombre;
        this.dueño = dueño;
        this.tipoMascota = tipoMascota;
        this.felicidad = felicidad;
    }

    public abstract String saludo();


    public void bajarFelicidad(){
        if (this.felicidad > 0){
            this.felicidad--;
        }
    }

    public void restarVida() {}

    public void morir() {}

    public void alimentar(){
        this.felicidad++;
    }

    public abstract TipoMascota tipoMascota();

    @Override
    public String toString() {
        return "Mascotas{" +
                "nombre='" + nombre + '\'' +
                ", dueño='" + dueño + '\'' +
                ", tipoMascota=" + tipoMascota +
                '}';
    }
}
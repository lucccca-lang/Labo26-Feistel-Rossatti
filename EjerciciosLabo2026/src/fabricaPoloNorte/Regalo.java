package fabricaPoloNorte;

public class Regalo {
    private Tamanio tamanio;
    private String nombre;

    public Tamanio getTamanio() {
        return tamanio;
    }
    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Regalo(Tamanio tamanio, String nombre) {
        this.tamanio = tamanio;
        this.nombre = nombre;
    }
}

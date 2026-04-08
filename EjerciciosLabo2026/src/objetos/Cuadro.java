package objetos;

public class Cuadro {
    private String titulo;
    private String pintor;
    private int anioCreacion;
    private int estado;

    public Cuadro(){
        this.titulo = "Mona Lisa";
        this.pintor = "Da Vinci";
        this.anioCreacion = 2010;
        this.estado = 6;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getPintor() {
        return pintor;
    }
    public void setPintor(String pintor) {
        this.pintor = pintor;
    }
    public int getAnioCreacion() {
        return anioCreacion;
    }
    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }
    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
}

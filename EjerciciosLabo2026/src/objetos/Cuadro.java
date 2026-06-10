package objetos;

public class Cuadro {
    private String titulo;
    private String pintor;
    private int anioCreacion;
    private EstadoCuadro estado;

    public Cuadro(String titulo, String pintor, int anioCreacion, EstadoCuadro estado) {
        this.titulo = titulo;
        this.pintor = pintor;
        this.anioCreacion = anioCreacion;
        this.estado = estado;
    }

    public Cuadro(){
        this.titulo = "Mona Lisa";
        this.pintor = "Da Vinci";
        this.anioCreacion = 2010;
        this.estado = EstadoCuadro.SEIS;
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
    public EstadoCuadro getEstado() {
        return estado;
    }
    public void setEstado(EstadoCuadro estado) {
        this.estado = estado;
    }
}

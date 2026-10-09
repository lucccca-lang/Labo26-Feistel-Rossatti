package cosasPrestSist;

import java.time.LocalDate;

public abstract class Textos {
    private int codigo;
    private String titulo;
    private LocalDate anioPublicacion;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public LocalDate getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(LocalDate anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Textos{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                '}';
    }
}

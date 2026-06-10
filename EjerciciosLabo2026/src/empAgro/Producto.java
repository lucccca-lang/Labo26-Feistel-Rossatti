package empAgro;

import java.time.LocalDate;

public class Producto {
    private LocalDate fechaVencimiento;
    private int numLote ;
    private String nombre;
    private int codId;
    private PaisOrigen paisOrigen;
    private LocalDate fechaEnvasado;
    private Empresa empresa;

    public Producto(LocalDate fechaVencimiento, int numLote, String nombre, int codId, PaisOrigen paisOrigen, LocalDate fechaEnavsado) {
        this.fechaVencimiento = fechaVencimiento;
        this.numLote = numLote;
        this.nombre = nombre;
        this.codId = codId;
        this.paisOrigen = paisOrigen;
        this.fechaEnvasado = fechaEnvasado;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public int getNumLote() {
        return numLote;
    }
    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCodId() {
        return codId;
    }
    public void setCodId(int codId) {
        this.codId = codId;
    }
    public PaisOrigen getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(PaisOrigen paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }
    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }


    public boolean prodMasRecienteEnv(Producto prod){
        return false;
    }


}

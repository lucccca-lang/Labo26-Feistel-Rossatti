package sistemaAlarma;

import java.time.LocalDate;

public class Sensor {
    private boolean estado;
    private int valorReal;
    private int valorUmbral;
    private LocalDate fechaAdquirido;

    public Sensor(boolean estado, int valorReal, int valorUmbral, LocalDate fechaAdquirido) {
        this.estado = estado;
        this.valorReal = valorReal;
        this.valorUmbral = valorUmbral;
        this.fechaAdquirido = fechaAdquirido;
    }

    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public int getValorReal() {
        return valorReal;
    }
    public void setValorReal(int valorReal) {
        this.valorReal = valorReal;
    }
    public int getValorUmbral() {
        return valorUmbral;
    }
    public void setValorUmbral(int valorUmbral) {
        this.valorUmbral = valorUmbral;
    }
    public LocalDate getFechaAdquirido() {
        return fechaAdquirido;
    }
    public void setFechaAdquirido(LocalDate fechaAdquirido) {
        this.fechaAdquirido = fechaAdquirido;
    }

    public void dispararAlarma(){
    }
}

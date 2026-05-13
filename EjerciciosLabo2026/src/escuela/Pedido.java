package escuela;

import seresVivos.Persona;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {
    private LocalDate fechaCreacion;
    private Plato plato;
    private Persona persona;
    private LocalTime horaEntrega;
    private boolean entregado;

    public Plato getPlato() {
        return plato;
    }
    public void setPlato(Plato plato) {
        this.plato = plato;
    }
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public LocalTime getHoraEntrega() {
        return horaEntrega;
    }
    public void setHoraEntrega(LocalTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }
    public boolean isEntregado() {
        return entregado;
    }
    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Pedido(LocalDate fechaCreacion, Plato plato, Persona persona, LocalTime horaEntrega, boolean entregado) {
        this.fechaCreacion = fechaCreacion;
        this.plato = plato;
        this.persona = persona;
        this.horaEntrega = horaEntrega;
        this.entregado = entregado;
    }

    public double chequearDescuento(){
        double precio = plato.getPrecio();

            if (persona instanceof Profesor) {
            precio = plato.setPrecio(plato.getPrecio() * 0.5);
            }
        return precio;
    }
}

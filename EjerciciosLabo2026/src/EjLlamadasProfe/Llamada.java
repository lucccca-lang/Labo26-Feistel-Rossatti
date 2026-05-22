package EjLlamadasProfe;

import java.time.LocalDateTime;

public class Llamada {
    private Empleado origen;
    private Empleado destino;
    private LocalDateTime fecha;
    private int duracionMinutos;

    public Llamada(Empleado origen, Empleado destino, int duracionMinutos) {
        this.origen = origen;
        this.destino = destino;
        this.duracionMinutos = duracionMinutos;
        this.fecha = LocalDateTime.now();
    }

    public Empleado getOrigen() {
        return origen;
    }

    public Empleado getDestino() {
        return destino;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public double calcularCosto() {
        return 0;
    }

    public boolean esInternacional() {
        return false;
    }

    public boolean fueRealizadaPor(Empleado empleado) {
        return origen.tieneMismoDniQue(empleado.getDni());
    }

    public String obtenerDetalle() {

                return " | Origen: " + origen.getNombreCompleto()
                + " | Destino: " + destino.getNombreCompleto()
                + " | Fecha: " + fecha
                + " | Duracion: " + duracionMinutos + " minutos"
                + " | Costo: $" + calcularCosto();
    }

    public int obtenerMinutosAlExteriorDe(Empleado empleado) {
        return 0;
    }
}

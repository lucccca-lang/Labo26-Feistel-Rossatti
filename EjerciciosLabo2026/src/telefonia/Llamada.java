package telefonia;

public class Llamada {
    private Empleado empOrigen;
    private Empleado empDestino;
    private int Duracion;

    public Empleado getEmpOrigen() {
        return empOrigen;
    }
    public void setEmpOrigen(Empleado empOrigen) {
        this.empOrigen = empOrigen;
    }
    public Empleado getEmpDestino() {
        return empDestino;
    }
    public void setEmpDestino(Empleado empDestino) {
        this.empDestino = empDestino;
    }
    public int getDuracion() {
        return Duracion;
    }
    public void setDuracion(int duracion) {
        Duracion = duracion;
    }

    public Llamada(Empleado empOrigen, Empleado empDestino, int duracion) {
        this.empOrigen = empOrigen;
        this.empDestino = empDestino;
        this.Duracion = duracion;
    }

    public int calcularCosto(){
        return 0;
    }
}

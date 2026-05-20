package telefonia;

public class Internacional extends Llamada{
    private int codPaisDestino;
    private int franjaHoraria;

    public int getFranjaHoraria() {
        return franjaHoraria;
    }
    public void setFranjaHoraria(int franjaHoraria) {
        this.franjaHoraria = franjaHoraria;
    }
    public int getCodPaisDestino() {
        return codPaisDestino;
    }
    public void setCodPaisDestino(int codPaisDestino) {
        this.codPaisDestino = codPaisDestino;
    }

    public Internacional(Empleado empOrigen, Empleado empDestino, int duracion) {
        super(empOrigen, empDestino, duracion);
        this.codPaisDestino = empDestino.getCodPais();
        this.franjaHoraria = empDestino.getFranjaHoraria();
    }

    public int calcularCosto(){
        return getDuracion() * 8;
    }
}

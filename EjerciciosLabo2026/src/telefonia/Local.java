package telefonia;

public class Local extends Llamada{
    private String provOrigen;
    private String provDestino;

    public String getProvDestino() {
        return provDestino;
    }
    public void setProvDestino(String provDestino) {
        this.provDestino = provDestino;
    }
    public String getProvOrigen() {
        return provOrigen;
    }
    public void setProvOrigen(String provOrigen) {
        this.provOrigen = provOrigen;
    }

    public Local(Empleado empOrigen, Empleado empDestino, int duracion) {
        super(empOrigen, empDestino, duracion);
        this.provDestino = empDestino.getProvincia().name();
        this.provOrigen = empOrigen.getProvincia().name();
    }

    public int calcularCosto(){
        return getDuracion() * 2;
    }



}

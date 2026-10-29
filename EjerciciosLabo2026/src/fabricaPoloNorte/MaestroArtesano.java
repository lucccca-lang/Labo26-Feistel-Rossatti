package fabricaPoloNorte;

import java.time.LocalDate;

public class MaestroArtesano extends Ayudante{
    private static int tiempoMaxProduccion = 120;
    private int tiempoProduccion;

    public static int getTiempoMaxProduccion() {
        return tiempoMaxProduccion;
    }
    public int getTiempoProduccion() {
        return tiempoProduccion;
    }
    public void setTiempoProduccion(int tiempoProduccion) {
        this.tiempoProduccion = tiempoProduccion;
    }

    public MaestroArtesano(String nombre, String apellido, LocalDate fechaNac, String aldeaOrigen, Taller taller, int tiempoProduccion) {
        super(nombre, apellido, fechaNac, aldeaOrigen, taller);
        this.tiempoProduccion = tiempoMaxProduccion;
    }


    @Override
    public String prepararEstacionTrabajo() {
        setTiempoProduccion(this.tiempoProduccion - 10);
        return "Luego de calentar mis herramientas me quedan" + this.tiempoProduccion;
    }
}

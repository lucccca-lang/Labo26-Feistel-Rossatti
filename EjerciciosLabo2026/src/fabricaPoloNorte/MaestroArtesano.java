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

    public MaestroArtesano(String nombre, String apellido, LocalDate fechaNac, String aldeaOrigen, Taller taller) {
        super(nombre, apellido, fechaNac, aldeaOrigen, taller);
        this.tiempoProduccion = tiempoMaxProduccion;
    }


    @Override
    public void prepararEstacionTrabajo() {
        setTiempoProduccion(this.tiempoProduccion - 10);
        System.out.println("Luego de calentar mis herramientas me queda " + this.tiempoProduccion + " de energia");
    }

    @Override
    public void fabricar(Regalo reg, String material) throws ExcedioElTiempoDispoException, NoTieneMaterialesNecesariosException, UsoDeMaterialProhibidoException, RegaloNoLePerteneceException {
        if(this.tiempoProduccion <= 0){
            throw new ExcedioElTiempoDispoException("Operacion parada, excedio su tiempo disponible de trabajo");
        }
        System.out.println("El regalo " + reg.getNombre() + " fue fabricado con exito");
    }
}

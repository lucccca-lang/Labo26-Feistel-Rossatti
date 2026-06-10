package empAgro;

import java.time.LocalDate;

public class ProdRefrigerado extends Producto{
    private int tempMantenimiento;

    public ProdRefrigerado(LocalDate fechaVencimiento, int numLote, String nombre, int codId, PaisOrigen paisOrigen, LocalDate fechaEnavsado, int tempMantenimiento) {
        super(fechaVencimiento, numLote, nombre, codId, paisOrigen, fechaEnavsado);
        this.tempMantenimiento = tempMantenimiento;
    }

    public int getTempMantenimiento() {
        return tempMantenimiento;
    }
    public void setTempMantenimiento(int tempMantenimiento) {
        this.tempMantenimiento = tempMantenimiento;
    }

}

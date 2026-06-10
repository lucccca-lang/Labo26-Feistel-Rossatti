package empAgro;

import java.time.LocalDate;

public class ProdFresco extends Producto{

    public ProdFresco(LocalDate fechaVencimiento, int numLote, String nombre, int codId, PaisOrigen paisOrigen, LocalDate fechaEnavsado) {
        super(fechaVencimiento, numLote, nombre, codId, paisOrigen, fechaEnavsado);
    }

    @Override
    public boolean prodMasRecienteEnv(Producto prod) {
        return this.getFechaEnvasado().isAfter(prod.getFechaEnvasado());
    }
}

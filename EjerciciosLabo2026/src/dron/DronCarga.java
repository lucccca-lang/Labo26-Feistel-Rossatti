package dron;

import java.time.LocalDate;

public class DronCarga extends Drones{
    public int pesoCarga;

    public DronCarga(String modelo, LocalDate fechaAdquisicion, int nivelCarga, int dronesOperativos) {
        super(modelo, fechaAdquisicion, nivelCarga, dronesOperativos);
    }

    @Override
    public void ejecutarMision() {

    }

    @Override
    public boolean comunicarAlSistema() {
        return false;
    }
}

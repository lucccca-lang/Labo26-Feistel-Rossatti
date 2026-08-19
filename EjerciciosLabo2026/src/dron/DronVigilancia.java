package dron;

import java.time.LocalDate;

public class DronVigilancia extends Drones{
    public DronVigilancia(String modelo, LocalDate fechaAdquisicion, int nivelCarga, int dronesOperativos) {
        super(modelo, fechaAdquisicion, nivelCarga, dronesOperativos);
    }
}

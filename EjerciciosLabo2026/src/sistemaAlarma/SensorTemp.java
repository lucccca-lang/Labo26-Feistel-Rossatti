package sistemaAlarma;

import java.time.LocalDate;

public class SensorTemp extends Sensor {

    public SensorTemp(boolean estado, int valorReal, LocalDate fechaAdquirido) {
        super(estado, valorReal, 90, fechaAdquirido);
    }

    @Override
    public void dispararAlarma() {
        System.out.println("¡Cuidado! La temperatura sube");
    }
}

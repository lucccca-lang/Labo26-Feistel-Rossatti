package sistemaAlarma;

import java.time.LocalDate;

public class SensorPres extends Sensor {

    public SensorPres(boolean estado, int valorReal, LocalDate fechaAdquirido) {
        super(estado, valorReal, 100, fechaAdquirido);
    }

    @Override
    public void dispararAlarma() {
        System.out.println("Sensor de presión activado");
    }
}

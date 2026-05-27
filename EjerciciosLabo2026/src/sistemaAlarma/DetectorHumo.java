package sistemaAlarma;

import java.time.LocalDate;

public class DetectorHumo extends Sensor {

    public DetectorHumo(boolean estado, int valorReal, LocalDate fechaAdquirido) {
        super(estado, valorReal, 80, fechaAdquirido);
    }

    @Override
    public void dispararAlarma() {
        System.out.println("Llamando a los bomberos");
    }
}

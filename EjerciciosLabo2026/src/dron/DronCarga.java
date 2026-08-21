package dron;

import java.time.LocalDate;

public class DronCarga extends Drones{
    public int pesoCarga;

    public DronCarga(String modelo, LocalDate fechaAdquisicion, int nivelCarga, int dronesOperativos, Estado estadoDron) {
        super(modelo, fechaAdquisicion, nivelCarga, dronesOperativos, estadoDron);
        this.pesoCarga = pesoCarga;
    }


    public int getPesoCarga() {
        return pesoCarga;
    }
    public void setPesoCarga(int pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    @Override
    public void ejecutarMision(double latitudDestino, double longitudDestino) {
        double destino = calcularDistancia(latitudDestino,longitudDestino);

        if (destino>30){
            System.out.println("La mision no puede realizarse");
        }
        else {
            if (getNivelCarga()>=48){
                System.out.println("La mision se realizo con exito");
                setNivelCarga(getNivelCarga()-48);
            }
            else {
                System.out.println("El dron no cuenta con suficiente bateria");
            }
        }
    }

    @Override
    public boolean comunicarAlSistema() {
        return false;
    }
}

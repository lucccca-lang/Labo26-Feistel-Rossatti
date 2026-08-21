package dron;

import java.time.LocalDate;

public class DronVigilancia extends Drones{
    private int cantMemoria;

    public DronVigilancia(String modelo, LocalDate fechaAdquisicion, int nivelCarga, int dronesOperativos, Estado estadoDron) {
        super(modelo, fechaAdquisicion, nivelCarga, dronesOperativos, estadoDron);
    }

    @Override
    public void ejecutarMision(double latitudDestino, double longitudDestino) {
        if(hayEspacio(calcularDistancia(latitudDestino,longitudDestino))){
            System.out.println("La mision se realizo con exito");
        }
        else {
            System.out.println("El dron no cuenta con suficiente espacio");
        }
    }

    public boolean hayEspacio(double destino){
        double cantidadEspacio = (destino / 2) * 12;

        if (cantidadEspacio <= cantMemoria){
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public boolean comunicarAlSistema() {
        return false;
    }
}

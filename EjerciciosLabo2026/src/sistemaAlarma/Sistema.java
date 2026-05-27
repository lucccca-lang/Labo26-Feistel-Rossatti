package sistemaAlarma;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Sensor> sensores;

    public Sistema(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }

    public ArrayList<Sensor> getSensores() {
        return sensores;
    }
    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }


    public void recorrerSensores() {
        for (Sensor s : sensores) {}
    }

    public void evaluarAlarma(Sensor sensor){
        if (sensor.isEstado() && sensor.getValorUmbral() < sensor.getValorReal()){
            sensor.dispararAlarma();
        }
    }


}

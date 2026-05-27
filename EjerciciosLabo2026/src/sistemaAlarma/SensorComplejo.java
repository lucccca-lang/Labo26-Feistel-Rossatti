package sistemaAlarma;

import java.util.ArrayList;

public class SensorComplejo {
    private ArrayList<Sensor> grupos;

    public ArrayList<Sensor> getGrupos() {
        return grupos;
    }
    public void setGrupos(ArrayList<Sensor> grupos) {
        this.grupos = grupos;
    }

    public SensorComplejo(ArrayList<Sensor> grupos) {
        this.grupos = grupos;
    }

    public void EvitarFalsasAlarmas(){
        int cant = 0;
        int promReal = 0;
        int promUmbral = 0;
        int umbral = 0;
        int real = 0;

        for(Sensor sen : grupos){
           umbral += sen.getValorUmbral();
           real += sen.getValorReal();
           cant ++;
           promReal = real/cant;
           promUmbral = umbral/cant;

            if(sen.isEstado() && promReal>promUmbral){
                sen.dispararAlarma();
            }
        }
    }
}

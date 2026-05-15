package telefonia;

import java.util.ArrayList;

public class EmpresaTelefonia {
    private ArrayList<Empleado> empleados;
    private ArrayList<Llamada> llamadas;

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void registrarLlamada(Empleado empOrigen, Empleado empDestino, int duracion){

        if (empOrigen.getPais().equals(empDestino.getPais()){
            Local llamada = new Llamada(empOrigen, empDestino, duracion, empOrigen.getPais(), empDestino.getPais());
            llamadas.add(llamada);
        }
        if (empOrigen.getPais() != empDestino.getPais()){
            Internacional llamada = new Llamada(empOrigen, empDestino, duracion, empOrigen.getPais(), empDestino.getPais());
            llamadas.add(llamada);
        }
    }


}

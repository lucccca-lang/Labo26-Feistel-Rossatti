package telefonia;

import java.util.ArrayList;

public class EmpresaTelefonica {
    private ArrayList<Empleado> empleados;
    private ArrayList<Llamada> llamadas;

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void registrarLlamada(Empleado empOrigen, Empleado empDestino, int duracion) {
        if (empleados.contains(empDestino) && empleados.contains(empOrigen) && empOrigen.getDni()!= empDestino.getDni()) {

            if (empOrigen.getPais().equals(empDestino.getPais())) {
                Local llamada = new Local(empOrigen, empDestino, duracion);
                llamadas.add(llamada);
            }
            if (empOrigen.getPais() != empDestino.getPais()) {
                Internacional llamada = new Internacional(empOrigen, empDestino, duracion);
                llamadas.add(llamada);
            }
        }
    }
    public int costoLlamada() {
        for (Llamada l : llamadas) {
            System.out.println(l.calcularCosto());
        }
    }
}

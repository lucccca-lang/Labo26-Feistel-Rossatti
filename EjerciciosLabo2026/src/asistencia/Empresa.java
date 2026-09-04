package asistencia;

import java.time.Month;
import java.util.HashMap;

public class Empresa {
    HashMap<Integer, Empleado> listaEmpleados;

    public int diasLaboralesMensuales (Empleado empleado){
        return empleado.getDiasSemanas().size()*4;
    }

     public int diasLaboralesAnuales (Empleado empleado){
        return empleado.getDiasSemanas().size()*4*12;
    }


    public void buscarEmpleado(int numLegajo) {
        for (Integer legajo : listaEmpleados.keySet()) {
            if (legajo == numLegajo) {
                System.out.println(listaEmpleados.get(numLegajo));
            }
        }
    }

    public void registrarIngreso(int numLegajo, Empleado empleado) {
        if (listaEmpleados.containsValue(empleado)) {
            System.out.println("empleado ya esta registrado");
        } else {
            listaEmpleados.put(numLegajo, empleado);
        }
    }

    public int porcentajeAsistenciaAño(int anio, Empleado empleado) {
        int asisTotal = 0;

        for (Asistencia asistencia : empleado.getAsistencias()){
            if (asistencia.getFecha().getYear() == anio){
            asisTotal++;
            }
        }
        return asisTotal/ this.diasLaboralesMensuales(empleado)*100;
    }

    public int porcentajeAsistenciaMensual(Month mes, Empleado empleado) {
        int asisTotal = 0;

        for (Asistencia asistencia : empleado.getAsistencias()){
            if (asistencia.getFecha().getMonth() == mes){
            asisTotal++;
            }
        }
        return asisTotal/ this.diasLaboralesMensuales(empleado)*100;
    }






}
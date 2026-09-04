package asistencia;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Empresa {
    HashMap<Integer, Empleado> listaEmpleados;

    public int diasLaboralesMensuales(Empleado empleado) {
        return empleado.getDiasSemanas().size() * 4;
    }

    public int diasLaboralesAnuales(Empleado empleado) {
        return empleado.getDiasSemanas().size() * 4 * 12;
    }


    public void buscarEmpleado(int numLegajo) {
        if (listaEmpleados.containsKey(numLegajo)) {
            System.out.println(listaEmpleados.get(numLegajo));
        }
    }

    public void registrarIngreso(int numLegajo, Empleado empleado) {
        if (listaEmpleados.containsValue(empleado)) {
            System.out.println("empleado ya esta registrado");            /*BIEN MAL ENTENDIDO*/
        } else {
            listaEmpleados.put(numLegajo, empleado);
        }
    }

    public int porcentajeAsistenciaAño(int anio, Empleado empleado) {
        int asisTotal = 0;

        for (LocalDateTime asistencia : empleado.getAsistencias()) {
            if (asistencia.getYear() == anio) {
                asisTotal++;
            }
        }
        return asisTotal / this.diasLaboralesMensuales(empleado) * 100;
    }

    public int porcentajeAsistenciaMensual(Month mes, Empleado empleado) {
        int asisTotal = 0;

        for (LocalDateTime asistencia : empleado.getAsistencias()) {
            if (asistencia.getMonth() == mes) {
                asisTotal++;
            }
        }
        return asisTotal / this.diasLaboralesMensuales(empleado) * 100;
    }

    public void obtenerListaMas80EnMes(Month mes) {
        HashSet<Empleado> listaEmpMas80EnMes = new HashSet<>();
        for (Map.Entry<Integer, Empleado> e : listaEmpleados.entrySet()) {
            if (this.porcentajeAsistenciaMensual(mes, e.getValue()) > 80) {
                listaEmpMas80EnMes.add(e.getValue());
            } else {
                System.out.println("el empleado no llega al 80% de asistencia");
            }
        }

    }

    public void obtenerListaMas80EnAnio(int anio) {
        HashSet<Empleado> listaEmpMas80EnAnio = new HashSet<>();

        for (Map.Entry<Integer, Empleado> e : listaEmpleados.entrySet()) {
            if (this.porcentajeAsistenciaAño(anio, e.getValue()) > 80) {         /*return hashset*/
                listaEmpMas80EnAnio.add(e.getValue());
            } else {
                System.out.println("el empleado no supero el 80% en el anio");
            }
        }
    }
}



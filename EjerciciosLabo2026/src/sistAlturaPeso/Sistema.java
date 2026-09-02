package sistAlturaPeso;

import seresVivos.Persona;
import telefonia.Local;
import tiendaElectronica.Producto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {
    private HashSet<Paciente> listaPaciente;

    public void nuevaMedicion (Paciente paciente, Medicion medicion){
        if (paciente.getMedicion().containsKey(LocalDate.now())){
            System.out.println("En esta fecha ya existe una medicion");
        }
        else{
            paciente.getMedicion().put(LocalDate.now(), medicion);
        }
    }

    public void conocerPesoAltura (LocalDate fecha, Paciente p){
        if(p.getMedicion().containsKey(fecha)){
            System.out.println(p.getMedicion().get(fecha));   //get(key) = getvalue(de la key)
        }
    }

    public void promedioPesoAltura (Paciente p, int anio){
        int altura = 0;
        int peso = 0;
        int cant = 0;
        for(Map.Entry<LocalDate,Medicion> mediciones : p.getMedicion().entrySet()){
            if (mediciones.getKey().getYear() == anio){
                cant ++;
                altura += mediciones.getValue().getAltura();
                peso += mediciones.getValue().getPeso();
            }
            int promAlt = altura/cant;
            int promPeso = peso/cant;
            System.out.println("los promedios son"+ promAlt + promPeso);
        }
    }

    public String porcentajePesoVariacion(Paciente p, LocalDate fecha1, LocalDate fecha2){

        if (corroborarFecha(fecha1,fecha2,p)){
            int pesoOriginal;
            int pesoNuevo;

            if (fecha1.isAfter(fecha2)){
                pesoOriginal = p.getMediciones().get(fecha1).getPeso();
                pesoNuevo = p.getMediciones().get(fecha2).getPeso();
            }
            else {
                pesoOriginal = p.getMediciones().get(fecha2).getPeso();
                pesoNuevo = p.getMediciones().get(fecha1).getPeso();
            }

            double porcentaje = ((double) (pesoOriginal - pesoNuevo) /pesoOriginal) * 0.1;
            return "Porcentaje de variacion: " + porcentaje*100 + "%";
        }
        return "no se encotraron las fechas";

    }

    public String porcentajeAlturaCrecimiento(Paciente p, LocalDate fecha1, LocalDate fecha2){
        if (corroborarFecha(fecha1,fecha2, p)){

            int alturaOriginal;
            int alturaNuevo;

            alturaOriginal = p.getMediciones().get(fecha1).getAltura();
            alturaNuevo =p.getMediciones().get(fecha2).getAltura();
            double porcentaje = ((double) (alturaOriginal - alturaNuevo) /alturaOriginal) * 0.1;

            return "Porcentaje de crecimiento: " + porcentaje * 100 + "%";

        }
        return "no se encontraron las fechas";

    }

    public Boolean corroborarFecha(LocalDate fecha1, LocalDate fecha2, Paciente p){
        if (fecha2 == null){
            return p.getMediciones().containsKey(fecha1);
        }
        else {
            return p.getMediciones().containsKey(fecha1) && p.getMediciones().containsKey(fecha2);
        }
    }

    public LocalDate fechasPesoMayor (Paciente p){
        LocalDate fechaMayor = null;
        int pesoMayor = 0;

        for(Map.Entry<LocalDate,Medicion> mediciones : p.getMedicion().entrySet()){
            if(fechaMayor == null || pesoMayor < mediciones.getValue().getPeso()) {
                pesoMayor = mediciones.getValue().getPeso();
                fechaMayor = mediciones.getKey();
            }
        }
        return fechaMayor;
    }

    public LocalDate fechasPesoMenor (Paciente p){
        LocalDate fechaMenor = null;
        int pesoMenor = 0;

        for(Map.Entry<LocalDate,Medicion> mediciones : p.getMedicion().entrySet()){
            if(fechaMenor == null || pesoMenor > mediciones.getValue().getPeso()) {
                pesoMenor = mediciones.getValue().getPeso();
                fechaMenor = mediciones.getKey();
            }
        }
        return fechaMenor;
    }
}

package fechas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        dia = 8;
        mes = 9;
        anio = 2008;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;

    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void validarFecha(int dia, int mes, int anio) {

        if (anio > 2026) {
            anio = 1900;
        }
        switch(mes) {

            case 1:
                if (dia > 31 || dia < 1) {
                    dia = 1;
                }
                break;

            case 2:
                if (dia > 28 || dia < 1) {
                    dia = 1;
                    break;
                }
            case 3:
                if (dia > 31 || dia < 1) {
                    dia = 1;
                }
                break;

            case 4:
                if (dia > 30 || dia < 1) {
                    dia = 1;
                }
                break;
            case 5:
                if (dia > 31 || dia < 1) {
                    dia = 1;
                }
                break;
            case 6:
                if (dia > 30 || dia < 1) {
                    dia = 1;
                }
                break;
            case 7:
                if (dia > 31 || dia < 1) {
                    dia = 1;
                }
                break;
            case 8:
                if (dia > 31 || dia < 1) {
                    dia = 1;
                }
                break;
            case 9:
                if (dia > 30 || dia < 1) {
                    dia = 1;
                }
                break;
            case 10:
                if (dia > 31 || dia < 1) {
                    dia = 1;
                }
                break;
            case 11:
                if (dia > 30 || dia < 1) {
                    dia = 1;
                }
                break;
            case 12:
                if (dia > 31 || dia < 1) {
                    dia = 1;
                }
                break;

            default:
                mes = 1;


        }
    }

    public int diaMes (int mes){

        switch(mes){

        case 1:
            dia = 31;
            break;

        case 2:
            dia = 28;
            break;

        case 3:
            dia = 31;
            break;

        case 4:
            dia = 30;
            break;

        case 5:
            dia = 31;
            break;

        case 6:
            dia = 30;
            break;

        case 7:
            dia = 31;
            break;

        case 8:
            dia = 31;
            break;

        case 9:
            dia = 30;
            break;

        case 10:
            dia = 31;
            break;

        case 11:
            dia = 30;
            break;

        case 12:
            dia = 31;
            break;

            default:
                System.out.println("El mes no existe. ");

        }

    return dia;
    }

    public void corta(){
        System.out.println(dia+"-"+mes+"-"+anio);
    }

    public void larga(){
        LocalDate fecha = LocalDate.of(anio,mes,dia);
        DayOfWeek diaSemana = fecha.getDayOfWeek();
        YearMonth ym = YearMonth.of(anio,mes);
        System.out.println(diaSemana + " " +dia+" " + ym);
    }

    public void siguiente() {
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        LocalDate maniana = fecha.plusDays(1);
        anio = maniana.getYear();
        mes = maniana.getMonthValue();
        dia = maniana.getDayOfMonth();
    }

    public void anterior() {
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        LocalDate ayer = fecha.minusDays(1);
        anio = ayer.getYear();
        mes = ayer.getMonthValue();
        dia = ayer.getDayOfMonth();
    }

    public boolean igualQue(Fecha fecha){
        boolean esIgual;
        if (dia == fecha.getDia() && mes == fecha.getMes() && anio == fecha.getAnio()){
            esIgual = true;
        }
        else {
            esIgual = false;
        }


        return esIgual;
    }

    public boolean menorQue(Fecha fecha){
        boolean esMenor;

        if (anio < fecha.getAnio())
        {
            esMenor = true;
        }
        else if(mes < fecha.getMes() && anio == fecha.getAnio()){
            esMenor = true;
        }
        else if (dia < fecha.getDia() && mes == fecha.getMes() && anio == fecha.getAnio())
        {
            esMenor = true;
        }
        else {
            esMenor = false;
        }

        return esMenor;
    }

    public boolean mayorQue(Fecha fecha){
        boolean esMayor;

        if (anio > fecha.getAnio())
        {
            esMayor = true;
        }
        else if(mes > fecha.getMes() && anio == fecha.getAnio()){
            esMayor = true;
        }
        else if (dia > fecha.getDia() && mes == fecha.getMes() && anio == fecha.getAnio())
        {
            esMayor = true;
        }
        else {
            esMayor = false;
        }

        return esMayor;

    }
}

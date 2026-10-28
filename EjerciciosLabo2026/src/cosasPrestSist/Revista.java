package cosasPrestSist;

import telefonia.Local;

import java.time.LocalDate;
import java.time.Month;

public class Revista extends Textos implements Prestable{
    private LocalDate fechaPub;

    public LocalDate getFechaPub() {
        return fechaPub;
    }
    public void setFechaPub(LocalDate fechaPub) {
        this.fechaPub = fechaPub;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "Revista{" +
                "fechaPub=" + fechaPub +
                '}';
    }

    @Override
    public void prestar() {
        try {
            puedePrestarse();
            System.out.println("la reviste" + this.getTitulo() + "se dara prestado");
        } catch (NoSePuedePrestarException  e) {
            System.out.println(e.getMessage());
        }
    }



    @Override
    public void puedePrestarse() throws NoSePuedePrestarException {
        if(this.fechaPub.getMonthValue() >= 10){
            throw new NoSePuedePrestarException("La revista se publicó este trimestre");
        }
    }

}
package cosasPrestSist;

import java.util.HashMap;

public class Libro extends Textos implements Prestable {
    private HashMap<Integer, Integer> cantPagsPorCap;

    public HashMap<Integer, Integer> getCantPagsPorCap() {
        return cantPagsPorCap;
    }

    public void setCantPagsPorCap(HashMap<Integer, Integer> cantPagsPorCap) {
        this.cantPagsPorCap = cantPagsPorCap;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                        "Libro{" +
                        "cantPags=" + cantPagsPorCap +
                        '}';
    }

    @Override
    public void prestar() {
        try {
            puedePrestarse();
            System.out.println("El libro" + this.getTitulo() + "se dara prestado");
        } catch (NoSePuedePrestarException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void puedePrestarse() throws NoSePuedePrestarException {
        int cap = 0;
        for (Integer c : cantPagsPorCap.keySet())
            cap++;
        if (cap % 2 == 0) {
            throw new NoSePuedePrestarException("La cantidad de caps es par");
        }
    }

}





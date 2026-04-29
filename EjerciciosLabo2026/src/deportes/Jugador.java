package deportes;

import seresVivos.Persona;

import java.time.LocalDate;

public class Jugador extends Persona {
    private boolean capitan;
    private int dorsal;


    public boolean isCapitan() {
        return capitan;
    }
    public void setCapitan(boolean capitan) {
        this.capitan = capitan;
    }
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }


}

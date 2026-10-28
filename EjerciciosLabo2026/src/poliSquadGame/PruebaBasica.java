package poliSquadGame;

public class PruebaBasica extends Prueba implements Jugable{


    public PruebaBasica(String nombre, int dificultad, String recompensa, Escenario escenario) {
        super(nombre, dificultad, recompensa, escenario);
    }

    @Override
    public void consumirEnergia(Jugador jug) {
        jug.setEnergia(jug.getEnergia() - 10);
    }

    @Override
    public boolean corroborarRiesgo(Jugador jug) {
        return true;
    }


}

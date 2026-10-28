package poliSquadGame;

public class PruebaAvanzada extends Prueba implements Jugable{

    public PruebaAvanzada(String nombre, int dificultad, String recompensa, Escenario escenario) {
        super(nombre, dificultad, recompensa, escenario);
    }

    @Override
    public void consumirEnergia(Jugador jug) {
        jug.setEnergia(jug.getEnergia() - this.getDificultad());
    }

    @Override
    public boolean corroborarRiesgo(Jugador jug) {
        if(jug.getNivelRiesgo() < 30){
            return false;
        }
        return true;
    }


}

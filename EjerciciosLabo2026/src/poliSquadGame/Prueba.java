package poliSquadGame;

public abstract class Prueba {
    private String nombre;
    private int dificultad;
    private String recompensa;
    private Escenario escenario;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDificultad() {
        return dificultad;
    }
    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
    public String getRecompensa() {
        return recompensa;
    }
    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }
    public Escenario getEscenario() {
        return escenario;
    }
    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }


    public Prueba(String nombre, int dificultad, String recompensa, Escenario escenario) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.recompensa = recompensa;
        this.escenario = escenario;
    }
}

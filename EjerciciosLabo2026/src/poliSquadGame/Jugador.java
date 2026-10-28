package poliSquadGame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class  Jugador {
    private String nombre;
    private int numParticipante;
    private int energia;
    private HashSet<String> listaHistorialRecompensas;
    private int nivelRiesgo;
    private HashMap<Prueba, String> listaPruebasDescrip;
    private int vida;
    private boolean eliminado;
    private Prueba pruebaFav;
    private ArrayList<Prueba> listaHistorialPruebasFav;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumParticipante() {
        return numParticipante;
    }
    public void setNumParticipante(int numParticipante) {
        this.numParticipante = numParticipante;
    }
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public HashSet<String> getListaHistorialRecompensas() {
        return listaHistorialRecompensas;
    }
    public void setListaHistorialRecompensas(HashSet<String> listaHistorialRecompensas) {
        this.listaHistorialRecompensas = listaHistorialRecompensas;
    }
    public int getNivelRiesgo() {
        return nivelRiesgo;
    }
    public void setNivelRiesgo(int nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }
    public HashMap<Prueba, String> getListaPruebasDescrip() {
        return listaPruebasDescrip;
    }
    public void setListaPruebasDescrip(HashMap<Prueba, String> listaPruebasDescrip) {
        this.listaPruebasDescrip = listaPruebasDescrip;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public boolean isEliminado() {
        return eliminado;
    }
    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    public Prueba getPruebaFav() {
        return pruebaFav;
    }
    public void setPruebaFav(Prueba pruebaFav) {
        this.pruebaFav = pruebaFav;
    }
    public ArrayList<Prueba> getListaHistorialPruebasFav() {
        return listaHistorialPruebasFav;
    }
    public void setListaHistorialPruebasFav(ArrayList<Prueba> listaHistorialPruebasFav) {
        this.listaHistorialPruebasFav = listaHistorialPruebasFav;
    }


    public Jugador(String nombre, int numParticipante, HashSet<String> listaHistorialRecompensas,
                   HashMap<Prueba, String> listaPruebasDescrip, ArrayList<Prueba> listaHistorialPruebasFav) {
        this.nombre = nombre;
        this.numParticipante = numParticipante;
        this.energia = 100;
        this.listaHistorialRecompensas = listaHistorialRecompensas;
        this.nivelRiesgo = 0;
        this.listaPruebasDescrip = listaPruebasDescrip;
        this.vida = 100;
        this.eliminado = false;
        this.pruebaFav = null;
        this.listaHistorialPruebasFav = listaHistorialPruebasFav;
    }


    public void verificacion() throws NoTieneEnergiaException{
        if(this.energia <= 20){
            throw new NoTieneEnergiaException("El jugador " + this.nombre + " no tiene suficiente energia");
        }
    }

    public void realizarPrueba(Jugable prueba){
        try {
            verificacion();
            prueba.consumirEnergia(this);
        } catch(NoTieneEnergiaException e){
            System.out.println("NO TIENE ENERGIA");
        }
    }


    public void describirPrueba (Prueba p, String descrip){
        if(!(listaPruebasDescrip.containsKey(p))){
            listaPruebasDescrip.put(p, descrip);
        }
        else {
            System.out.println("La prueba ya fue descripta");
        }
    }

    public void recibirDanio(int danio){
        this.setVida(vida - danio);
        this.corroborarEliminacion();
    }

    public void terminarPrueba(String recompensa){
            this.listaHistorialRecompensas.add(recompensa);
    }


    public boolean corroborarEliminacion(){
        if(this.vida <= 0){
            this.eliminar();
        }
        else if (this.nivelRiesgo >= 100) {
            this.eliminar();
        }
        return true;
    }

    public boolean eliminar(){
        this.setEliminado(true);
        System.out.println("El jugador " + this.getNombre() + " fue eliminado");
        return false;
    }



    public void registrarPruebaFav(Prueba pru) throws PruebaYaElegidaActualmenteExcepcion{
        if(this.getPruebaFav() != pru){
            this.getListaHistorialPruebasFav().add(pru);
            System.out.println("La prueba " + pru + " fue actualizada exitosamente");
        }
        else if (this.getPruebaFav() == pru) {
            throw new PruebaYaElegidaActualmenteExcepcion("La prueba " + pru + " esta elegida actualmente");
        }
    }
}

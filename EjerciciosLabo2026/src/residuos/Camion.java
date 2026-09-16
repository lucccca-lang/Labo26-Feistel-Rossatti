package residuos;

import java.util.HashSet;

public class Camion {
    private int patente;
    private String marca;
    private String modelo;
    private int capMax;
    public static int autonomia = 45;
    private HashSet<TipoResiduo> tipoResAutorizado;

    public int getPatente() {
        return patente;
    }
    public void setPatente(int patente) {
        this.patente = patente;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getCapMax() {
        return capMax;
    }
    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }
    public static int getAutonomia() {
        return autonomia;
    }
    public static void setAutonomia(int autonomia) {
        Camion.autonomia = autonomia;
    }
    public HashSet<TipoResiduo> getTipoResAutorizado() {
        return tipoResAutorizado;
    }
    public void setTipoResAutorizado(HashSet<TipoResiduo> tipoResAutorizado) {
        this.tipoResAutorizado = tipoResAutorizado;
    }

    public Camion(int patente, String marca, String modelo, int capMax, HashSet<TipoResiduo> tipoResAutorizado, int autonomia) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.capMax = capMax;
        this.tipoResAutorizado = tipoResAutorizado;
        Camion.autonomia = autonomia;
    }



}

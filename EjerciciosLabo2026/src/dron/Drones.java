package dron;

import java.time.LocalDate;

public abstract class Drones {
    public String modelo;
    public LocalDate fechaAdquisicion;
    public int nivelCarga;
    public int dronesOperativos;
    public Estado estadoDron;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }
    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }
    public int getNivelCarga() {
        return nivelCarga;
    }
    public void setNivelCarga(int nivelCarga) {
        this.nivelCarga = nivelCarga;
    }
    public int getDronesOperativos() {
        return dronesOperativos;
    }
    public void setDronesOperativos(int dronesOperativos) {
        this.dronesOperativos = dronesOperativos;
    }
    public Estado getEstadoDron() {
        return estadoDron;
    }
    public void setEstadoDron(Estado estadoDron) {
        this.estadoDron = estadoDron;
    }

    public Drones(String modelo, LocalDate fechaAdquisicion, int nivelCarga, int dronesOperativos, Estado estadoDron) {
        this.modelo = modelo;
        this.fechaAdquisicion = fechaAdquisicion;
        this.nivelCarga = nivelCarga;
        this.dronesOperativos = dronesOperativos;
        this.estadoDron = estadoDron;
    }

    public int recargarBateria(){
        if ((this.nivelCarga+10) <=90 && this.nivelCarga >=20) {
            setNivelCarga(getNivelCarga() + 10);
        }
        else if(this.nivelCarga > 90 && this.nivelCarga < 100 || this.nivelCarga < 20){
            setNivelCarga(100);
        }
        else if (this.nivelCarga == 100){
            System.out.println("la bateria ya esta cargada al maximo");
        }
        return this.nivelCarga;
    }

    public abstract void ejecutarMision();
    public abstract boolean comunicarAlSistema();


    public void calcularDistancia(double latitudDestino, double longitudDestino) {
        // Convertir a radianes
        double lat1Rad = Math.toRadians(34.573195);
        double lon1Rad = Math.toRadians(-58.504111);
        double lat2Rad = Math.toRadians(latitudDestino);
        double lon2Rad = Math.toRadians(longitudDestino);
        // Fórmula de Haversine
        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double radioTierraKm = 6371;
        return radioTierraKm * c;
    }
}

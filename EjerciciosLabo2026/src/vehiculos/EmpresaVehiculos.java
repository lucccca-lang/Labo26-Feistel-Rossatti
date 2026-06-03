package vehiculos;

import java.util.ArrayList;

public class EmpresaVehiculos {
    private ArrayList<Vehiculo> vehiculos;


    public void agregarVehiculo(Vehiculo veh) {
        if (veh.getPatente().isEmpty()) {
            vehiculos.add(veh);
        } else if (chequearPatenteRepetida(veh)) {
            System.out.println("La patente ya esta alistada");
        } else {
            vehiculos.add(veh);
        }
    }

    public boolean chequearPatenteRepetida(Vehiculo veh) {
        for (Vehiculo v : vehiculos) {
            if (v.getPatente().equals(veh.getPatente())) {
                return true;
            }
        }
        return false;
    }

    public void masCant() {
        int autos = 0;
        int camiones = 0;
        int bicis = 0;

        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche) {
                autos++;
            } else if (v instanceof Camion) {
                camiones++;
            } else {
                bicis++;
            }
            if (autos > camiones && autos > bicis) {
                System.out.println("Hay mayor cantidad de autos");
            } else if (bicis > camiones && bicis > autos) {
                System.out.println("Hay mayor cantidad de bicis");
            } else {
                System.out.println("Hay mayor cantidad de camiones");
            }
        }
    }

    public int porcentajeDesc(Coche auto) {
        int cont = 0;
        if (auto.isDescapotable()) {
            cont++;
        }
        return cont * 100 / vehiculos.size();
    }

    public void cargarCamion(Camion cam, int carga) {
        if (carga <= cam.getCapCarga()) {
            cam.setCapActual(cam.getCapActual() - carga);
        } else {
            System.out.println("la carga a sumar es mas grande que la capacidad del camión");
        }
    }

    public static void main(String[] args) {
        Camion c1 = new Camion("Scania", "1xx", Color.ROJO, 6, 1990, "ABC123", 1000,500);
        Coche co1 = new Coche("Ford", "239", Color.NEGRO, 4, 2000, "ab000th", 50,true);

    }
}
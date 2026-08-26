package appMascotas;

import seresVivos.Persona;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Mascotas> listaMasc;


    public void alta(String nombre, String dueño, TipoMascota tipo) {
        switch (tipo) {
            case PAJAROCANTOR:
                PajaroCantor pc = new PajaroCantor(nombre, dueño, tipo, "no tengo que volver, si nunca me fui");
                listaMasc.add(pc);
                break;

            case PAJARONOCANTOR:
                PajaroNoCantor pn = new PajaroNoCantor(nombre, dueño, tipo);
                listaMasc.add(pn);
                break;
            case GATO:
                Gato g = new Gato(nombre, dueño, tipo);
                listaMasc.add(g);
                break;
            case PERRO:
                Perro p = new Perro(nombre, dueño, tipo);
                listaMasc.add(p);
                break;


        }

    }
    public void eliminarMasc(Mascotas mascota){
        listaMasc.remove(mascota);
    }
    public void modificarMasc(Mascotas mascNueva, Mascotas mascVieja){
        listaMasc.remove(mascVieja);
        listaMasc.add(mascNueva);
    }

    public String saludar(String nombre_usuario, String nombre_mascota){
        String saludo = null;
        Mascotas mascota = obtenerMascota(nombre_mascota);

        if (mascota == null) {
            saludo = "Esa mascota no se encontro";
        }

        else {
            if (mascota instanceof Pez) {
                vidaPez(nombre_usuario, (Pez) mascota);

            }


            if (mascota.esDuenio(nombre_usuario)) {
                saludo = mascota.saludar();
            }

            else if (!(mascota instanceof Pajaro)) {
                saludo = mascota.saludar().toUpperCase() + "!";
            }
            saludo = repetirSaludo_Alegria(saludo, mascota);
        }
        return saludo;
    }

    public String repetirSaludo_Alegria(String saludo, Mascotas mascota){
        String saludo_inicial = saludo;

        if (mascota.getFelicidad() > 0){
            for (int i = 0; i < mascota.getFelicidad() ; i++){
                saludo = saludo + " " + saludo_inicial;
            }
        }

        mascota.bajarFelicidad();

        return saludo;
    }

    public void vidaPez(String dueño, Pez pez){
        if (pez.getDueño()){
            pez.restarVida();
        }
        else {
            pez.morir();
        }

        comprobarVidas(pez);
    }

    public void comprobarVidas(Pez pez){
        if (pez.getVidas() <= 0){
            eliminarMasc(pez);
        }

    }

    public Mascotas obtenerMascota(String nombreMascota){
        for (Mascotas mascota : listaMasc)
        {
            if (mascota.getNombre().equals(nombreMascota))
            {
                return mascota;
            }
        }
        return null;
    }
}

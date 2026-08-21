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

    public String saludar(String nombreUsuario, Mascotas m1){

        if (nombreUsuario == m1.getDueño()){
            return m1.saludo();
        }
        else {
            return ""
        }
    }
}

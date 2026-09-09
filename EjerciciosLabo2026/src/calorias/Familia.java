package calorias;

import appRecetas.Plato;

import java.util.HashSet;
import java.util.Map;

public class Familia {
    HashSet<Integrante> integrantesFamilia;

    public void agregarIntegrante (Integrante integ){
        if (integrantesFamilia.contains(integ)){
            System.out.println("El integrante ya esta agregado");
        }
        else {
            integrantesFamilia.add(integ);
        }
    }

    public void eliminarIntegrante (Integrante integ){
        if (!integrantesFamilia.contains(integ)){
            System.out.println("El integrante no esta agregado");
        }
        else {
            integrantesFamilia.remove(integ);
        }
    }

    public void registrarConsumo (Integrante integ, Platos plato){
         if(integ.getListaPlatos().containsKey(plato)){
             integ.getListaPlatos().put(plato, integ.getListaPlatos().get(plato) + 1);
         }
         else {
             integ.getListaPlatos().put(plato, 1);
         }
    }

    public Integrante masCalorias(){
        Integrante integranteMayor = null;
        int calorias = 0;
        for (Integrante integrante : integrantesFamilia){
            if (integranteMayor == null || calorias < integrante.obtenerCalorias()){
                integranteMayor = integrante;
                calorias = integrante.obtenerCalorias();
            }
        }
        return integranteMayor;
    }

    public Integrante menosCalorias(){
        Integrante integranteMenor = null;
        int calorias = 0;
        for (Integrante integrante : integrantesFamilia){
            if (integranteMenor == null || calorias > integrante.obtenerCalorias()){
                integranteMenor = integrante;
                calorias = integrante.obtenerCalorias();
            }
        }
        return integranteMenor;
    }

    public double promedioFamilia(){
        int cant = 0;
        double suma = 0;
        for (Integrante integrante : integrantesFamilia){
            suma += integrante.obtenerCalorias();
            cant += integrante.cantidadPlatos();
        }
        return suma / cant;
    }

    public HashSet<Integrante> integrantesComieronPlato(Platos plato){
        HashSet<Integrante> lista = new HashSet<>();
        for (Integrante integrante : integrantesFamilia){
            if (integrante.tienePlato(plato)){
                lista.add(integrante);
            }
        }
        return lista;
    }

    public HashSet<Platos> platosDistintosFamilia() {
        HashSet<Platos> platosDistintos = new HashSet<>();

        for (Integrante integrante : integrantesFamilia) {
            for (Platos plato : integrante.getListaPlatos().keySet()) {
                platosDistintos.add(plato);
            }
        }
        return platosDistintos;
    }

    public Platos obtenerPlatoPreferido(Integrante integrante) {
        if (integrantesFamilia.contains(integrante)) {
            return integrante.platoPreferido();
        }
        System.out.println("El integrante no pertenece a la familia.");
        return null;
    }

}

package calorias;

import appRecetas.Plato;

import java.util.HashSet;

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




}

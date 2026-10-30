package negocioJuliMigue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {
    HashMap<Preparacion, Integer> listaPreparaciones;
    HashMap<Vendible, Integer> listaHistorialVentas;

    public Sistema(HashMap<Preparacion, Integer> listaPreparaciones, HashMap<Vendible, Integer> listaHistorialVentas) {
        this.listaPreparaciones = listaPreparaciones;
        this.listaHistorialVentas = listaHistorialVentas;
    }

    public void registrarVenta(Vendible prod, int cantReq){
        if (prod.actualizarStock(cantReq)) {
            System.out.println("Venta cargada con exito");
            this.listaHistorialVentas.put(prod, cantReq);
        }
    }



    public void nuevaPreparacion(Preparacion preparacion, int cantNueva) throws IngredienteInvalidoExeception{
        if(preparacion.verificarIngredientes() && this.listaPreparaciones.containsKey(preparacion)){
            this.listaPreparaciones.put(preparacion, this.listaPreparaciones.get(preparacion) + cantNueva);
            System.out.println("Se ha agregado correctamete la preparacion");
        }
        else if(preparacion.verificarIngredientes()){
            this.listaPreparaciones.put(preparacion, cantNueva);
            System.out.println("Se ha agregado correctamente la preparacion");
        }
        else {
            throw new IngredienteInvalidoExeception("Ingrediente con cantidades invalidas");
        }
    }

    public void reponerProducto(Preparacion preparacion, int cantNueva) {
        if(this.listaPreparaciones.containsKey(preparacion) && cantNueva > 0){
            this.listaPreparaciones.put(preparacion, this.listaPreparaciones.get(preparacion) + cantNueva);
            System.out.println("El stock nuevo de " + this.listaPreparaciones.get(preparacion));
        }
        else{
            System.out.println("El stock nuevo no aumenta el stock ya anotado");
        }
    }

    public void cantProdVendible(){
        int cant = 0;
        for (Preparacion preparacion : listaPreparaciones.keySet()){
            if(preparacion instanceof Vendible){
                cant++;
            }
        }
        System.out.println("La cantidad de productos que están a la venta son: " + cant);
    }

}


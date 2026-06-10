package empAgro;

import java.util.ArrayList;

public class EmpresaAgro {
    private ArrayList<Producto> listaProductos;

    public void agregarProducto(Producto producto) {

       /* if (producto instanceof ProdFresco) {
            prodFrescos.add((ProdFresco) producto);
        }
        else if (producto instanceof ProdRefrigerado) {
            prodRefrigerados.add((ProdRefrigerado) producto);
        }
        else{
            System.out.println("Producto no pertenece a estas listas");
        }*/

        if(!listaProductos.contains(producto)){
            listaProductos.add(producto);
        }
        else{
            System.out.println("Lista ya contiene ese producto");
        }
    }


    public String infoProducto(Producto producto){
        String info = producto.getCodId() + "" + producto.getNumLote();
        return info;
    }

    public int prodFrescoEnEmpMasReciente()
}

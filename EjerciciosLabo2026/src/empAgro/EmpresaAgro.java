package empAgro;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmpresaAgro {
    private ArrayList<Producto> listaProductos;

    public void agregarProducto(Producto producto) {
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

    public int prodFrescoEnEmpMasReciente(){
        Producto p1 = listaProductos.get(0);
        int fechanum = 0;

        for(Producto p : listaProductos) {
                if (p.prodMasRecienteEnv(p1)) {
                    fechanum = p.getNumLote();
                    p1 = p;
                }
        }
        return fechanum;
    }

    public void cantProducto() {
        for (PaisOrigen pais : PaisOrigen.values()) {
            int contadorPaisOrigen = 0;
            for (Producto prod : listaProductos) {
                if (prod.getPaisOrigen().equals(pais)) {
                    contadorPaisOrigen++;
                }
            }
            System.out.println(pais + "-" + contadorPaisOrigen);
        }
    }


}

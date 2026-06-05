package tiendaElectronica;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> productos;

    public void agregarProducto(Producto producto){
        if(productos.contains(producto)){
            System.out.println("El producto ya existe");
        }
        else{
            productos.add(producto);
        }
    }

    public void modificarProducto(Producto producto, float precio, int stock){
        if(productos.contains(producto)){
            producto.setPrecio(precio);
            producto.setStock(stock);
        }
        else{
            System.out.println("El producto no existe");
        }
    }

    public void eliminarProducto(Producto producto){
        if(productos.contains(producto)){
            productos.remove(producto);
        }
        else{
            System.out.println("El producto no existe");
        }
    }

    public Producto mayorStock(){
        Producto mayor = productos.getFirst();
        int mas = productos.getFirst().getStock();

        for (int i = 1 ; i<productos.size(); i++){
            if (productos.get(i).getStock() > mas){
                mayor = productos.get(i);
                mas = productos.get(i).getStock();
            }
        }
        return mayor;
    }

    public Producto menorStock(){
        Producto menor = productos.getFirst();
        int menos = productos.getFirst().getStock();

        for (int i = 1 ; i<productos.size(); i++){
            if (productos.get(i).getStock() < menos){
                menor = productos.get(i);
                menos = productos.get(i).getStock();
            }
        }
        return menor;
    }

    public void mostrarProductosSeccion(Seccion seccion){
        System.out.println("Productos de: " + seccion.name());

        for (Producto producto : productos){
            if (producto.getSeccion().equals(seccion)){
                System.out.println(producto.toString());
            }
        }
    }
}

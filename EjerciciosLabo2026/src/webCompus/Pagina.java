package webCompus;

import seresVivos.Persona;

import java.util.ArrayList;

public class Pagina {

    private ArrayList<Compra>compras;
    private ArrayList<Componente>componentes;

    public Pagina() {
        this.compras = new ArrayList<>();
        this.componentes = new ArrayList<>();
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }
    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }
    public ArrayList<Compra> getCompras() {
        return compras;
    }
    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public void actualizarPrecioComponente(int aumento, Componente componente){
        float porcentaje = componente.getPrecioVenta() * ((float) aumento /100);

        componente.setPrecioVenta(componente.getPrecioVenta() + porcentaje);
    }

    public Compra compra(Cliente cliente, MetodoPago metodo, Computadora computadora){
        if (computadora.ComputadoraValida()){
            if (hayStock(computadora)){
                Compra compra = new Compra (cliente, metodo, computadora);
                actualizarStock(computadora);
                compras.add(compra);
                return compra;
            }
            else {
                System.out.println("No hay stock suficiente en la tienda");
            }
        }
        else {
            System.out.println("Le faltan componentes a la computadora");
        }

        return null;


    }

    public boolean hayStock(Computadora computadora){

        for (Componente componente : computadora.getComponentes()){
            int cont=1;
            for (Componente componente1 : computadora.getComponentes()){
                if (componente.equals(componente1)){
                    cont++;
                }
            }
            if (componente.getStock()< componente.getStock()-cont){
                return false;
            }
        }
        return true;
    }

    public void actualizarStock(Computadora computadora){
        for (Componente componente : computadora.getComponentes()){
            componente.setStock(componente.getStock() - 1);
        }
    }

    public Componente calcularMasVendido(){
        int cont1 = 0;
        Componente top1 = null;

        for(Componente componente : componentes){
            int cont = 0;
            for(Compra compra : compras){

                if (compra.getComputadora().getComponentes().contains(componente)){
                    cont ++;
                }

            }

            if (cont > cont1){
                cont1 = cont;
                top1 = componente;
            }

        }
        return top1;
    }

    public void cantEntradaySalida(Computadora computadora){
        String cantDisp = "";

        for (Compra compra : compras){
            if (compra.getComputadora().equals(computadora)){
                cantDisp = computadora.contarDispositivos();
            }
        }

        System.out.println(cantDisp);

    }


    /*public void componenteMasVendido(){
        if (!compras.isEmpty()){
            Componente top1 = calcularMasVendido();
            System.out.println("El componente mas vendido es: " + top1.getModelo());
        }
    }*/


    public void mostrarDetalledeCompra(Compra compra){
        System.out.println(compra.detalleCompra());
    }

    public static void main(String[] args) {
        Pagina sistema = new Pagina();

        Cliente cliente1 = new Cliente("Ana", "Lopez", 1111-1111);
        Cliente cliente2 = new Cliente("Bruno", "Diaz", 2222-2222);
        Cliente cliente3 = new Cliente("Carla", "Mendez", 3333-3333);

        Cpu cpuAmd = new Cpu("AMD", "Ryzen 7 7800X", 250000F, 3);
        Cpu cpuIntel = new Cpu("Intel", "i7 13700OL", 270000F, 2);
        Teclado tecladoLogi = new Teclado("Redragon", "Kumara k552 autumn", 15000F, 4, 1,"USB");
        Mouse mouseLogi = new Mouse("Razer", "Viper Mini", 120000F, 4, 1,"USB");
        Pantalla monitorSamsung = new Pantalla("Zowie", "T350", 180000F, 2, 2);
        Impresora hpLaser = new Impresora("HP", "LaserJet", 210000F, 1, 1, MetodoImpresion.LASER);

        sistema.getComponentes().add(cpuAmd);
        sistema.getComponentes().add(cpuIntel);
        sistema.getComponentes().add(tecladoLogi);
        sistema.getComponentes().add(mouseLogi);
        sistema.getComponentes().add(monitorSamsung);
        sistema.getComponentes().add(hpLaser);


        Computadora pc1 = new Computadora();
        pc1.agregarComponente(cpuAmd);
        pc1.agregarComponente(tecladoLogi);
        pc1.agregarComponente(monitorSamsung);



        Computadora pc2 = new Computadora();
        pc2.agregarComponente(cpuIntel);
        pc2.agregarComponente(mouseLogi);
        pc2.agregarComponente(hpLaser);


        MetodoPago efectivo = new Efectivo();
        MetodoPago tarjeta = new Tarjeta(12345678, "Galicia", CredDeb.CREDITO);

        System.out.println("Precio total PC1: " + pc1.calcularPrecio());
        System.out.println("Precio total PC2: " + pc2.calcularPrecio());

        Compra compra1 = sistema.compra(cliente1, efectivo, pc1);
        Compra compra2 = sistema.compra(cliente2, tarjeta, pc2);
        Compra compra3 = sistema.compra(cliente3, tarjeta, pc1);

        sistema.mostrarDetalledeCompra(compra2);

        System.out.println("Dispositivos de entrada y salida de la PC1: ");
        sistema.cantEntradaySalida(pc1);

        /*sistema.componenteMasVendido();*/


    }
}

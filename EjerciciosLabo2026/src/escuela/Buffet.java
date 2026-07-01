package escuela;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Buffet {
    private ArrayList<Plato> menu;
    private ArrayList<Pedido> pedidos;

    public ArrayList<Plato> getMenu() {
        return menu;
    }
    public void setMenu(ArrayList<Plato> menu) {
        this.menu = menu;
    }
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Buffet() {
        this.menu = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void agregar(Plato plato){
        if(menu.isEmpty()){
            menu.add(plato);
        }
        else if (!menu.contains(plato)) {
            menu.add(plato);
        }
    }

    public void modificar(int valor, Plato plato){
        if (menu.contains(plato)) {
            plato.setPrecio(valor);
        }
    }

    public void eliminar (Plato plato){
        menu.remove(plato);
    }

    public Pedido crearPedido(LocalDate fechaCreacion, Plato plato, PersonaEducativa persona, LocalTime horaEntrega, boolean entregado) {
        Pedido pedido = new Pedido(fechaCreacion, plato, persona, horaEntrega, entregado);
        this.pedidos.add(pedido);
        return pedido;
    }

    public void pedidosPendientes(){
        for (Pedido p: pedidos){
            if (!p.isEntregado()){
                System.out.println(p.getPlato().getNombre() + " pertenece a " + p.getPersona().getNombre());
            }
        }
    }

    public void extraerPlatos (LocalDate fecha){
        for(Pedido p : pedidos){
            if(p.getFechaCreacion().equals(fecha)){
                System.out.println("Plato: " + p.getPlato().getNombre() + "Precio final" + p.chequearDescuento());
            }
        }
    }

    public void top3(){
        int cont1=0, cont2=0, cont3=0;
        Plato top1= null, top2=null, top3=null;
        for (Plato platos : menu){
            int cont = 0;
                for (Pedido pedido : pedidos){
                    if (pedido.getPlato().equals(platos)){
                        cont++;
                    }
                }

                if (cont>cont1){

                    cont3=cont2;
                    top3=top2;

                    cont2=cont1;
                    top2=top1;

                    cont1=cont;
                    top1=platos;
                }
            if (cont>cont2){

                cont3=cont2;
                top3=top2;

                cont2=cont;
                top2=platos;
            }
            if (cont>cont3){

                cont3=cont;
                top3=platos;
            }

        }
    }

    public void mostrarTop(Plato top1, Plato top2, Plato top3, int cont1, int cont2, int cont3){

        if (top1!= null){
            System.out.println("1- "+ top1.getNombre()+ " lo pidieron " + cont1 + " veces");
        }
        if(top2!=null){
            System.out.println("2- " + top2.getNombre()+" lo pidieron " + cont2 + " veces");
        }
         if(top3!=null){
             System.out.println("3- " + top3.getNombre()+ " lo pidieron " + cont3 + " veces");
         }
    }

    public void entregarPedido(Pedido pedido) {
        pedido.setEntregado(true);
    }

    public static void main(String[] args) {
        Buffet buffet = new Buffet();

        Plato plato1 = new Plato("Hamburguesa", 13000);
        Plato plato2 = new Plato("Milanesa Napolitana", 16000);
        Plato plato3 = new Plato("Cappelletti",5000);
        Plato plato4 = new Plato("Pancho", 8500);

        buffet.agregar(plato1);
        buffet.agregar(plato2);
        buffet.agregar(plato3);
        buffet.agregar(plato4);

        Alumno alumno1 = new Alumno("Rodrigo", "Perez", 1);
        Alumno alumno2 = new Alumno("Lucas", "Gomez", 2);
        Alumno alumno3 = new Alumno("Mateo", "Fernandez", 1);

        Profesor profesor1 = new Profesor("Valentino", "Sanchez");
        Profesor profesor2 = new Profesor("Martin", "Lopez");
        Profesor profesor3 = new Profesor("Javier", "Ramirez");

        Pedido pedido = buffet.crearPedido(LocalDate.now(),plato1,alumno1, LocalTime.now(),false);
        Pedido pedido1 = buffet.crearPedido(LocalDate.now(),plato1,profesor1,LocalTime.now(),false);

        buffet.extraerPlatos(LocalDate.now());

        buffet.modificar(100,plato2);
        buffet.eliminar(plato3);
    }
}

//no pudimos hacer todo, nos falto el top, lo pensamos y no pudimos entender que hacer
//dimos lo mejor de nosotros, <3
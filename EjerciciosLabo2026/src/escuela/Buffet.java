package escuela;

import seresVivos.Persona;

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

    public Pedido crearPedido(LocalDate fechaCreacion, Plato plato, Persona persona, LocalTime horaEntrega, boolean entregado) {
        Pedido pedido = new Pedido(fechaCreacion, plato, persona, horaEntrega, entregado);
        this.pedidos.add(pedido);
        return pedido;
    }

    public void pedPendientes(){
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

//no pudimos hacer todo, nos falto el top y la entrega de pedidos, lo pensamos y no pudimos entender que hacer
//dimos lo mejor de nosotros, <3
package webCompus;

public class Compra {
    private Cliente cliente;
    private MetodoPago metodoPago;
    private Computadora computadora;
    private float precioTotal;

    public Compra(Cliente cliente, MetodoPago metodoPago, Computadora computadora) {
        this.cliente = cliente;
        this.metodoPago = metodoPago;
        this.computadora = computadora;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public MetodoPago getMetodoPago() {
        return metodoPago;
    }
    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
    public Computadora getComputadora() {
        return computadora;
    }
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
    public float getPrecioTotal() {
        return precioTotal;
    }
    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public float agegarRecargo(){
        float recargo = computadora.getPrecioTotal() * metodoPago.recargo();
        return computadora.getPrecioTotal() + recargo;
    }


    public String detalleCompra(){
        return "Cliente: " + cliente.datosCliente() + '\n'
                +"Metodo de Pago: " + metodoPago.metodo()
                + "--Componentes PC --" + '\n'
                + computadora.detalleComponentes()
                + "-------------------" + '\n'
                + "Subtotal: $" + computadora.calcularPrecio() + '\n'
                + "Recargo: " + (metodoPago.recargo() * 100) + "%" + '\n'
                + "Total: $" + precioTotal + '\n';
    }
}

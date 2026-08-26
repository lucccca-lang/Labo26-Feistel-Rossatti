package appMascotas;

public class PajaroNoCantor extends Pajaro{
    public PajaroNoCantor(String nombre, String dueño, TipoMascota tipoMascota) {
        super(nombre, dueño, tipoMascota);
    }

    @Override
    public TipoMascota tipoMascota() {
        return TipoMascota.PAJARONOCANTOR;
    }
}

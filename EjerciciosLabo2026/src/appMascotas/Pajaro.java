package appMascotas;

public abstract class Pajaro extends Mascotas {

    public Pajaro(String nombre, String dueño, TipoMascota tipoMascota) {
        super(nombre, dueño, tipoMascota);
    }

    @Override
    public String saludo() {
        return "pio";
    }


}
package appMascotas;

public class Gato extends Mascotas{


    public Gato(String nombre, String dueño, TipoMascota tipoMascota, int felicidad) {
        super(nombre, dueño, tipoMascota, felicidad);
    }

    @Override
    public String saludo() {
        return "miau";
    }
    @Override
    public TipoMascota tipoMascota() {
        return TipoMascota.GATO;
    }

}

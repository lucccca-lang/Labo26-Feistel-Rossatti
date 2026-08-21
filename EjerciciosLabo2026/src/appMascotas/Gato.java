package appMascotas;

public class Gato extends Mascotas{


    public Gato(String nombre, String dueño, TipoMascota tipoMascota) {
        super(nombre, dueño, tipoMascota);
    }

    @Override
    public String saludo() {
        return "miau";
    }
}

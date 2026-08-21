package appMascotas;

public class Perro extends Mascotas {


    public Perro(String nombre, String dueño, TipoMascota tipoMascota) {
        super(nombre, dueño, tipoMascota);
    }

    @Override
    public String saludo() {
        return "guaf";
    }
}

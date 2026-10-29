package fabricaPoloNorte;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    static void main() {
        Aprendiz a1 = new Aprendiz("Fede", "Gonzales", LocalDate.of(2000, 10, 3),
                "Monte llano",Taller.ROJO, new HashSet<>());

        Aprendiz a2 = new Aprendiz("Geronimo", "Perez", LocalDate.of(1990, 10, 17),
                "Treboles",Taller.DORADO, new HashSet<>());

        Oficial o1 = new Oficial("Lucas", "Fernandez", LocalDate.of(1993, 2, 24),
                "Revuelto", Taller.ROJO, new HashMap<>());

        Oficial o2 = new Oficial("Pedro", "Fernandez", LocalDate.of(1999, 2, 25),
                "Revuelto", Taller.VERDE, new HashMap<>());

        MaestroArtesano ma1 = new MaestroArtesano("Roberto", "Toma", LocalDate.of(2005, 8, 21),
               "Operaser", Taller.DORADO);

        MaestroArtesano ma2 = new MaestroArtesano("Tobias", "Perta", LocalDate.of(1980, 10, 4),
                "Yertbah", Taller.ROJO);

        Regalo r1 = new Regalo(Tamanio.GRANDE, "Auto");
        Regalo r2 = new Regalo(Tamanio.MEDIANO, "Tele");
        Regalo r3 = new Regalo(Tamanio.PEQUENIO, "Juguete");

        a1.getListaMatProhibidos().add("Piedra");
        a1.getListaMatProhibidos().add("Papel");
        a2.getListaMatProhibidos().add("Plastico");
        a2.getListaMatProhibidos().add("Madera");

        o1.getListaStockMateriales().put("Piedra", 1);
        o1.getListaStockMateriales().put("Plastico", 0);
        o2.getListaStockMateriales().put("Papel", 2);
        o2.getListaStockMateriales().put("Madera", 1);



        a1.prepararEstacionTrabajo();

        o1.prepararEstacionTrabajo();

        ma1.prepararEstacionTrabajo();


        try{
            a2.fabricar(r3, "Plastico");
        }
        catch (RegaloNoLePerteneceException| UsoDeMaterialProhibidoException | ExcedioElTiempoDispoException | NoTieneMaterialesNecesariosException e){
            System.out.println(e.getMessage());
        }

        try{
            o2.fabricar(r2, "Papel");
        }
        catch (RegaloNoLePerteneceException| UsoDeMaterialProhibidoException | ExcedioElTiempoDispoException | NoTieneMaterialesNecesariosException e){
            System.out.println(e.getMessage());
        }

        try{
            ma2.fabricar(r1, "Madera");
        }
        catch (RegaloNoLePerteneceException| UsoDeMaterialProhibidoException | ExcedioElTiempoDispoException | NoTieneMaterialesNecesariosException e){
            System.out.println(e.getMessage());
        }

    }
}

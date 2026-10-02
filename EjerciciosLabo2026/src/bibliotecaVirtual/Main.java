package bibliotecaVirtual;

import java.time.LocalDate;
import java.util.HashSet;

public class Main {
    static void main(String[] args) {
        Sistema sistema = new Sistema();
        Autor autor = new Autor("sasad", LocalDate.now(), 49832633, new HashSet<>());
        LibroElectronico libro = new LibroElectronico("La divina comedia", Genero.NO_FICCIÓN, autor, "ajksad", 67);
        LibroElectronico libro1 = new LibroElectronico("asdh", Genero.FICCIÓN, autor, "apsopao", 80);
        LibroElectronico libro2 = new LibroElectronico("gafasds", Genero.AVENTURA, autor, "ajksad", 40);
        LibroElectronico libro3 = new LibroElectronico("zdxasdasdw", Genero.ROMANCE, autor, "asgdsg", 120);
        LibroElectronico libro4 = new LibroElectronico("dksamdzxd", Genero.SAGA, autor, "nbvc", 140);
        LibroElectronico libro5 = new LibroElectronico("dasdasg", Genero.AVENTURA, autor, "fghfds", 145);




        Usuario u1 = new Usuario("facu", LocalDate.now(), 48574654, "asjdjaf@mail", Membresia.BRONCE, new HashSet<>());
        Usuario u2 = new Usuario("lucca", LocalDate.now(), 98453622, "gdfsg@mail", Membresia.PLATA, new HashSet<>());
        Usuario u3 = new Usuario("valle", LocalDate.now(), 50987654, "vcbgnf@mail", Membresia.ORO,new HashSet<>());
        Usuario u4 = new Usuario("thiago", LocalDate.now(), 48098345, "jfgckh@mail", Membresia.ORO,new HashSet<>());
        sistema.agregarLibro(libro);
        sistema.agregarLibro(libro2);
        sistema.agregarLibro(libro1);
        sistema.agregarLibro(libro3);
        sistema.agregarLibro(libro4);
        sistema.agregarLibro(libro5);
        u2.getLibrosDescargados().add(libro5);
        u2.getLibrosDescargados().add(libro4);
        u2.getLibrosDescargados().add(libro3);
        u2.getLibrosDescargados().add(libro2);
        u2.getLibrosDescargados().add(libro1);

        libro.setDescargasActuales(145);
        libro.setDescargasActuales(0);

        try {
            System.out.println("intentar descargas limite");
            sistema.tomarPrestadoLibro(libro5, u1);
        } catch (LimitePrestamosAlcanzadosException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("chequear disponibilidad membresia");
            sistema.verificarLimMembresia(u2, libro2);
        } catch (MembresiaException e) {
            System.out.println(e.getMessage());
        }

    }
}
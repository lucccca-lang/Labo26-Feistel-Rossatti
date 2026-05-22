package EjLlamadasProfe;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("IPM Sistemas");

        Empleado ana = new Empleado("Ana", "Lopez", "111", "Argentina", "1111", "Buenos Aires", "+54", "GMT-3");
        Empleado juan = new Empleado("Juan", "Perez", "222", "Argentina", "2222", "Cordoba", "+54", "GMT-3");
        Empleado maria = new Empleado("Maria", "Silva", "333", "Uruguay", "3333", "Montevideo", "+598", "GMT-3");

        empresa.agregarEmpleado(ana);
        empresa.agregarEmpleado(juan);
        empresa.agregarEmpleado(maria);

        // Ana llama a Juan. Como ambos son de Argentina, se crea una LlamadaLocal.
        empresa.registrarLlamada(ana, "2222", 5);

        // Ana llama a Maria. Como son de paises distintos, se crea una LlamadaInternacional.
        empresa.registrarLlamada(ana, "3333", 3);

        // No se registra porque el numero no pertenece a ningun empleado cargado.
        boolean seRegistro = empresa.registrarLlamada(ana, "9999", 10);
        System.out.println("Se registro la llamada al 9999? " + seRegistro);
        System.out.println();

        empresa.mostrarTodasLasLlamadas();
        empresa.mostrarLlamadasDe(ana);

        empresa.mostrarRankingEmpleadosQueMasTiempoLlamaronAlExterior();
    }
}

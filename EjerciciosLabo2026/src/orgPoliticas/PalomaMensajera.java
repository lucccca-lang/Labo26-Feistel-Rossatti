package orgPoliticas;

public class PalomaMensajera extends Ave implements Campanias{
    private boolean aprendioMapa;


    @Override
    public void enviarMensajeDirigente() throws NoSePuedeEnviarException {
        if(aprendioMapa){
        System.out.println("Lanzando un papelito que dice: Vote por el partido para un mejor futuro");}
        else{
            throw new NoSePuedeEnviarException("No se puede enviar porque no aprendio el vuelo");
        }
    }
}


package orgPoliticas;

public class TelMovil extends Dispositivo implements Campanias{
    private CompTelef compTelef;
    private int numCel, credDispo;
    private boolean estaPrendido;



    @Override
    public void enviarMensajeDirigente() throws NoSePuedeEnviarException {

        if(estaPrendido && this.credDispo > 0){
            System.out.println("Conectando con la antena mas cercana" +  " Vote por el partido para un mejor futuro");}
        else{
            throw new NoSePuedeEnviarException("No se puede enviar porque no esta prendido o no hay credito");
        }
    }
}

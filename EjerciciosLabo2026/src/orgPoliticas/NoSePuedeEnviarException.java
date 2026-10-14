package orgPoliticas;

public class NoSePuedeEnviarException extends Exception {
    public NoSePuedeEnviarException(String message) {
        super(message);
    }
}

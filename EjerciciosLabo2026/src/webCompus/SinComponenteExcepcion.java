package webCompus;

import java.rmi.server.ExportException;

public class SinComponenteExcepcion extends Exception {
    public SinComponenteExcepcion(String message) {
        super(message);
    }
}

package cosasPrestSist;

public interface Prestable {
    public void prestar();
    public void puedePrestarse() throws NoSePuedePrestarException;

}

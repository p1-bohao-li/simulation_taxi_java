package model;

/**
 * Indicate that there was no passenger at a pickup point.
 * 
 * @author David J. Barnes and Michael Kolling. Modified A. Morelle
 * @version 2013.12.30
 */
public class MissingPassengerException extends Exception {
    private static final long serialVersionUID = 20131230L;

    private Vehicle vehicle;

    public MissingPassengerException(Vehicle vehicle) {
        super("Missing passenger at pickup location.");
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}

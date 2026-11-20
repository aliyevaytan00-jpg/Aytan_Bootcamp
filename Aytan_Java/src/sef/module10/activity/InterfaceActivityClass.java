package sef.module10.activity;

/**
 * Runs the bike and car implementations of {@link Vehicle}.
 */
public class InterfaceActivityClass {

    /**
     * Calls start and stop on a bike, then on a car.
     *
     * @param args command-line arguments, unused
     */
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start();
        bike.stop();

        Car car = new Car();
        car.start();
        car.stop();
    }
}

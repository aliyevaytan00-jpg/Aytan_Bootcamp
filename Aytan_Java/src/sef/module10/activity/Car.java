package sef.module10.activity;

/**
 * A car with its own start and stop behavior.
 */
public class Car implements Vehicle {

    /**
     * Starts the car.
     */
    @Override
    public void start() {
        System.out.println("Car ignition is on. The engine is running.");
    }

    /**
     * Stops the car.
     */
    @Override
    public void stop() {
        System.out.println("Car engine is off. The car has stopped.");
    }
}

package sef.module10.activity;

/**
 * A bicycle with its own start and stop behavior.
 */
public class Bike implements Vehicle {

    /**
     * Starts the bike.
     */
    @Override
    public void start() {
        System.out.println("The bike is starting.");
    }

    /**
     * Stops the bike.
     */
    @Override
    public void stop() {
        System.out.println("The bike has stopped.");
    }
}

package org.launchcode.java.demos.lsn5unittesting.main;

import org.junit.Test;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Prius", 10, 50);
        System.out.println(car.getMake() + " - " + car.getModel());
    }
}

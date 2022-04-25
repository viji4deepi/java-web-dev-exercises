package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.After;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.launchcode.java.demos.lsn5unittesting.main.Car;
public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
//    @Test
//    public void emptyTest(){
//        assertEquals(10,10,.01);
//    }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank(){
        Car test_car = new Car("Toyoto","Prius",10,50);
        assertEquals(10,test_car.getGasTankLevel(),.001);
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankLevel(){
       Car test_car = new Car("Toyota", "Prius", 10, 50);
       test_car.drive(50);
     assertEquals(9,test_car.getGasTankLevel(),.001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @After
    public void testGasTanklLevel(){
        Car test_car = new Car("Toyota", "Prius", 10, 50);
        assertEquals(10,test_car.getGasTankSize(),.001);

    }

    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)//(expected = IllegalAccessException.class)
    public void testGasOverfillException(){
        Car test_car = new Car("Toyota", "Prius", 10, 50);
        test_car.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
       // assertEquals(9,test_car.getGasTankSize(),.001);
    }

}

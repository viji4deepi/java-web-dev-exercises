package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HouseCatTest {

    @Test
    public void inheritsSuperInFirstConstructor(){
        HouseCat keyboardCat = new HouseCat("Keyboard Cat",7);
        assertEquals(7,keyboardCat.getWeight(),.001);
    }

    @Test
    public void inheritsDefaultCatInSecondConstructor(){
        HouseCat keyboardCat = new HouseCat("Keyboard Cat",7);
        assertNotNull(keyboardCat.getWeight());

    }
}

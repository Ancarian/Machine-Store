package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Automobile;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Machine;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dell on 05/03/2017.
 */

public class AutomobileTest {
    private static Automobile auto = null;

    @Before
    public void setUp(){
        auto = new Automobile("orange", 4, "Shkonda", 1500);
    }

    @After
    public void tearDown(){
        auto = null;
    }

    @Test
    public void setColor(){
        String s = "green";
        auto.setColor(s);

        Assert.assertEquals(s, auto.getColor());
    }

    @Test
    public void setWheels(){
        int value = 8;
        auto.setWheels(value);

        Assert.assertEquals(value, auto.getWheels());
    }

}
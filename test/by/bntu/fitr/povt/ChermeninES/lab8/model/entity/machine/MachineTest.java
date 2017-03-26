package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dell on 05/03/2017.
 */

public class MachineTest {
    private static Machine machine = null;

    @Before
    public void setUp() {
        machine = new Machine("Shkonda", 1000);
    }

    @After
    public void tearDown() {
        machine = null;
    }

    @Test
    public void setWeight() {
        int value = 100;
        machine.setWeight(value);

        Assert.assertEquals(value, machine.getWeight());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void setUncorrectWeight() {
        int value = -100;
        machine.setWeight(value);

    }

    @Test
    public void String() {
        String s = "Machine| manufacturer: Shkonda weigth: 1000";
        Assert.assertEquals(s, machine.toString());
    }

}
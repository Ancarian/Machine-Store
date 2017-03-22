package by.bntu.fitr.povt.ChermeninES.lab8.model.logic;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.container.Store;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Machine;
import by.bntu.fitr.povt.ChermeninES.lab8.model.logic.Analyzer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Dell on 05/03/2017.
 */
public class AnalyzerTest {
    private Store store = null;

    @Before
    public void setUp(){
        store = new Store();
        store.add(new Machine("Shkonda", 400));
        store.add(new Machine("Skoda", 500));
    }

    @After
    public void tearDown(){
        store = null;
    }

    @Test
    public void countAllCapacity(){
        int total = 900;

        Assert.assertEquals(total, Analyzer.countAllWeigth(store));
    }

}
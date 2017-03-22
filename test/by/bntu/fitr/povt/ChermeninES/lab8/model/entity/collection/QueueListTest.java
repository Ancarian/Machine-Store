package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.collection;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Machine;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Motorcycle;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.collection.QueueList;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

/**
 * Created by Dell on 05/03/2017.
 */
public class QueueListTest {
    private QueueList<Integer> store = null;

    @Before
    public void setUp(){
        store = new QueueList<>();
        store.push(1);
        store.push(2);
        store.push(3);
    }

    @After
    public void tearDown(){
        store = null;
    }


    @Test
    public void sizeTest(){
        Assert.assertEquals(3, store.size());
    }

    @Test
    public void push(){
        int size = 4;
        store.push(4);

        Assert.assertEquals(size, store.size());


        for (int i = 0; i < size-1; i++) {
            System.out.println(store.pop());
        }
        Assert.assertEquals(4, (int)store.pop());
    }

    @Test
    public void pop(){
        int size = 2;

        Assert.assertEquals(1, (int)store.pop());
        Assert.assertEquals(size, store.size());

        Assert.assertEquals(2, (int)store.pop());
        Assert.assertEquals(1, store.size());

        Assert.assertEquals(3, (int)store.pop());
        Assert.assertEquals(0, store.size());

    }

    @Test(expected = NoSuchElementException.class)
    public void popFail(){

        int size = store.size() + 1;

        for (int i = 0; i < size; i++) {
            store.pop();
        }
    }

    @Test(timeout = 15000)
    public void pushAndPopSpeed(){

        int size = 1_000_000;

        for (int i = 0; i < size; i++){
            store.push(i);
        }

        for (int i = 0; i < size; i++){
            store.pop();
        }
    }

}
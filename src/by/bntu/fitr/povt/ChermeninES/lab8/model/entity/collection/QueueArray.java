package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.collection;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by Dell on 02/03/2017.
 */

public class QueueArray<item> extends AbsArray<item> {

    public QueueArray() {
        elementData = new Object[0];
        this.size = 0;
    }

    public void push(item item) {
        elementData = Arrays.copyOf(elementData, size + 1);
        elementData[size++] = item;
    }

    public item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return (item) elementData[0];
    }

    public item pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        item item = (item) elementData[0];

        System.arraycopy(elementData, 1, elementData, 0, size - 1);
        elementData = Arrays.copyOf(elementData, size - 1);
        size--;

        return item;
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder s = new StringBuilder("\n[");

        for (Object obj : elementData) {
            s.append(obj).append(", ");
        }
        s.replace(s.length() - 2, s.length(), "]");

        return s.toString();
    }

}

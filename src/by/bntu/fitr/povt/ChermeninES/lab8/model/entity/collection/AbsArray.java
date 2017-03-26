package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.collection;

import java.util.AbstractCollection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Dell on 02/03/2017.
 */

public abstract class AbsArray<item> extends AbstractCollection<item> implements ICollection<item> {

    protected int size;
    protected Object[] elementData;

    protected AbsArray() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++)
            elementData[i] = null;

        size = 0;
    }

    public Iterator<item> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<item> {
        int cursor;
        int lastRet = -1;

        public boolean hasNext() {
            return cursor != size;
        }

        public item next() {
            int i = cursor;
            if (i >= size)
                throw new NoSuchElementException();
            Object[] elementData = AbsArray.this.elementData;
            if (i >= elementData.length)
                throw new ConcurrentModificationException();
            cursor = i + 1;
            return (item) elementData[lastRet = i];
        }
    }

}

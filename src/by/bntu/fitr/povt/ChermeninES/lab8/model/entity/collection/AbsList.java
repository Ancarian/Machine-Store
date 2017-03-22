package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.collection;
import java.util.*;

/**
 * Created by Dell on 02/03/2017.
 */

public abstract class AbsList<item> extends AbstractCollection<item> implements ICollection<item> {
    protected Node first;
    protected Node last;
    protected int size;

    public AbsList(){
        first = null;
        last = null;
        size = 0;
    }
    public int size(){
        return size;
    }

    public void clear(){
        first = null;
    }

    public Iterator<item> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<item> {
        private Node next = first;
        private Node lastReturned;
        private int nextIndex;

        public boolean hasNext() {
            return nextIndex < size();
        }

        public item next() {
            if (!hasNext())
                throw new NoSuchElementException();

            lastReturned = next;
            next = next.getNext();
            nextIndex++;
            return (item) lastReturned.getElement();
        }

    }

    /**
     * Created by Dell on 02/03/2017.
     */

    public static class Node<item> {

        private item element;
        private Node next;

        public Object getElement(){
            return element;
        }

        public void setElement(item e){
            element = e;
        }

        public Node getNext() {
            return next;
        }
        public void setNext(Node n) {
            next = n;
        }
    }

}

package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.collection;

import java.util.NoSuchElementException;

/**
 * Created by Dell on 02/03/2017.
 */

public class QueueList<item> extends AbsList<item> {
    public QueueList() {
        first = null;
        last = null;
        size = 0;
    }

    public item peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        return (item) first.getElement();
    }

    public void push(item item){
        Node oldlast = last;
        last = new Node();
        last.setElement(item);
        last.setNext(null);
        if (isEmpty()){
            first = last;
        }
        else{
            oldlast.setNext(last);
        }
        size++;
    }

    public item pop() {
        if (isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        item item = (item) first.getElement();
        first = first.getNext();
        size--;
        if (isEmpty()){
            last = null;
        }
        return item;
    }

    public String toString() {
        if (isEmpty()) {
                return "[]";
            }
            StringBuilder s = new StringBuilder("\n[");

            Node copyfirst = first;
            while (copyfirst != null) {
                s.append(copyfirst.getElement()).append(", ");;
                copyfirst = copyfirst.getNext();
            }
            s.replace(s.length() - 2, s.length(), "]");

            return s.toString();
        }

    }


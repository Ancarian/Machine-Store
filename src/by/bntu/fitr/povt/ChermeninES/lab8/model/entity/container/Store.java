package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.container;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Machine;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Dell on 02/03/2017.
 */
public class Store {
    private List<Machine> store;

    public Store() {
        store = new ArrayList<>();
    }

    public Store(List<Machine> store) {
        this.store = store;
    }

    public List<Machine> getStore() {
        return store;
    }

    public void setStore(List<Machine> store) {
        this.store = store;
    }

    public void add(Machine auto) {
        store.add(auto);
    }

    public void remove(int index) {
        if (index >= 0 && index < store.size()) {
            store.remove(index);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public Machine[] toArray() {
        return store.toArray(new Machine[store.size()]);
    }

    public void sort(Comparator<Machine> comparable) {
        store.sort(comparable);
    }

    public String toString() {
        StringBuilder s = new StringBuilder("\n");

        for (Machine machine : store) {
            s.append(machine).append(",\n");
        }
        s.replace(s.length() - 2, s.length(), "");

        return s.toString();
    }
}

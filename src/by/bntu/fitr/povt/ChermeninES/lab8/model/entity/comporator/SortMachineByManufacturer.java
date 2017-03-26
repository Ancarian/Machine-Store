package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.comporator;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Machine;

import java.util.Comparator;

/**
 * Created by Dell on 21/03/2017.
 */
public class SortMachineByManufacturer implements Comparator<Machine> {

    @Override
    public int compare(Machine o1, Machine o2) {
        if (o1.getManufacturer().compareTo(o2.getManufacturer()) != 0)
            return o1.getManufacturer().compareTo(o2.getManufacturer());

        int result = o1.getWeight() - o2.getWeight();
        if (result != 0)
            return result / Math.abs(result);

        return 0;
    }
}



package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.comporator;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Machine;

import java.util.Comparator;

/**
 * Created by Dell on 23/03/2017.
 */
public class SortMachineByWeightUp implements Comparator<Machine>{

    @Override
    public int compare(Machine o1, Machine o2) {

        return o1.compareTo(o2);

    }
}

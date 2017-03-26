package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.comporator;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Machine;

import java.util.Comparator;

/**
 * Created by Dell on 27/03/2017.
 */
public class SortMachineByWeightDown implements Comparator<Machine> {

    @Override
    public int compare(Machine o1, Machine o2) {

        return o2.compareTo(o1);

    }
}

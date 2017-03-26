package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Machine;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Machineable;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Machine;

/**
 * Created by Dell on 22/03/2017.
 */
abstract class MachineBuilder implements Machineable {
    protected Machine machine;

    public void create() {
        machine = new Machine();
    }

    public Machine getMachine() {
        return machine;
    }

    public abstract void buildManufacturer();

    public abstract void buildWeight();

    public void construct() {
        buildManufacturer();
        buildWeight();

    }


}


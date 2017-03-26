package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Machine;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Machine;
import by.bntu.fitr.povt.ChermeninES.lab8.util.Randomizer;

/**
 * Created by Dell on 22/03/2017.
 */

public class RandomMachineBuilder extends MachineBuilder {


    public void buildManufacturer() {
        machine.setManufacturer(Machine.Manufacturer.values()[Randomizer.randomInt(0, Machine.Manufacturer.values().length)].toString());
    }

    public void buildWeight() {
        machine.setWeight(Randomizer.randomInt(1000, 4000));
    }

}


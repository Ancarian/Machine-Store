package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Motorcycle;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Machine;
import by.bntu.fitr.povt.ChermeninES.lab8.util.Randomizer;

/**
 * Created by Dell on 22/03/2017.
 */
public class RandomMotorcycleBuilder extends MotorcycleBuilder {

    public void buildManufacturer() {
        machine.setManufacturer(Machine.Manufacturers.values()[Randomizer.randomInt(0, Machine.Manufacturers.values().length)].toString());
    }

    public void buildWeight() {
        machine.setWeight(Randomizer.randomInt(1000, 4000));
    }

    public void buildPower() {

        machine.setPower(Randomizer.randomInt(100, 300));
    }

}

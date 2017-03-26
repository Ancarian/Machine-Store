package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Automobile;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Machine;
import by.bntu.fitr.povt.ChermeninES.lab8.util.Randomizer;

/**
 * Created by Dell on 22/03/2017.
 */
public class RandomAutomobileBuilder extends AutomobileBuilder {


    public void buildManufacturer() {
        machine.setManufacturer(Machine.Manufacturer.values()[Randomizer.randomInt(0,
                Machine.Manufacturer.values().length)].toString());
    }

    public void buildWeight() {
        machine.setWeight(Randomizer.randomInt(1000, 4000));
    }

    public void buildColor() {
        String colors[] = {"Red", "Green", "Black", "White", "Orange" };
        machine.setColor(colors[Randomizer.randomInt(0, 5)]);
    }

    public void buildWheels() {
        machine.setWheels(Randomizer.randomInt(3, 8));

    }


}

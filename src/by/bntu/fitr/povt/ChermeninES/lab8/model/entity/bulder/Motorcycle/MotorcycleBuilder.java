package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Motorcycle;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Machineable;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Motorcycle;

/**
 * Created by Dell on 22/03/2017.
 */

public abstract class MotorcycleBuilder implements Machineable {

    protected Motorcycle machine;

    public abstract void buildPower();

    public abstract void buildManufacturer();

    public abstract void buildWeight();

    public void create() {
        machine = new Motorcycle();
    }

    public Motorcycle getMachine() {
        return machine;
    }


    public void construct() {
        buildManufacturer();
        buildWeight();
        buildPower();
    }

}

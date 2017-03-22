package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Automobile;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Machineable;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Automobile;

/**
 * Created by Dell on 22/03/2017.
 */
public abstract class AutomobileBuilder implements Machineable {
    protected Automobile machine;

    public abstract void buildColor();

    public abstract void buildWheels();

    public abstract void buildManufacturer();

    public abstract void buildWeight();

    public void create() {
        machine = new Automobile();
    }

    public Automobile getMachine() {
        return machine;
    }

    public void construct() {
        buildManufacturer();
        buildWeight();
        buildColor();
        buildWheels();
    }
}

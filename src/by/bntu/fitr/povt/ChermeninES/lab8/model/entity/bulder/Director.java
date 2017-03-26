package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Machine;


/**
 * Created by Dell on 22/03/2017.
 */
public class Director {

    private Machineable builder;

    public Director(Machineable pb) {
        builder = pb;
    }

    public Machine getBuilder() {
        return builder.getMachine();
    }

    public void setBuilder(Machineable pb) {
        builder = pb;
    }

    public Machine construct() {
        builder.create();
        builder.construct();

        return getBuilder();
    }
}

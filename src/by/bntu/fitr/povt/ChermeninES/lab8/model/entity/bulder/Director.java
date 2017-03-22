package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Machineable;


/**
 * Created by Dell on 22/03/2017.
 */
public class Director<E> {

    private Machineable builder;

    public Director(Machineable pb) {
        builder = pb;
    }

    public void setBuilder(Machineable pb) {
        builder = pb;
    }

    public E getBuilder(){
        return (E) builder.getMachine();
    }

    public E construct() {
        builder.create();
        builder.construct();

        return getBuilder();
    }
}

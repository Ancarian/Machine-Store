package by.bntu.fitr.povt.ChermeninES.lab8.model.logic;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Machine;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.container.Store;

/**
 * Created by Dell on 02/03/2017.
 */
public class Analyzer {
    public static int countAllWeigth(Store store){
        int allWeigth = 0;

        for (Machine auto: store.toArray()) {
            allWeigth += auto.getWeight();
        }

        return allWeigth;
    }
}

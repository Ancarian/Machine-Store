package by.bntu.fitr.povt.ChermeninES.lab8.util;


import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Automobile.FileAutomobileBuilder;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Automobile.RandomAutomobileBuilder;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Director;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Machine.FileMachineBuilder;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Machine.RandomMachineBuilder;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Motorcycle.FileMotorcycleBuilder;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Motorcycle.RandomMotorcycleBuilder;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.container.Store;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Machine;

import java.io.IOException;
import java.util.Random;

/**
 * Created by Dell on 02/03/2017.
 */

public class Generator {

    public static int randomInt(int min, int max) {
        Random r = new Random();

        return r.nextInt(max - min) + min;
    }


    public static Store createStore(Store store, int numberMachines) {

        for (int i = 0; i < numberMachines; i++) {
            Machine machines[] = {new Director(new RandomAutomobileBuilder()).construct(),
                    new Director(new RandomMotorcycleBuilder()).construct(),
                    new Director(new RandomMachineBuilder()).construct()};
            store.add(machines[randomInt(0, 3)]);
        }
        return store;
    }

    public static Store createDefaultStore(Store store, int numberMachines, String file) throws IOException {
        for (int i = 0; i < numberMachines; i++) {
            Machine machines[] = {new Director(new FileAutomobileBuilder(file)).construct(),
                    new Director(new FileMotorcycleBuilder(file)).construct(),
                    new Director(new FileMachineBuilder(file)).construct()};
            store.add(machines[randomInt(0, 3)]);
        }
        return store;
    }


}

package by.bntu.fitr.povt.ChermeninES.lab8.controller;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.comporator.SortMachineByManufacturer;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.comporator.SortMachineByWeightDown;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.comporator.SortMachineByWeightUp;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.container.Store;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.io.InputMachine;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Machine;

import java.io.IOException;

import static by.bntu.fitr.povt.ChermeninES.lab8.util.Generator.createDefaultStore;
import static by.bntu.fitr.povt.ChermeninES.lab8.util.Generator.createStore;
import static by.bntu.fitr.povt.ChermeninES.lab8.util.Input.input;
import static by.bntu.fitr.povt.ChermeninES.lab8.view.Printer.print;

/**
 * Created by Dell on 02/03/2017.
 */

public class Controller {

    public static Store store;

    public static void main(String[] args) throws IOException {

        print("Welcome to the machine store");
        while (true) {
            print("1 - random, 2 - default, 0 for exit");
            int v = Integer.parseInt(input());
            if (v == 0) {
                break;
            }

            print("Input count of machines");
            int count = Integer.parseInt(input());

            if (v == 1) {
                store = createStore(new Store(), count);
                nextMenu();
            } else if (v == 2) {
                store = createDefaultStore(new Store(), count, "D:\\FileWorker.txt");
                nextMenu();
            } else {
                break;
            }
        }
    }

    public static void nextMenu() {
        while (true) {

            print("1 - view, 2 - save, 3 - sort, 0 - exit");
            int v = Integer.parseInt(input());

            if (v == 1) {
                print(store);
            } else if (v == 2) {
                print("input folder: ");
                InputMachine writer = new InputMachine(input());
                for (Machine machine : store.toArray()) {
                    writer.write(machine.toString());
                }

            } else if (v == 3) {
                sort();
            } else if (v == 0) {
                break;
            }
        }
    }

    public static void sort() {
        print("1 - By Manufacturer, 2 - By Weight Down, 3 - By Weight Up");
        int v = Integer.parseInt(input());

        if (v == 1) {
            store.sort(new SortMachineByManufacturer());
        } else if (v == 2) {
            store.sort(new SortMachineByWeightDown());
        } else if (v == 3) {
            store.sort(new SortMachineByWeightUp());
        }
    }

}

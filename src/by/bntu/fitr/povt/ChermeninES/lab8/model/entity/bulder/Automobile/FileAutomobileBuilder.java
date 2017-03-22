package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Automobile;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.io.OutputMachine;

import java.io.IOException;

/**
 * Created by Dell on 22/03/2017.
 */
public class FileAutomobileBuilder extends AutomobileBuilder {
    OutputMachine file;
    public FileAutomobileBuilder(String file) throws IOException {
        this.file = new OutputMachine(file);
    }

    public void buildManufacturer() {

        machine.setManufacturer(file.read().get(1).split(" ")[0]);
    }

    public void buildWeight() {
        machine.setWeight(Integer.parseInt(file.read().get(1).split(" ")[1]));
    }

    public void buildColor() {
        machine.setColor(file.read().get(1).split(" ")[2]);
    }

    public void buildWheels() {
        machine.setWheels(Integer.parseInt(file.read().get(1).split(" ")[3]));

    }
}

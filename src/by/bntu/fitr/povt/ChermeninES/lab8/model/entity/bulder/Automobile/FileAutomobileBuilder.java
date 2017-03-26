package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Automobile;

import java.io.File;
import java.io.IOException;

import static by.bntu.fitr.povt.ChermeninES.lab8.model.entity.io.OutputMachine.readLine;

/**
 * Created by Dell on 22/03/2017.
 */
public class FileAutomobileBuilder extends AutomobileBuilder {
    File file;

    public FileAutomobileBuilder(String file) throws IOException {
        this.file = new File(file);
    }

    public void buildManufacturer() {

        machine.setManufacturer(readLine(file, 1).split(" ")[0]);
    }

    public void buildWeight() {
        machine.setWeight(Integer.parseInt(readLine(file, 1).split(" ")[1]));
    }

    public void buildColor() {
        machine.setColor(readLine(file, 1).split(" ")[2]);
    }

    public void buildWheels() {
        machine.setWheels(Integer.parseInt(readLine(file, 1).split(" ")[3]));

    }
}

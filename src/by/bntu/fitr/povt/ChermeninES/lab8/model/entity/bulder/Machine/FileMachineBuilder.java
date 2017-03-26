package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Machine;


import java.io.File;
import java.io.IOException;

import static by.bntu.fitr.povt.ChermeninES.lab8.model.entity.io.OutputMachine.readLine;

/**
 * Created by Dell on 22/03/2017.
 */
public class FileMachineBuilder extends MachineBuilder {

    private File file;

    public FileMachineBuilder(String file) throws IOException {
        this.file = new File(file);
    }

    public void buildManufacturer() {

        machine.setManufacturer(readLine(file, 0).split(" ")[0]);
    }

    public void buildWeight() {
        machine.setWeight(Integer.parseInt(readLine(file, 0).split(" ")[1]));
    }
}

package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Machine;


import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.io.OutputMachine;
import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine.Machine;

import java.io.IOException;

/**
 * Created by Dell on 22/03/2017.
 */
public class FileMachineBuilder extends MachineBuilder {

    OutputMachine file;
    public FileMachineBuilder(String file) throws IOException{
        this.file = new OutputMachine(file);
    }

    public void buildManufacturer() {

        machine.setManufacturer(file.read().get(0).split(" ")[0]);
    }

    public void buildWeight() {
        machine.setWeight(Integer.parseInt(file.read().get(0).split(" ")[1]));
    }
}

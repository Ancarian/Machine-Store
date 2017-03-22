package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Motorcycle;


import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.io.OutputMachine;

import java.io.IOException;

/**
 * Created by Dell on 22/03/2017.
 */
public class FileMotorcycleBuilder  extends MotorcycleBuilder {
    OutputMachine file;

    public FileMotorcycleBuilder(String file) throws IOException {
        this.file = new OutputMachine(file);
    }

    public void buildManufacturer() {

        machine.setManufacturer(file.read().get(2).split(" ")[1]);
    }

    public void buildWeight() {
        machine.setWeight(Integer.parseInt(file.read().get(2).split(" ")[2]));
    }

    public void buildPower() {
        machine.setPower(Integer.parseInt(file.read().get(2).split(" ")[0]));
    }


}

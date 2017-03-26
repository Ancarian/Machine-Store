package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.bulder.Motorcycle;


import java.io.File;
import java.io.IOException;

import static by.bntu.fitr.povt.ChermeninES.lab8.model.entity.io.OutputMachine.readLine;

/**
 * Created by Dell on 22/03/2017.
 */
public class FileMotorcycleBuilder extends MotorcycleBuilder {

    File file;

    public FileMotorcycleBuilder(String file) throws IOException {
        this.file = new File(file);
    }

    public void buildPower() {
        machine.setPower(Integer.parseInt(readLine(file, 2).split(" ")[0]));
    }

    public void buildManufacturer() {

        machine.setManufacturer(readLine(file, 2).split(" ")[1]);
    }

    public void buildWeight() {
        machine.setWeight(Integer.parseInt(readLine(file, 2).split(" ")[2]));
    }


}

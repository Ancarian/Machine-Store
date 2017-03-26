package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Dell on 22/03/2017.
 */
public class InputMachine {
    private File file;
    private PrintWriter writer;

    public InputMachine(String fileName) {
        try {

            file = new File(fileName);
            writer = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
    }

    public void write(String text) {
        writer.println(text);
    }


    public void close() {
        writer.flush();
        writer.close();
    }
}

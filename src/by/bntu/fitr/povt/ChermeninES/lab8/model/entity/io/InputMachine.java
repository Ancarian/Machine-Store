package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Dell on 22/03/2017.
 */
public class InputMachine {
    private File file;
    private PrintWriter writeFile;

    public InputMachine(String fileName) throws IOException {
        file = new File(fileName);
        writeFile = new PrintWriter(file);
    }

    public void write(String text) {
        //Записываем текст у файл
        writeFile.print(text);
    }

    public void close(){
        writeFile.close();
    }
}

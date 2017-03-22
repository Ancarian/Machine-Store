package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 22/03/2017.
 */
public class OutputMachine {
    private File file;
    private FileWriter writeFile;

    public OutputMachine(String fileName) throws IOException {
        try {

            file = new File(fileName);
            writeFile = new FileWriter(file, true);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public void write(String text) {
        try {
            writeFile.write(text);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public List<String> read() {
        try {
            return Files.readAllLines(Paths.get(file.getAbsolutePath()), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return new ArrayList<String>();
    }

    public void close() throws IOException {
        writeFile.close();
    }

}
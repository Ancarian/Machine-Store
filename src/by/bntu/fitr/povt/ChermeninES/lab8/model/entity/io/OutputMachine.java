package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.io;

import java.io.File;
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

    public static String readLine(File file, int index) {
        if (index >= 0 && index < readAll(file).size()) {
            return readAll(file).get(index);
        } else return null;
    }

    public static List<String> readAll(File file) {
        try {
            return Files.readAllLines(Paths.get(file.getAbsolutePath()), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println(e.toString());

        }
        return new ArrayList<>();
    }


}
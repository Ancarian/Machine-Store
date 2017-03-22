package by.bntu.fitr.povt.ChermeninES.lab8.util;

import java.util.Random;

/**
 * Created by Dell on 22/03/2017.
 */
public class Randomizer {
    public static int randomInt(int min, int max) {
        Random r = new Random();

        return r.nextInt(max - min) + min;
    }
}

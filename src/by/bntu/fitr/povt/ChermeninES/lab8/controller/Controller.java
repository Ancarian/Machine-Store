package by.bntu.fitr.povt.ChermeninES.lab8.controller;

import by.bntu.fitr.povt.ChermeninES.lab8.model.entity.container.Store;
import by.bntu.fitr.povt.ChermeninES.lab8.util.Generator;

import java.io.IOException;

/**
 * Created by Dell on 02/03/2017.
 */

public class Controller {
    public static void main(String[] args) throws IOException {

        Store store;

        store = new Generator().createStore(new Store(), 10);
        System.out.println(store);


    }
}

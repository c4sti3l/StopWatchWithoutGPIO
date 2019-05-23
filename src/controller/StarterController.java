/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import model.Starter;

/**
 *
 * @author Chr!s
 */
public class StarterController {

    private ArrayList<Starter> starterList;
    private JList<Starter> sList;
    private Starter[] starter;
    private DefaultListModel<Starter> model;

    public StarterController() {
        System.out.println("Geiler Starter COntroller");
        starterList = new ArrayList<Starter>();
        sList = new JList<Starter>();
//        starter = new Starter[];
        model = new DefaultListModel<>();

        try {
            this.loadStarter();

            for (Starter temp : starterList) {
                System.out.println(temp.getName());
            }
        } catch (IOException ex) {
            Logger.getLogger(StarterController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void loadStarter() throws IOException {
        File file = new File(".\\src\\config\\starterList.txt");
        Scanner sc = new Scanner(new FileInputStream(file), "iso-8859-1");

        while (sc.hasNext()) {
//            starterList.add(new Starter(sc.nextLine()));
//            sList.add(new Starter(sc.nextLine()));
            model.addElement(new Starter(sc.nextLine()));
        }

//        Collection list = Collections.list(model.elements()); // get a collection of the elements in the model
//        Collections.sort(list); // sort
//        model.clear(); // remove all elements
//        for (Object o : list) {
//            model.addElement(o);
//        } // add elements
    }

    public ArrayList getStarterList2() {
        return this.starterList;
    }

    public JList getStarterList() {
//        return this.starterList;

        JList<Starter> list = new JList<Starter>(
                new Starter[]{new Starter("Chris"),
                    new Starter("Lars"),
                    new Starter("Vadim"),
                    new Starter("Robin"),
                    new Starter("Jens")});

        return new JList<Starter>(this.model);
    }

    public void addStarter(String name) {

    }

}

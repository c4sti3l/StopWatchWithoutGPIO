package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.ArrayList;
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
        starterList = new ArrayList<Starter>();
        sList = new JList<Starter>();
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
            model.addElement(new Starter(sc.nextLine()));
        }
    }

    public ArrayList getStarterList2() {
        return this.starterList;
    }

    public JList getStarterList() {
        JList l = new JList<Starter>(this.model);
//        Collections.sort(l);
        return l;
    }

    public void addStarter(String name) {

    }

}

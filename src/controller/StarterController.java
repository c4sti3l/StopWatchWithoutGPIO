package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import model.Starter;

/**
 *
 * @author Chr!s
 */
public class StarterController {

    private final DefaultListModel<Starter> starterList;
    private final String starterSave;

    public StarterController() {
        starterSave = ".\\src\\config\\starterList";
        starterList = this.loadStarter();
    }

    /**
     * Liefert die StarterListe für die UI-Geschichte
     *
     * @return Model der StarterListe
     */
    public DefaultListModel getStarterListModel() {
        return this.starterList;
    }

    /**
     * Liefert die StarterListe asl JList für die UI's
     *
     * @return StarterListe als JList
     */
    public JList getStarterList() {
        return new JList<>(this.starterList);
    }

    /**
     * Fügt einen neuen Starter zu der Liste hinzu und speichert diese in einer
     * Datei
     *
     * @param name
     * @return
     */
    public boolean addStarter(String name) {
        starterList.addElement(new Starter(name));
        this.saveStarter();
        return true;
    }

    /**
     * Schreibt die Liste der Starter in eine Datei
     */
    public void saveStarter() {
        try {
            FileOutputStream fileOut = new FileOutputStream(this.starterSave);
            try (ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                objectOut.writeObject(this.starterList);
                System.out.println("StarterListe gespeichert.");
            }
        } catch (IOException ex) {
            System.out.println("Fehler beim Speichern der StarterListe");
        }
    }

    /**
     * Lädt die Liste der Starter aus der Datei
     *
     * @return StarterList
     */
    public DefaultListModel<Starter> loadStarter() {
        DefaultListModel<Starter> list = new DefaultListModel();
        try {
            FileInputStream fileOut = new FileInputStream(this.starterSave);
            try (ObjectInputStream objectOut = new ObjectInputStream(fileOut)) {
                list = (DefaultListModel) objectOut.readObject();
                System.out.println("StarterListe geladen.");
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Fehler beim Laden der StarterListe");
        }
        return list;
    }
}

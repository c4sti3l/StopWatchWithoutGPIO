/*
 * Editierfenster (Dialog) für Starter 
 */
package view;

import controller.StarterController;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import model.Starter;

/**
 *
 * @author Muschi
 */
public class StarterEdit extends JDialog {

    public StarterEdit(StarterController starterController) {
        super();
        System.out.println("Starter Edit Dialog");

        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.BOTH;

        this.setLayout(new GridBagLayout());

        c.weightx = 100;
        c.weighty = 10;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 0;

        this.add(new JLabel("Starter zur Bearbeitung wählen"), c);

        DefaultListModel sList = starterController.getStarterListModel();

        int size = sList.getSize();
        JComboBox box = new JComboBox();
        box.addItem("-- Bitte wählen --");

        for (int i = 0; i < size; i++) {
            Starter item = (Starter) sList.getElementAt(i);
            box.addItem(item.getName());
        }

        box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Gewählt:");
                System.out.println(box.getSelectedItem());
                System.out.println(box.getSelectedIndex());

                int index = box.getSelectedIndex();
                if (index != 0) {
                    Starter selectedStarter = (Starter) sList.getElementAt((box.getSelectedIndex() - 1));

                    System.out.println(selectedStarter.getClass());
                    System.out.println(selectedStarter.getName());
                    selectedStarter.setName("Edited: " + selectedStarter.getName());
                    System.out.println(sList);
                }
            }
        });

        c.gridy = 1;
        this.add(box, c);

        // SaveBtn
        c.gridwidth = 1;
        c.gridy = 2;
        JButton saveBtn = new JButton("Speichern");
        this.add(saveBtn, c);
        saveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // CloseBtn
        c.gridwidth = 1;
        c.gridx = 1;
        JButton closeBtn = new JButton("Abbrechen");
        closeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        this.add(closeBtn, c);

        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        this.setModal(
                true);

        this.pack();

        this.setSize(
                400, 100);

        this.setLocationRelativeTo(
                null);

        this.setTitle(
                "Starter bearbeiten");

        this.setVisible(
                true);
    }
}

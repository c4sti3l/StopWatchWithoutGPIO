/*
 * StartPanel mit Ackerlauf, Kartslalom, Gechicklichkeit und Laden eines bestehenden Rennens 
 */
package view;

import controller.ActionController;
import controller.StarterController;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import model.Starter;

public class StarterPanel extends JPanel {

    public StarterPanel(ActionController controller) {

        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;

        Font font = new Font("Arial", Font.PLAIN, 20);

        TitledBorder border = new TitledBorder("Starter");
        border.setTitleJustification(TitledBorder.LEFT);
        border.setTitlePosition(TitledBorder.TOP);

        setBorder(border);
        setLayout(new GridBagLayout());

        // Create a list containing CheckboxListItem's
//        JList<CheckboxListItem> list = new JList<CheckboxListItem>(
//                new CheckboxListItem[]{new CheckboxListItem("apple"),
//                    new CheckboxListItem("orange"),
//                    new CheckboxListItem("mango"),
//                    new CheckboxListItem("paw paw"),
//                    new CheckboxListItem("banana")});
//        JList<Starter> list = new JList<Starter>(
//                new Starter[]{new Starter("apple"),
//                    new Starter("orange"),
//                    new Starter("mango"),
//                    new Starter("paw paw"),
//                    new Starter("banana")});
        StarterController sc = new StarterController();
        JList<Starter> list = sc.getStarterList();

        // Use a CheckboxListRenderer (see below)
        // to renderer list cells
        list.setCellRenderer(new CheckboxListRenderer());
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add a mouse listener to handle changing selection
        list.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                JList<Starter> list = (JList<Starter>) event.getSource();

                // Get index of item clicked
                int index = list.locationToIndex(event.getPoint());
                Starter item = (Starter) list.getModel().getElementAt(index);

                // Toggle selected state
                item.setSelected(!item.isSelected());

                // Repaint cell
                list.repaint(list.getCellBounds(index, index));
            }
        });

        c.weightx = 100;
        c.weighty = 30;
        c.gridwidth = 2;
//        c.gridheight = 10;
        c.gridx = 0;
        c.gridy = 0;
        add(list, c);

        /**
         * Buttons
         */
        JButton button;
        button = new JButton("Starter hinzufügen");
        button.addActionListener((ActionEvent e) -> {
            String eingabe = JOptionPane.showInputDialog(
                    null, 
                    "Bitte geben Sie den Namen ein",
                    "Neuen Starter hinzufügen",
                    JOptionPane.PLAIN_MESSAGE);
            
//            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
//            String s = (String)JOptionPane.showInputDialog(
//                    topFrame,
//                    "Complete the sentence:\n"
//                    + "\"Green eggs and...\"",
//                    "Customized Dialog",
//                    JOptionPane.PLAIN_MESSAGE,
//                    icon,
//                    null,
//                    "ham");
        });
        button.setFont(font);
        c.weightx = 100;
        c.weighty = 30;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        add(button, c);
        
       
        button = new JButton("Starter verwalten");
        button.addActionListener((ActionEvent e) -> {
            System.out.println("AddStarter");
            String eingabe = JOptionPane.showInputDialog(null, "Bitte geben Sie den Namen ein",
                    "Neuen Starter hinzufügen",
                    JOptionPane.PLAIN_MESSAGE);
            System.out.println("LOL");
            System.out.println(eingabe);

//            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
//            String s = (String)JOptionPane.showInputDialog(
//                    topFrame,
//                    "Complete the sentence:\n"
//                    + "\"Green eggs and...\"",
//                    "Customized Dialog",
//                    JOptionPane.PLAIN_MESSAGE,
//                    icon,
//                    null,
//                    "ham");
        });
        button.setFont(font);
        c.weightx = 100;
        c.weighty = 30;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 1;
//        add(button, c);
    }

}

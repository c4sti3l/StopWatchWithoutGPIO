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

//    private StarterController starterController;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public StarterPanel(ActionController controller, StarterController starterController) {

        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;

        Font font = new Font("Arial", Font.PLAIN, 20);

        TitledBorder border = new TitledBorder("Starter");
        border.setTitleJustification(TitledBorder.LEFT);
        border.setTitlePosition(TitledBorder.TOP);

        setBorder(border);
        setLayout(new GridBagLayout());

//        this.starterController = starterController;
        JList<Starter> list = starterController.getStarterList();

        list.setCellRenderer(new CheckboxListRenderer());
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add a mouse listener to handle changing selection
        list.addMouseListener(new MouseAdapter() {
            @Override
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

        c.weightx = 200;
        c.weighty = 30;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 0;
        add(list, c);

        /**
         * Buttons
         */
        JButton button;
        button = new JButton("hinzufügen");
        button.addActionListener((ActionEvent e) -> {
            String eingabe = JOptionPane.showInputDialog(
                    null,
                    "Bitte geben Sie den Namen ein",
                    "Neuen Starter hinzufügen",
                    JOptionPane.PLAIN_MESSAGE);
            System.out.println(eingabe);
        });
        button.setFont(font);
        c.weightx = 100;
        c.weighty = 30;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        add(button, c);

        button = new JButton("verwalten");
        button.addActionListener((ActionEvent e) -> {
            JDialog dialog = new JDialog();
            dialog.setLayout(new GridBagLayout());

            c.weightx = 100;
            c.weighty = 10;
            c.gridwidth = 2;
            c.gridx = 0;
            c.gridy = 0;

            dialog.add(new JLabel("Starter zur Bearbeitung wählen"), c);

            JList<Starter> sList = starterController.getStarterList();
            int size = list.getModel().getSize();
            JComboBox box = new JComboBox();
            box.addItem("-- Bitte wählen --");

            for (int i = 0; i < size; i++) {
                Starter item = list.getModel().getElementAt(i);
                box.addItem(item.getName());
            }

            box.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Gewählt:");
                    System.out.println(box.getSelectedItem());
                }
            });

            c.gridy = 1;
            dialog.add(box, c);

            c.gridwidth = 1;
            c.gridy = 2;
            dialog.add(new JButton("Speichern"), c);

            c.gridwidth = 1;
            c.gridx = 1;
            dialog.add(new JButton("Schließen"), c);

            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setModal(true);
            dialog.pack();
            dialog.setSize(400, 100);
            dialog.setLocationRelativeTo(null);
            dialog.setTitle("Starter bearbeiten");
            dialog.setVisible(true);
        });

        button.setFont(font);
        c.weightx = 100;
        c.weighty = 30;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 1;
        add(button, c);
    }

}

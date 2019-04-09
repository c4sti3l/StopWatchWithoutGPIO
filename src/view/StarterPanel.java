/*
 * StartPanel mit Ackerlauf, Kartslalom, Gechicklichkeit und Laden eines bestehenden Rennens 
 */
package view;

import controller.ActionController;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class StarterPanel extends JPanel {


    public StarterPanel(ActionController controller) {
      
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.BOTH;

        Font font = new Font("Arial", Font.PLAIN, 40);

        TitledBorder border = new TitledBorder("Starter");
        border.setTitleJustification(TitledBorder.LEFT);
        border.setTitlePosition(TitledBorder.TOP);

        setBorder(border);
        setLayout(new GridBagLayout());



        /**
         * Buttons
         */
        JButton button;
        button = new JButton("Starter hinzufügen");
        button.addActionListener((ActionEvent e) -> {
            System.out.println("AddStarter");
        });
        button.setFont(font);
        c.weightx = 100;
        c.weighty = 30;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        add(button, c);
    }

}

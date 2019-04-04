/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ActionController;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Chr!s
 */
public class InitPanel extends JPanel {

    private JPanel mainPanel;

    public InitPanel(ActionController controller, JPanel mainPanel) {
        this.mainPanel = mainPanel;

        JButton btn = new JButton("TEST");

        mainPanel.setBounds(500, 500, 800, 500);

        JButton button;
        mainPanel.setLayout(new GridBagLayout());
        System.out.println(mainPanel.getLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        c.fill = GridBagConstraints.BOTH;

        button = new JButton("Ackerlauf");
        button.setFont(new Font("Arial", Font.PLAIN, 40));
        c.weightx = 200;
        c.weighty = 200;
        c.gridx = 0;
        c.gridy = 0;
        mainPanel.add(button, c);

        button = new JButton("Kart");
//        c.weightx = 0.5;
        c.weighty = 200;
        c.gridx = 1;
        c.gridy = 0;
        mainPanel.add(button, c);

        button = new JButton("Geschicklichkeit");
//        c.weightx = 0.5;
        c.weighty = 200;
        c.gridx = 2;
        c.gridy = 0;
        mainPanel.add(button, c);

        button = new JButton("Bestehendes Rennen laden");
//        c.ipady = 40;      //make this component tall
        c.weightx = 0.0;
        
        c.weighty = 50;
        c.gridwidth = 3;
        c.gridheight = 5;
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(button, c);


        mainPanel.revalidate();

    }

}

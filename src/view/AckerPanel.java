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

public class AckerPanel extends JPanel {

    private JPanel mainPanel;

    public AckerPanel(ActionController controller, JPanel mainPanel) {
        this.mainPanel = mainPanel;

        JButton btn = new JButton("TEST");

        mainPanel.setBounds(560, 290, 800, 300);

        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.BOTH;

        Font font = new Font("Arial", Font.PLAIN, 40);

        JLabel label = new JLabel("Ackerlauf", SwingConstants.CENTER);
        label.setFont(font);
        c.weightx = 500;
        c.weighty = 30;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        mainPanel.add(label, c);

        /**
         * Config Panel
         */
        TitledBorder border = new TitledBorder("Konfiguration");
        border.setTitleJustification(TitledBorder.LEFT);
        border.setTitlePosition(TitledBorder.TOP);

        JPanel configPanel = new JPanel();
        configPanel.setBorder(border);
        configPanel.setLayout(new GridBagLayout());

        //Runden
        label = new JLabel("Runden:");
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 100;
        c.weighty = 30;
        configPanel.add(label, c);

        SpinnerModel spinnerModel = new SpinnerNumberModel(3, 1, 20, 1);
        JSpinner spinner = new JSpinner(spinnerModel);
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 0;
        configPanel.add(spinner, c);

        //Pylonen Strafe
        label = new JLabel("Pylonenstrafe (s):");
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 100;
        c.weighty = 30;
        configPanel.add(label, c);

        spinnerModel = new SpinnerNumberModel(3, 1, 20, 1);
        spinner = new JSpinner(spinnerModel);
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 1;
        configPanel.add(spinner, c);

        //Tor Strafe
        label = new JLabel("Torstrafe (s):");
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 100;
        c.weighty = 30;
        configPanel.add(label, c);

        spinnerModel = new SpinnerNumberModel(5, 1, 20, 1);
        spinner = new JSpinner(spinnerModel);
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 2;
        configPanel.add(spinner, c);

        // Add ConfigPanel
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(configPanel, c);

        /**
         * Starter Panel
         */
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 1;
        mainPanel.add(new StarterPanel(controller), c);

        /**
         * Buttons
         */
        JButton button;
        button = new JButton("Abbrechen");
        button.addActionListener((ActionEvent e) -> {
            controller.returnToStartView();
        });
        button.setFont(font);
        c.weightx = 100;
        c.weighty = 30;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 2;
        mainPanel.add(button, c);

        button = new JButton("Start");
        button.addActionListener((ActionEvent e) -> {
            System.out.println("Start");
        });
        button.setFont(font);
        c.weightx = 100;
        c.weighty = 30;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 2;
        mainPanel.add(button, c);

        mainPanel.revalidate();

    }

}

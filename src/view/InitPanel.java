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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class InitPanel extends JPanel {

    private JPanel mainPanel;

    public InitPanel(ActionController controller, StarterController starterController, JPanel mainPanel) {
        this.mainPanel = mainPanel;

        JButton btn = new JButton("TEST");

        mainPanel.setBounds(560, 290, 800, 300);

        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.BOTH;

        Font font = new Font("Arial", Font.PLAIN, 40);

        JLabel label = new JLabel("Welcher Renntyp ?", SwingConstants.CENTER);
        label.setFont(font);
        c.weightx = 500;
        c.weighty = 30;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 0;
        mainPanel.add(label, c);

        JButton button;
        button = new JButton("Ackerlauf");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.initBtnAction("acker");
            }
        });
        button.setFont(font);
        c.weightx = 500;
        c.weighty = 30;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(button, c);

        button = new JButton("Kartslalom");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.initBtnAction("kart");
            }
        });
        button.setFont(font);
        c.gridx = 1;
        c.gridy = 1;
        mainPanel.add(button, c);

        button = new JButton("Geschicklichkeit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.initBtnAction("geschicklichkeit");
            }
        });
        button.setFont(font);
        c.gridx = 2;
        c.gridy = 1;
        mainPanel.add(button, c);

        button = new JButton("Bestehendes Rennen laden");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.initBtnAction("load");
            }
        });
        button.setFont(font);
        c.weighty = 10;
        c.gridwidth = 3;
        c.gridheight = 5;
        c.gridx = 0;
        c.gridy = 2;
        mainPanel.add(button, c);

        mainPanel.revalidate();

    }

}

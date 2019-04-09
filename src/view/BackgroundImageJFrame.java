/*
* Hintergrund Frame mit Background-Bild
 */
package view;

import javax.swing.*;
import java.awt.*;

public class BackgroundImageJFrame extends JFrame {

    private JPanel mainPanel;

    public BackgroundImageJFrame() {
        this.initFrame();
    }

    public final void initFrame() {

        setTitle("MSC Erlbachtal - Stopwatch");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon(".\\src\\assets\\bg.jpg")));
        setIconImage(Toolkit.getDefaultToolkit().getImage(BackgroundImageJFrame.class.getResource("/assets/icon.png")));

        mainPanel = new JPanel();
        mainPanel.setSize(200, 300);

        mainPanel.setBounds(300, 300, 300, 300);
        add(mainPanel, BorderLayout.CENTER);

        setSize(800, 400);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void resetMainPanel() {
        mainPanel.removeAll();
    }

}

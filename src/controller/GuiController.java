/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JButton;
import javax.swing.JPanel;
import view.*;

/**
 *
 * @author Chr!s
 */
public class GuiController {

    MainController controller;
    ActionController actionController;
    BackgroundImageJFrame bgFrame;

    public GuiController(MainController controller, ActionController actionController) {
        this.controller = controller;
        this.actionController = actionController;
    }

    public void init() {

        this.bgFrame = new BackgroundImageJFrame();

//        InitPanel
        InitPanel initPanel = new InitPanel(actionController, bgFrame.getMainPanel());
        
//        
//        mainPanel.setBounds(500, 300, 500, 500);
    }

}

package controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.*;

public class GuiController {

    MainController controller;
    ActionController actionController;
    StarterController starterController;
    BackgroundImageJFrame bgFrame;

    public GuiController(MainController controller, ActionController actionController, StarterController starterController) {
        this.controller = controller;
        this.actionController = actionController;
        this.starterController = starterController;
        this.bgFrame = new BackgroundImageJFrame();

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GuiController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void initFrame() {
        bgFrame.resetMainPanel();
        InitPanel initPanel = new InitPanel(actionController, starterController, bgFrame.getMainPanel());
    }

    public void showAckerSetup() {
        bgFrame.resetMainPanel();
        AckerPanel ackerPanel = new AckerPanel(actionController, starterController, bgFrame.getMainPanel());
    }

}

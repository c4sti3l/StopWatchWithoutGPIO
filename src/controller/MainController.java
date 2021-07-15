package controller;

import view.StarterEdit;

public class MainController {

    private final GuiController guiController;
    private final ActionController actionController;
    private final StarterController starterController;

    public MainController() {
        this.actionController = new ActionController(this);
        this.starterController = new StarterController();
        this.guiController = new GuiController(this, actionController, starterController);
    }

    public void init() {
//        guiController.initFrame();
//        StarterEdit starterEdit = new StarterEdit(starterController);
        guiController.showAckerSetup();
    }

//    public GuiController getGuiController() {
//        return guiController;
//    }
}

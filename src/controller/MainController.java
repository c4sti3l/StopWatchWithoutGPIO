package controller;

public class MainController {

    private final GuiController guiController;
    private final ActionController actionController;

    public MainController() {
        this.actionController = new ActionController(this);
        this.guiController = new GuiController(this, actionController);
    }

    public void init() {
//        guiController.initFrame();
        guiController.showAckerSetup();
    }

    public GuiController getGuiController() {
        return guiController;
    }
}

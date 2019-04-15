package controller;

public class ActionController {

    private final MainController controller;

    public ActionController(MainController controller) {
        this.controller = controller;
    }

    public void initBtnAction(String type) {
        switch (type) {
            case "acker":
                controller.getGuiController().showAckerSetup();
                break;
                
        }
    }
    
    public void returnToStartView(){
        controller.getGuiController().initFrame();
    }
}

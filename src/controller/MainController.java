/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Chr!s
 */
public class MainController {

    private final GuiController guiController;
    private final ActionController actionController;

    public MainController() {
        this.actionController = new ActionController(this);
        this.guiController = new GuiController(this, actionController);
    }

    public void init() {

        guiController.init();

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Chr!s
 */
public class Starter {

    private String name;
    private int[] roundTimes;
    private boolean isSelected = false;

    public Starter(String name) {
        this.name = name;
        this.roundTimes = new int[3];
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getRoundTimes() {
        return roundTimes;
    }

    public void setRoundTimes(int[] roundTimes) {
        this.roundTimes = roundTimes;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    @Override
    public String toString() {
        return name;
    }
}

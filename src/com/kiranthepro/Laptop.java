package com.kiranthepro;

import java.util.ArrayList;

public class Laptop extends Device {
    private ArrayList<Component> Components;

    public Laptop(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priority, boolean isChargable) {
        super(identificationCode, makeAndModel, owner, problemDescription, repairNotes, priority, isChargable);
    }


    public void addComponent(Component component) {
        this.Components.add(component);
    }

    public ArrayList<Component> getComponents() {
        return Components;
    }

    public boolean isChargeable() {
        return true;
    }
}

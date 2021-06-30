package com.zeke;

public class Light {
    boolean isOn = true;
    boolean isPluggedIn = true;

    void changeIsOn(boolean newIsOn) {
        isOn = newIsOn;
    }

    void changeIsPluggedIn(boolean newIsPluggedIn) {
        isPluggedIn = newIsPluggedIn;
    }

    void printStates() {
        System.out.println("On: " + isOn + " Plugged In: " + isPluggedIn);
    }
}
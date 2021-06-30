package com.zeke;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Speaker speaker1 = new Speaker();
        Light light1 = new Light();

        speaker1.changeIsPaused(false);
        speaker1.changeVolume(20);
        light1.changeIsOn(true);
        light1.changeIsPluggedIn(true);

        speaker1.printStates();
        light1.printStates();
    }
}



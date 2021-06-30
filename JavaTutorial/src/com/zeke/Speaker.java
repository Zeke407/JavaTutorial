package com.zeke;

public class Speaker {
    boolean isPaused = false;
    int volume = 0;

    void changeIsPaused(boolean newIsPaused) {
        isPaused = newIsPaused;
    }

    void changeVolume(int newVolume) {
        volume = newVolume;
    }

    void printStates() {
        System.out.println("Paused: " + isPaused + " Volume: " + volume);
    }
}

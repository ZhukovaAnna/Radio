package ru.netology.domain;

public class Radio {
    private String name;
    private int currentRadioStation;
    private int currentSoundVolume;
    private int maxRadioStation = 10;
    private int minRadioStation;
    private int maxVolume = 10;
    private int minVolume;
    private boolean on;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = this.maxRadioStation;
            return;
        }
        if (currentRadioStation < minRadioStation) {
            this.currentRadioStation = this.minRadioStation;
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        int nextRadioStation = currentRadioStation + 1;
        if (nextRadioStation > maxRadioStation) {
            this.currentRadioStation = minRadioStation;
        } else
            this.currentRadioStation = nextRadioStation;
    }

    public void previousRadioStation() {
        int previousRadioStation = currentRadioStation - 1;
        if (previousRadioStation < minRadioStation) {
            this.currentRadioStation = maxRadioStation;
        } else
            this.currentRadioStation = previousRadioStation;
    }

    public void increaseCurrentVolume() {
        int nextVolume = this.currentSoundVolume + 1;
        if (nextVolume > getMaxVolume()) {
            return;
        }
        this.currentSoundVolume = nextVolume;
    }

    public void decreaseCurrentVolume() {
        int previousVolume = this.currentSoundVolume - 1;
        if (previousVolume < minVolume) {
            return;
        }
        this.currentSoundVolume = previousVolume;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {

        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {

        this.minRadioStation = minRadioStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {

        this.on = on;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxVolume) {
            this.currentSoundVolume = this.maxVolume;
            return;
        }
        if (currentSoundVolume < minVolume) {
            this.currentSoundVolume = this.minVolume;
            return;
        }
        this.currentSoundVolume = currentSoundVolume;

    }
}
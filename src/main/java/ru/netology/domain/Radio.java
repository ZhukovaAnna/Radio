package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentSoundVolume;
    private int maxRadioStation = 10;
    private int minRadioStation;
    private int maxVolume = 100;
    private int minVolume;
    private boolean on;

    public Radio(int currentRadioStation,
                 int currentSoundVolume,
                 int maxRadioStation,
                 int minRadioStation,
                 int maxVolume,
                 int minVolume,
                 boolean on) {
        this.currentRadioStation = currentRadioStation;
        this.currentSoundVolume = currentSoundVolume;
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.on = on;
    }

    public Radio() {
    }


    public int getCurrentRadioStation()
    {
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
        int currentRadioStation = 0;
        if (this.currentRadioStation <= this.minRadioStation)
            currentRadioStation = this.minRadioStation;
        else
            currentRadioStation = this.currentRadioStation;
        int nextRadioStation = currentRadioStation + 1;
        if (nextRadioStation > getMaxRadioStation()) {
           nextRadioStation = minRadioStation;
        }
        this.currentRadioStation = nextRadioStation;
    }

    public void previousRadioStation() {
        int currentRadioStation = 0;
        if (this.currentRadioStation <= this.minRadioStation)
            currentRadioStation = this.minRadioStation;
        else
            currentRadioStation = this.currentRadioStation;
        int previousRadioStation = currentRadioStation - 1;
        if (previousRadioStation < getMinRadioStation()) {
            previousRadioStation = maxRadioStation;
        }
            this.currentRadioStation = previousRadioStation;
    }

    public void increaseCurrentVolume() {
        int currentVolume = 0;
        if (this.currentSoundVolume <= this.minVolume)
            currentVolume = this.minVolume;
        else
            currentVolume = this.currentSoundVolume;
        int nextVolume = currentVolume + 1;
        if (nextVolume > getMaxVolume()) {
            return;
        } else
            currentVolume = this.currentSoundVolume;
        this.currentSoundVolume = nextVolume;
    }

    public void decreaseCurrentVolume() {
        int currentVolume = 0;
        if (this.currentSoundVolume <= this.minVolume)
            currentVolume = this.minVolume;
        else
            currentVolume = this.currentSoundVolume;

        int previousVolume = currentVolume - 1;
        if (previousVolume < minVolume) {
            previousVolume = minVolume;
        } else
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
        if (currentSoundVolume <= minVolume) {
            this.currentSoundVolume = this.minVolume;
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }
}
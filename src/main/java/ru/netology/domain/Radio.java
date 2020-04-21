package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentRadioStation;
    private int currentSoundVolume;
    private int maxRadioStation = 10;
    private int minRadioStation;
    private int maxVolume = 100;
    private int minVolume;
    private boolean on;

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



package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldGetAndSetOn() {
        Radio radio = new Radio();
        boolean expected = true;
        radio.setOn(expected);
        assertEquals(expected, radio.isOn());
    }

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();
        int expectedStation = 6;
        radio.setCurrentRadioStation(expectedStation);
        assertEquals(expectedStation, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldCheckMaxStation() {
        Radio radio = new Radio();
        int expectedStation = radio.getMaxRadioStation();
        int setStation = 99;
        radio.setCurrentRadioStation(setStation);
        assertEquals(expectedStation, radio.getCurrentRadioStation());

    }

    @Test
    public void shouldBecomeMaxStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        int minRadioStation = radio.getMinRadioStation();
        radio.setCurrentRadioStation(minRadioStation);
        radio.previousRadioStation();
        assertEquals(radio.getMaxRadioStation(), radio.getCurrentRadioStation());
    }

    @Test
    public void shouldBecomeMinStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        int maxRadioStation = radio.getMaxRadioStation();
        radio.setCurrentRadioStation(maxRadioStation);
        radio.nextRadioStation();
        assertEquals(radio.getMinRadioStation(), radio.getCurrentRadioStation());

    }

    @Test
    public void shouldCheckMinStation() {
        Radio radio = new Radio();
        int expectedStation = radio.getMinRadioStation();
        int setStation = -99;
        radio.setCurrentRadioStation(setStation);
        assertEquals(expectedStation, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation() {
        Radio radio = new Radio();
        int currentStation = 5;
        radio.setCurrentRadioStation(currentStation);
        assertEquals(currentStation, radio.getCurrentRadioStation());
        int expectedNextStation = radio.getCurrentRadioStation() + 1;
        radio.nextRadioStation();
        assertEquals(expectedNextStation, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPreviousRadioStation() {
        Radio radio = new Radio();
        int currentStation = 5;
        radio.setCurrentRadioStation(currentStation);
        assertEquals(currentStation, radio.getCurrentRadioStation());
        int expectedPrevious = radio.getCurrentRadioStation() - 1;
        radio.previousRadioStation();
        assertEquals(expectedPrevious, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldCheckMinVolume() {
        Radio radio = new Radio();
        int expectedVolume = radio.getMinVolume();
        int setVolume = -99;
        radio.setCurrentRadioStation(setVolume);
        assertEquals(expectedVolume, radio.getMinVolume());
    }

    @Test
    public void shouldCheckMaxVolume() {
        Radio radio = new Radio();
        int expectedVolume = radio.getMaxVolume();
        int setVolume = 99;
        radio.setCurrentSoundVolume(setVolume);
        assertEquals(expectedVolume, radio.getCurrentSoundVolume());

    }

    @Test
    public void shouldCheckCurrentVolume() {
        Radio radio = new Radio();
        int expectedVolume = 5;
        radio.setCurrentSoundVolume(expectedVolume);
        assertEquals(expectedVolume, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldCheckIncreaseCurrentVolume() {
        Radio radio = new Radio();
        int currentVolume = 5;
        int expectedVolume = radio.getCurrentSoundVolume() + 1;
        radio.increaseCurrentVolume();
        assertEquals(expectedVolume, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldCheckDecreaseCurrentVolume() {
        Radio radio = new Radio();
        int currentVolume = 5;
        radio.setCurrentSoundVolume(currentVolume);
        int expectedVolume = radio.getCurrentSoundVolume() - 1;
        radio.decreaseCurrentVolume();
        assertEquals(expectedVolume, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldGetAndSetMaxRadioStation() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setMaxRadioStation(expected);
        assertEquals(expected, radio.getMaxRadioStation());
    }

    @Test
    public void shouldGetAndSetMinRadioStation() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setMinRadioStation(expected);
        assertEquals(expected, radio.getMinRadioStation());
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        int expected = 10;
        radio.setMaxVolume(expected);
        assertEquals(expected, radio.getMaxVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setMinVolume(expected);
        assertEquals(expected, radio.getMinVolume());
    }

    @Test
    public void shouldNotIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(9);
        radio.setCurrentSoundVolume(radio.getMaxVolume());
        radio.increaseCurrentVolume();
        assertEquals(radio.getCurrentSoundVolume(), radio.getMaxVolume());
    }

    @Test
    public void shouldNotDecreaseMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(9);
        radio.setCurrentSoundVolume(radio.getMinVolume());
        radio.decreaseCurrentVolume();
        assertEquals(radio.getCurrentSoundVolume(), radio.getMinVolume());
    }
}




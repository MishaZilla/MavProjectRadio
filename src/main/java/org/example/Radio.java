package org.example;

public class Radio {

    public int numberCurrentRadioStation;
    public int soundVolume;
    public int decreaseVolume;

    public void setNumberCurrentRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation >= 9) {
            newNumberCurrentRadioStation = 0;
            return;
        }
        if (newNumberCurrentRadioStation <= 0) {
            newNumberCurrentRadioStation = 9;
        }
        numberCurrentRadioStation = newNumberCurrentRadioStation;
    }

    public int buttonNext() {
        int next = numberCurrentRadioStation;
        if (numberCurrentRadioStation == 0) {
        } else {
            next = numberCurrentRadioStation + 1;
        }
        return next;
    }

    public int buttonPrev() {
        int prev = 0;
        if (numberCurrentRadioStation == 9) {
            return numberCurrentRadioStation;
        } else {
            prev = numberCurrentRadioStation - 1;
        }
        return prev;
    }

    public int increaseVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
        return soundVolume;
    }

    public int reduceVolume() {
        if (decreaseVolume > 0) {
            decreaseVolume = decreaseVolume - 1;
        }
        return decreaseVolume;
    }
}
package org.junit.jupiter.api;

public class Radio {

    private int numberCurrentRadioStation;
    private int soundVolume;
    private int decreaseVolume;

    public int getNextStation() {
        return numberCurrentRadioStation;
    }

    public void setNextStation(int newNumberRadioStation) {
        if (newNumberRadioStation >= 9) {
            return;
        } else {
            newNumberRadioStation = newNumberRadioStation + 1;
        }
        numberCurrentRadioStation = newNumberRadioStation;
    }

    public int getPrevStation() {
        return numberCurrentRadioStation;
    }

    public void setPrevStation(int newNumberRadioStation) {
        if (newNumberRadioStation <= 0) {
            newNumberRadioStation = 9;
        } else {
            newNumberRadioStation = newNumberRadioStation - 1;
        }
        numberCurrentRadioStation = newNumberRadioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setIncreaseVolume(int newSoundVolume) {
        if (newSoundVolume < 100) {
            newSoundVolume = newSoundVolume + 1;
        }
        soundVolume = newSoundVolume;
    }

    public int getReduceVolume() {
        return decreaseVolume;
    }

    public void setReduceVolume(int newDecreaseVolume) {
        if (newDecreaseVolume > 0) {
            newDecreaseVolume = newDecreaseVolume - 1;
        }
        decreaseVolume = newDecreaseVolume;
    }
}
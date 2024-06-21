package org.junit.jupiter.api;

public class Radio {

    private int numberCurrentRadioStation;
    private int currentSoundVolumeLevel;

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int currentNumber) {
        if (currentNumber < 0) {
            return;
        }
        if (currentNumber > 9) {
            return;
        }
        numberCurrentRadioStation = currentNumber;
    }

    public int nextStation() {
        return numberCurrentRadioStation;
    }

    public void next(int newNumberRadioStation) {
        if (newNumberRadioStation >= 9) {
            return;
        } else {
            newNumberRadioStation = newNumberRadioStation + 1;
        }
        numberCurrentRadioStation = newNumberRadioStation;
    }

    public int prevStation() {
        return numberCurrentRadioStation;
    }

    public void prev(int newNumberRadioStation) {
        if (newNumberRadioStation <= 0) {
            newNumberRadioStation = 9;
        } else {
            newNumberRadioStation = newNumberRadioStation - 1;
        }
        numberCurrentRadioStation = newNumberRadioStation;
    }

    public int getCurrentSoundLevel() {
        return currentSoundVolumeLevel;
    }

    public void setCurrentSoundLevel(int currentSound) {
        if (currentSound <= 0) {
            return;
        }
        if (currentSound >= 100) {
            return;
        }
        currentSoundVolumeLevel = currentSound;
    }

    public int getCurrentSoundVolumeLevel() {
        return currentSoundVolumeLevel;
    }

    public void setIncreaseVolume(int newSoundVolume) {
        if (newSoundVolume < 100) {
            newSoundVolume = newSoundVolume + 1;
        }
        currentSoundVolumeLevel = newSoundVolume;
    }

    public int getReduceVolume() {
        return currentSoundVolumeLevel;
    }

    public void setReduceVolume(int newDecreaseVolume) {
        if (newDecreaseVolume > 0) {
            newDecreaseVolume = newDecreaseVolume - 1;
        }
        currentSoundVolumeLevel = newDecreaseVolume;
    }
}
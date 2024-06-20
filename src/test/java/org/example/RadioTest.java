package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void buttonNext() {
        Radio next = new Radio();

        next.setNumberCurrentRadioStation(7);

        int expected = 8;
        int actual = next.buttonNext();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderButtonNext() {
        Radio next = new Radio();

        next.setNumberCurrentRadioStation(9);

        int expected = 0;
        int actual = next.buttonNext();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrev() {
        Radio prev = new Radio();

        prev.setNumberCurrentRadioStation(8);

        int expected = 7;
        int actual = prev.buttonPrev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderButtonPrev() {
        Radio prev = new Radio();

        prev.setNumberCurrentRadioStation(0);

        int expected = 9;
        int actual = prev.buttonPrev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolume() {
        Radio sound = new Radio();

        sound.soundVolume = 99;
        int expected = 100;
        int actual = sound.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderSoundVolume() {
        Radio sound = new Radio();

        sound.soundVolume = 100;
        int expected = 100;
        int actual = sound.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio decrease = new Radio();

        decrease.decreaseVolume = 1;
        int expected = 0;
        int actual = decrease.reduceVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderDecreaseVolume() {
        Radio decrease = new Radio();

        decrease.decreaseVolume = 0;
        int expected = 0;
        int actual = decrease.reduceVolume();

        Assertions.assertEquals(expected, actual);
    }
}

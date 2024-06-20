package org.junit.jupiter.api;

public class RadioTest {

    @Test
    public void buttonNext() {
        Radio next = new Radio();

        next.setNextStation(7);

        int expected = 8;
        int actual = next.getNextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderButtonNext() {
        Radio next = new Radio();

        next.setNextStation(9);

        int expected = 0;
        int actual = next.getNextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrev() {
        Radio prev = new Radio();

        prev.setPrevStation(8);

        int expected = 7;
        int actual = prev.getPrevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderButtonPrev() {
        Radio prev = new Radio();

        prev.setPrevStation(0);

        int expected = 9;
        int actual = prev.getPrevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolume() {
        Radio sound = new Radio();

        sound.setIncreaseVolume(87);

        int expected = 88;
        int actual = sound.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderSoundVolume() {
        Radio sound = new Radio();

        sound.setIncreaseVolume(100);

        int expected = 100;
        int actual = sound.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio decrease = new Radio();

        decrease.setReduceVolume(11);

        int expected = 10;
        int actual = decrease.getReduceVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderDecreaseVolume() {
        Radio decrease = new Radio();

        decrease.setReduceVolume(0);

        int expected = 0;
        int actual = decrease.getReduceVolume();

        Assertions.assertEquals(expected, actual);
    }
}

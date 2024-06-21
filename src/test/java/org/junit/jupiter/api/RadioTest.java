package org.junit.jupiter.api;

public class RadioTest {

    @Test
    public void currentStation() {
        Radio rad = new Radio();

        rad.setNumberCurrentRadioStation(4);

        int expected = 4;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationHigher9() {
        Radio rad = new Radio();

        rad.setNumberCurrentRadioStation(10);

        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationBelow0() {
        Radio rad = new Radio();

        rad.setNumberCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getNumberCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonNext() {
        Radio button = new Radio();

        button.next(7);

        int expected = 8;
        int actual = button.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderButtonNext() {
        Radio button = new Radio();

        button.next(9);

        int expected = 0;
        int actual = button.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrev() {
        Radio button = new Radio();

        button.prev(8);

        int expected = 7;
        int actual = button.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderButtonPrev() {
        Radio button = new Radio();

        button.prev(0);

        int expected = 9;
        int actual = button.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentSoundLevel() {
        Radio rad = new Radio();

        rad.setCurrentSoundLevel(27);

        int expected = 27;
        int actual = rad.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentSoundLevelHigher100() {
        Radio rad = new Radio();

        rad.setCurrentSoundLevel(112);

        int expected = 0;
        int actual = rad.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentSoundLevelBelow0() {
        Radio rad = new Radio();

        rad.setCurrentSoundLevel(-3);

        int expected = 0;
        int actual = rad.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void soundVolume() {
        Radio sound = new Radio();

        sound.setIncreaseVolume(87);

        int expected = 88;
        int actual = sound.getCurrentSoundVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void borderSoundVolume() {
        Radio sound = new Radio();

        sound.setIncreaseVolume(100);

        int expected = 100;
        int actual = sound.getCurrentSoundVolumeLevel();

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

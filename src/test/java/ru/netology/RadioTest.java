package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testSetCurrentStationRegularFlow() {

        Radio radio = new Radio();

        radio.setCurrentStation(4);

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSetCurrentStationAboveMax() {

        Radio radio = new Radio();

        radio.setCurrentStation(6);
        radio.setCurrentStation(25);

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSetCurrentStationBelowZero() {

        Radio radio = new Radio();

        radio.setCurrentStation(3);
        radio.setCurrentStation(-6);

        int expected = 3;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNextRegularFlow() {

        Radio radio = new Radio();

        radio.setCurrentStation(3);
        radio.next();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNextResetToZero() {

        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testPrevRegularFlow() {

        Radio radio = new Radio();

        radio.setCurrentStation(3);
        radio.prev();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testPrevResetToNine() {

        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSetVolumeRegularFlow() {

        Radio radio = new Radio();

        radio.setCurrentVolume(40);

        int expected = 40;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSetVolumeAboveMax() {

        Radio radio = new Radio();

        radio.setCurrentVolume(40);
        radio.setCurrentVolume(200);

        int expected = 40;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testSetVolumeBelowZero() {

        Radio radio = new Radio();

        radio.setCurrentVolume(25);
        radio.setCurrentVolume(-34);

        int expected = 25;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testIncreaseVolumeRegularFlow() {

        Radio radio = new Radio();

        radio.setCurrentVolume(20);
        radio.increaseVolume();

        int expected = 21;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testIncreaseVolumeAboveMax() {

        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testDecreaseVolumeRegularFlow() {

        Radio radio = new Radio();

        radio.setCurrentVolume(34);
        radio.decreaseVolume();

        int expected = 33;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testDecreaseVolumeBelowZero() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


}

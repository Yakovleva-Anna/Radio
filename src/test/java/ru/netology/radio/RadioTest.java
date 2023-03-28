package ru.netology.radio;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio rad = new Radio();
        rad.setStation(5);

        int expected = 5;
        int actual = rad.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWrongStation() {
        Radio rad = new Radio();
        rad.setStation(11);

        int expected = 0;
        int actual = rad.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWrongStation2() {
        Radio rad = new Radio();
        rad.setStation(-1);

        int expected = 0;
        int actual = rad.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio rad = new Radio();
        rad.setStation(0);
        rad.nextStation();

        int expected = 1;
        int actual = rad.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio rad = new Radio();
        rad.setStation(9);
        rad.prevStation();

        int expected = 8;
        int actual = rad.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextMaxStation() {
        Radio rad = new Radio();
        rad.setStation(9);
        rad.nextStation();

        int expected = 0;
        int actual = rad.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevMinStation() {
        Radio rad = new Radio();
        rad.setStation(0);
        rad.prevStation();

        int expected = 9;
        int actual = rad.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeUp() {
        Radio rad = new Radio();
        rad.setVolume(0);
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeDown() {
        Radio rad = new Radio();
        rad.setVolume(100);
        rad.decreaseVolume();

        int expected = 99;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio rad = new Radio();
        rad.setVolume(101);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio rad = new Radio();
        rad.setVolume(-1);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}

package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    void shouldSetTheVolume() {
        Radio radio = new Radio();

        radio.setReduceTheVolume(6);

        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);


    }

    @Test
    void shouldSetTheNegativeVolume() {
        Radio radio = new Radio();

        radio.setReduceTheVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);


    }

    @Test
    void shouldSetTheMoreTenVolume() {
        Radio radio = new Radio();

        radio.setReduceTheVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldInCreaseVolume() {
        Radio radio = new Radio();
        radio.setReduceTheVolume(0);

        radio.inCreaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldInCreaseVolumeMoreTen() {
        Radio radio = new Radio();
        radio.setReduceTheVolume(10);

        radio.inCreaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldLowerVolumeZero() {
        Radio radio = new Radio();
        radio.setReduceTheVolume(0);

        radio.lowerVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldLowerVolume() {
        Radio radio = new Radio();
        radio.setReduceTheVolume(10);

        radio.lowerVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentNegativeStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    void shouldSetCurrentStationMoreNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    void shouldBackStationZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.backStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldBackStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);

        radio.backStation();

        int expected = 3;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

}



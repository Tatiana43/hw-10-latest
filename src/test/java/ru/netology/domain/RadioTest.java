package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldCheckSetMaxStation(){
        Radio radio = new Radio(11, 12, 10);

        assertEquals(12, radio.getMaxStation());
    }

    @Test
    public void shouldCheckNextStation(){
        Radio radio = new Radio(10, 11, 10);

        radio.nextStation();
        assertEquals(11, radio.getCurrentStation());
    }

    @Test
    public void shouldCheckPreviousStation(){
        Radio radio = new Radio(2, 11, 10);

        radio.previousStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldCheckSwitchMaxToMinStation(){
        Radio radio = new Radio(11, 11, 10);

        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldCheckSwitchMinToMaxStation(){
        Radio radio = new Radio(0, 12, 10);

        radio.previousStation();
        assertEquals(12, radio.getCurrentStation());
    }

    @Test
    public void shouldCheckSetCurrentStation(){
        Radio radio = new Radio(10, 11, 10);

        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldCheckVolumeUp(){
        Radio radio = new Radio(10,11, 10);

        radio.volumeLevelUp();
        assertEquals(11, radio.getCurrentVolume());
    }

    @Test
    public void shouldCheckVolumeDown(){
        Radio radio = new Radio(10, 11, 99);

        radio.volumeLevelDown();
        assertEquals(98, radio.getCurrentVolume());
    }

    @Test
    public void shouldCheckMaxVolume(){
        Radio radio = new Radio(10,11,100);

        radio.volumeLevelUp();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldCheckMinVolume(){
        Radio radio = new Radio(10,11,0);

        radio.volumeLevelDown();
        assertEquals(0, radio.getCurrentVolume());
    }

}


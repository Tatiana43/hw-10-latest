package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldCheckMaxStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldCheckMinStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    public void shouldCheckSetMaxStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldCheckSetMinStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldCheckNextStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.nextStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void shouldCheckPreviousStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.previousStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldCheckMaxVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(11);
        radio.volumeLevelUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldCheckMinVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.volumeLevelDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldCheckVolumeUp(){
        Radio radio = new Radio();

        radio.setCurrentVolume(2);
        radio.volumeLevelUp();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    public void shouldCheckVolumeDown(){
        Radio radio = new Radio();

        radio.setCurrentVolume(2);
        radio.volumeLevelDown();
        assertEquals(1, radio.getCurrentVolume());
    }

}   

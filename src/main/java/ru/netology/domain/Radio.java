package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        this.currentStation = currentStation;
    }

    public void nextStation(){
        if (currentStation < maxStation) {
            currentStation++;
        }
        else currentStation = minStation;
    }

    public void previousStation() {
        if (currentStation > minStation) {
            currentStation--;
        }
        else currentStation = maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume){
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume){
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void volumeLevelUp() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void volumeLevelDown() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

}

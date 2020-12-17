package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 10;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int currentStation, int maxStation, int currentVolume) {
        this.currentStation = currentStation;
        this.maxStation = maxStation;
        this.currentVolume = currentVolume;
    }

    public void setCurrentStation(int currentStation){
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else currentStation = minStation;
    }

    public void previousStation(){
        if (currentStation > minStation) {
            currentStation--;
        } else currentStation = maxStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
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
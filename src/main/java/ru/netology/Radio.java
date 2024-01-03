package ru.netology;


public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation <= 9) {
            if (newCurrentStation >= 0) {
                currentStation = newCurrentStation;
            }
        }
    }


    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }


    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int newVolume) {
        if (newVolume <= 100) {
            if (newVolume >= 0) {
                currentVolume = newVolume;
            }
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}



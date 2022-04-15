package ru.netology.domain;

public class Radio {

    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setReduceTheVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;

    }

    public void inCreaseVolume() {
        if (currentVolume == 10) {
            return;
        }
        setReduceTheVolume(currentVolume);
        this.currentVolume = currentVolume + 1;
    }


    public void lowerVolume() {
        if (currentVolume == 0) {
            return;
        } else {
            setReduceTheVolume(currentVolume);
            this.currentVolume = currentVolume - 1;
        }

    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            currentStation = 9;
        }
        this.currentStation = currentStation;
    }

    public void backStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            setCurrentStation(currentStation);
            this.currentStation = currentStation - 1;
        }


    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            setCurrentStation(currentStation);
            this.currentStation = currentStation + 1;
        }
    }


}

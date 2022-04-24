package ru.netology.domain;

public class Radio {

    private int currentVolume;

    private int currentStation;

    private int numberOfStations;

    private int minVolume = 0;

    private int maxVolume = 100;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setReduceTheVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;

    }

    public void inCreaseVolume() {
        if (currentVolume == maxVolume) {
            this.currentVolume = maxVolume;
        } else {
            setReduceTheVolume(currentVolume);
            this.currentVolume = currentVolume + 1;
        }

    }


    public void lowerVolume() {
        if (currentVolume == minVolume) {
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
        if (currentStation <= numberOfStations) {
            this.currentStation = currentStation;
        } else {
            this.currentStation = numberOfStations;
        }
        if (currentStation == 0) {
            currentStation = 0;
        } else {
            if (currentStation == numberOfStations) {
                this.currentStation = numberOfStations - 1;
            }
        }
    }

    public void backStation() {
        if (currentStation == 0) {
            currentStation = numberOfStations;
        } else {
            setCurrentStation(currentStation);
            this.currentStation = currentStation - 1;
        }


    }

    public void nextStation() {
        if (currentStation == numberOfStations - 1) {
            this.currentStation = 0;
        } else {
            setCurrentStation(currentStation);
            this.currentStation = currentStation + 1;
        }
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;

    }

    public Radio() {
        numberOfStations = 10;
    }


}

package ru.netology.radio;

public class Radio {
    private int station;
    private int minStation = 0;
    private int maxStation = 9;
    private int stationsCount = 10;
    private int volume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {

    }

    public Radio(int stationsCount) {
        this.stationsCount = stationsCount;
        this.maxStation = stationsCount - 1;
    }

    public int getStation() {

        return station;
    }

    public void setStation(int station) {
        if (station < minStation) {
            return;
        }
        if (station > maxStation) {
            return;
        }
        this.station = station;
    }


    public void nextStation() {
        if (station < maxStation) {
            station++;
        } else {
            station = minStation;
        }
    }

    public void prevStation() {
        if (station > minStation) {
            station--;
        } else {
            station = maxStation;
        }
    }

    public int getVolume() {

        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume) {
            return;
        }
        if (volume > maxVolume) {
            volume = maxVolume;
        }
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume++;
        }
        this.volume = volume;
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            volume--;
        }
    }
}

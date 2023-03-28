package ru.netology.radio;

public class Radio {
    private int station;
    private int volume;

    public int getStation() {

        return station;
    }

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        station = newStation;
    }


    public void nextStation() {
        if (station < 9) {
            station++;
        } else {
            station = 0;
        }
    }

    public void prevStation() {
        if (station > 0) {
            station--;
        } else {
            station = 9;
        }
    }

    public int getVolume() {

        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            newVolume = 100;
        }
        volume = newVolume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}

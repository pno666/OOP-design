package ru.netology.std;

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int maxStation;
    private int minStation = 0;
    private int currentVolume = minVolume;
    private int currentStation = minStation;

    public Radio(int sumStation) {
        this.maxStation = sumStation - 1;
    }

    public Radio() {
        this.maxStation = 9;
    }
    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void increasedVolume() {
        int volume = this.currentVolume + 1;
        this.setCurrentVolume(volume);
    }

    public void reduceVolume() {
        int volume = this.currentVolume - 1;
        this.setCurrentVolume(volume);
    }


    public int getCurrentStation() {
        return this.currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation > maxStation) {
            return;
        }
        if (newStation < minStation) {
            return;
        }
        this.currentStation = newStation;
    }

    public void next() {
        if (this.currentStation < maxStation) {
            this.currentStation++;
        } else {
            this.currentStation = minStation;
        }
    }

    public void prev() {
        if (this.currentStation > minStation) {
            this.currentStation--;
        } else {
            this.currentStation = maxStation;
        }
    }
}

package ru.netology.std;

public class Radio {
    private int currentVolume;
    private int currentStation;

    public Radio() {
        this.currentVolume = 0;
        this.currentStation = 0;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
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
        if (newStation > 9) {
            return;
        }
        if (newStation < 0) {
            return;
        }
        this.currentStation = newStation;
    }

    public void next() {
        if (this.currentStation < 9) {
            this.currentStation++;
        } else {
            this.currentStation = 0;
        }
    }

    public void prev() {
        if (this.currentStation > 0) {
            this.currentStation--;
        } else {
            this.currentStation = 9;
        }
    }
}

package ru.netology.std;

public class Radio {
    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increasedVolume() {
        int volume = currentVolume + 1;
        setCurrentVolume(volume);
    }

    public void reduceVolume() {
        int volume = currentVolume - 1;
        setCurrentVolume(volume);
    }

    //  public int currentStation;

  /*  public int getCurrentStation() {
        return currentStation;
    }



    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

   */


    public int next(int currentStation) {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
        return currentStation;
    }

    public int prev(int currentStation) {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
        return currentStation;
    }
}

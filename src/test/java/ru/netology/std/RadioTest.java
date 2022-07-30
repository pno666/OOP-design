package ru.netology.std;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/incvolume.csv")
    public void shouldIncreaseVolume(int curvol, int exp) {
        Radio vol = new Radio();
        vol.setCurrentVolume(curvol);
        vol.increasedVolume();
        int act = vol.getCurrentVolume();
        Assertions.assertEquals(exp, act);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/redvolume.csv")
    public void shouldReducedVolume(int curvol, int exp) {
        Radio vol = new Radio();
        vol.setCurrentVolume(curvol);
        vol.reduceVolume();
        int act = vol.getCurrentVolume();
        Assertions.assertEquals(exp, act);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/next.csv")
    public void shouldNextStation(int curst, int exp, int sumStation) {
        Radio station = new Radio(sumStation);
        station.setCurrentStation(curst);
        station.next();
        int act = station.getCurrentStation();
        Assertions.assertEquals(exp, act);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/prev.csv")
    public void shouldPrevStation(int curst, int exp, int sumStation) {
        Radio station = new Radio(sumStation);
        station.setCurrentStation(curst);
        station.prev();
        int act = station.getCurrentStation();
        Assertions.assertEquals(exp, act);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/station.csv")
    public void shouldUseStation(int st, int exp, int sumStation) {
        Radio station = new Radio(sumStation);
        station.setCurrentStation(st);
        int act = station.getCurrentStation();
        Assertions.assertEquals(exp, act);
    }
    @Test
    public void shouldUseStationWhithoutCurStation() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        int exp = 5;
        int act = station.getCurrentStation();
        Assertions.assertEquals(exp, act);
    }
}

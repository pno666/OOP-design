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
    public void shoulNextStation(int curst, int exp) {
        Radio station = new Radio();
        int act = station.next(curst);
        Assertions.assertEquals(exp, act);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/prev.csv")
    public void shouldPrevStation(int curst, int exp) {
        Radio station = new Radio();
        int act = station.prev(curst);
        Assertions.assertEquals(exp, act);
    }
}

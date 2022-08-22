package com.jap;

import java.util.Arrays;

/**
 * Hello world!
 */
public class SortingCities {
    public static void main(String[] args) {
        String[] cityNames = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        int[] distanceInKms = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
    }

    public String[] sortingCityNames(String[] cityNames) {
        Arrays.sort(cityNames);
        return cityNames;
    }


}

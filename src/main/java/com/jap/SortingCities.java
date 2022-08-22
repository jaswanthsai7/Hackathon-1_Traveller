package com.jap;

import java.util.Arrays;

/**
 * Hello world!
 */
public class SortingCities {
    public static void main(String[] args) {
        // initialize and declare an array of city names
        String[] cityNames = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        // initialize and declare an array of city distance
        int[] distanceInKms = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
    }

    /**
     * Sort the array of city names and return the sorted array.
     *
     * @param cityNames An array of strings that represent the names of cities.
     * @return The method is returning the sorted array of city names.
     */
    public String[] sortingCityNames(String[] cityNames) {
        Arrays.sort(cityNames);
        return cityNames;
    }

    /**
     * It sorts an array of integers in ascending order
     *
     * @param distanceInKms an array of integers
     * @return The sorted array is being returned.
     */
    public int[] sortingDistance(int[] distanceInKms) {
        Arrays.sort(distanceInKms);
        return distanceInKms;
    }

    public String[] convertCityNamesToUppercase(String[] cityNames) {
        String[] cityUpperCase = new String[cityNames.length];
        for (int i = 0; i < cityNames.length; i++) {
            cityUpperCase[i] = cityNames[i].toUpperCase();
        }
        return cityUpperCase;
    }

}

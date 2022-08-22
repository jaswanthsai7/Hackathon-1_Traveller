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
        // create a variable to call the methods
        SortingCities sortingCities = new SortingCities();
        sortingCities.sortWithDistance(distanceInKms, cityNames);
        String[] cityUpperCase = sortingCities.convertCityNamesToUppercase(cityNames);
        System.out.println("The Uppercase City Names : " + Arrays.toString(cityUpperCase));
        String city52Kms = sortingCities.findCity52Kms(distanceInKms, cityNames);
        System.out.println(city52Kms);
        String cityGreaterThanOrEqual270 = sortingCities.findCityGreaterThanOrEqual270(distanceInKms, cityNames);
        System.out.println(cityGreaterThanOrEqual270);
    }

    /**
     * Convert the city names to uppercase.
     *
     * @param cityNames An array of strings that represent city names.
     * @return An array of strings.
     */
    public String[] convertCityNamesToUppercase(String[] cityNames) {
        String[] cityUpperCase = new String[cityNames.length];
        for (int i = 0; i < cityNames.length; i++) {
            cityUpperCase[i] = cityNames[i].toUpperCase();
        }
        return cityUpperCase;
    }

    /**
     * The function takes in two arrays, one of integers and one of strings, and sorts the integers in ascending order
     * while also sorting the strings in the same order
     *
     * @param distance an array of integers
     * @param city     an array of strings
     */
    public void sortWithDistance(int[] distance, String[] city) {
        int temp = 0;
        String tempCityNew;
        for (int i = 0; i < distance.length; i++) {
            for (int j = 0; j < city.length - 1 - i; j++) {
                if (distance[j] > distance[j + 1]) {
                    temp = distance[j];
                    distance[j] = distance[j + 1];
                    distance[j + 1] = temp;
                    tempCityNew = city[j];
                    city[j] = city[j + 1];
                    city[j + 1] = tempCityNew;


                }
            }
        }
        System.out.println(Arrays.toString(distance));
        System.out.println(Arrays.toString(city));

    }

    /**
     * It takes an array of integers and an array of strings as input, and returns a string
     *
     * @param distanceInKms an array of integers
     * @param cityNames     ["New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San
     *                      Diego", "Dallas", "San Jose"]
     * @return The city name and distance in Kms.
     */
    public String findCity52Kms(int[] distanceInKms, String[] cityNames) {
        for (int i = 0; i < distanceInKms.length; i++) {
            if (distanceInKms[i] == 52) {
                return cityNames[i].concat(" : ").concat(String.valueOf(distanceInKms[i]));
            }
        }
        return null;

    }

    public String findCityGreaterThanOrEqual270(int[] distanceInKms, String[] cityNames) {
        for (int i = 0; i < distanceInKms.length; i++) {
            if (distanceInKms[i] >= 270) {
                return cityNames[i].concat(" : ").concat(String.valueOf(distanceInKms[i]));
            }

        }
        return null;
    }
}

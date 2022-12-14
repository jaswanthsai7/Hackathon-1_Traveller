package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertNull;

public class SwitzerlandTravelPlanTest {
    SwitzerlandTravelPlan sortingCities;

    @Before
    public void setUp() {
        sortingCities = new SwitzerlandTravelPlan();
    }

    @After
    public void tearDown() {
        sortingCities = null;
    }

    //write all the test cases here
    @Test
    // A test case to check the success of the method findCity52Kms.
    public void toCheckFindCity52KmsSuccess() {
        int[] distanceInKms = {138, 118, 52, 136, 85, 276};
        String[] cityNames = {"Bern", "Interlaken", "Lucerne", "Grindelwald", "Engelberg", "Geneva"};
        String expectedResult = "Lucerne : 52";
        String actualResult = sortingCities.findCity52Kms(distanceInKms, cityNames);
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    // A test case to check the failure of the method findCity52Kms.
    public void toCheckFindCity52KmsFailure() {
        int[] distanceInKms = {138, 118, 136, 85, 276};
        String[] cityNames = {"Bern", "Interlaken", "Grindelwald", "Engelberg", "Geneva"};
        String actualResult = sortingCities.findCity52Kms(distanceInKms, cityNames);
        Assertions.assertNull(actualResult);
    }

    @Test
    // This is a test case to check the success of the method findCityGreaterThanOrEqual270.
    public void toCheckFindCityGreaterThan270Success() {
        int[] distanceInKms = {138, 118, 136, 85, 276};
        String[] cityNames = {"Bern", "Interlaken", "Grindelwald", "Engelberg", "Geneva"};
        String expectedResult = "Geneva : 276";
        String actualResult = sortingCities.findCityGreaterThanOrEqual270(distanceInKms, cityNames);
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    // This is a test case to check the failure of the method findCityGreaterThanOrEqual270.
    public void toCheckFindCityGreaterThan270Failure() {
        int[] distanceInKms = {138, 118, 136, 85};
        String[] cityNames = {"Bern", "Interlaken", "Grindelwald", "Engelberg"};
        String actualResult = sortingCities.findCityGreaterThanOrEqual270(distanceInKms, cityNames);
        Assertions.assertNull(actualResult);

    }

    @Test
    // This is a test case to check the success of the method convertCityNamesToUppercase.
    public void toCheckUpperCaseSuccess() {
        String[] cityNames = {"Bern", "Intern"};
        String[] expectedResult = {"BERN", "INTERN"};
        String[] actualResult = sortingCities.convertCityNamesToUppercase(cityNames);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    // This is a test case to check the failure of the method convertCityNamesToUppercase.
    public void toCheckUpperCaseFailure() {
        String[] cityNames = {"NewYork", "Dallas"};
        String[] expectedResult = {"NEWYORK", "DALLAS"};
        String[] actualResult = sortingCities.convertCityNamesToUppercase(cityNames);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    // This is a test case to check the success of the method sortWithDistance.
    public void toCheckSortWithDistanceSuccess() {
        String[] cityNames = new String[0];
        int[] distanceInKms = {138, 52, 118, 136, 85, 276};
        int[] actualResult = sortingCities.sortWithDistance(distanceInKms, cityNames);
        Assertions.assertArrayEquals(null, actualResult);
    }

    @Test
    // This is a test case to check the failure of the method sortWithDistance.
    public void toCheckSortWithDistanceFailure() {
        String[] cityNames = {"Bern", "Lucerne", "Grindelwald", "Engelberg"};
        int[] distanceInKms = {52, 118, 136, 85};
        int[] expectedKms = {52, 85, 118, 136};
        int[] actualResult = sortingCities.sortWithDistance(distanceInKms, cityNames);
        Assertions.assertArrayEquals(expectedKms, actualResult);
    }

    @Test
    // This is a test case to check the success of the method sortingTheCities.
    public void toCheckSortingWithCitySuccess() {
        String[] cityNames = {"Bern", "Lucerne", "Grindelwald", "Engelberg"};
        String[] expectedResult = {"Bern", "Engelberg", "Grindelwald", "Lucerne"};
        String[] actualResult = sortingCities.sortingTheCities(cityNames);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    // This is a test case to check the failure of the method sortingTheCities.
    public void toCheckSortingWithCityFailure() {
        String[] cityNames = new String[0];
        String[] actualResult = sortingCities.sortingTheCities(cityNames);
        Assertions.assertArrayEquals(null, actualResult);
    }

    @Test
    // A test case to check the failure of the method sortWithDistance.
    public void toCheckDistanceFailures() {
        int[] distance = {40, 50, 78, 15, 27, 62};
        String[] cityNames = new String[0];
        assertNull(sortingCities.sortWithDistance(distance, cityNames));
    }

    @Test
    // Checking the failure of the method findCity52Kms.
    public void toCheckTheCityFrom52KmFailure() {
        Assertions.assertNull(sortingCities.findCity52Kms(new int[]{0}, null));
        Assertions.assertNull(sortingCities.findCity52Kms(new int[]{1, 2, 3, 5}, null));
    }
}
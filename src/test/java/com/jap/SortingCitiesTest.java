package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SortingCitiesTest {
    SortingCities sortingCities;

    @Before
    public void setUp() {
        sortingCities = new SortingCities();
    }

    @After
    public void tearDown() {
    }

    //write all the test cases here
    @Test
    public void toCheckFindCity52KmsSuccess() {
        int[] distanceInKms = {138, 118, 52, 136, 85, 276};
        String[] cityNames = {"Bern", "Interlaken", "Lucerne", "Grindelwald", "Engelberg", "Geneva"};
        String expectedResult = "Lucerne : 52";
        String actualResult = sortingCities.findCity52Kms(distanceInKms, cityNames);
        Assertions.assertEquals(expectedResult, actualResult);

    }

}
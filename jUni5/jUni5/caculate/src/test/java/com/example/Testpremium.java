package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class Testpremium {
    @ParameterizedTest
    @CsvFileSource(resources = "Testinsurrance.csv", numLinesToSkip = 1)
    public void testPremiumCal(String breakdownCover, String windscreenRepair,
            int accidentsLastYear,
            int totalMileage,
            int estimatedValue, String parkingLocation, int RealPremium) {

        premiumCal calculator = new premiumCal();

        int calculatedPremium = calculator.Cal(breakdownCover, windscreenRepair, accidentsLastYear,
                totalMileage, estimatedValue, parkingLocation);

        assertEquals(calculatedPremium, RealPremium);
    }

}

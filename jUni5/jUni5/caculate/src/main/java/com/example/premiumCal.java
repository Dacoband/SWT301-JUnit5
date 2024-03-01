package com.example;

public class premiumCal {

    public static int Cal(String breakdownCover, String windscreenRepair, int accidentsLastYear, int totalMileage,
            int estimatedValue, String parkingLocation) {
        // Check if Estimated Value is less than 100, do not proceed

        double premium = 0.0;

        // Apply cover type effect on premium
        switch (breakdownCover) {
            case "No Cover":
                premium = estimatedValue * 0.01; // Increase by 1%
                break;
            case "Roadside":
                premium = estimatedValue * 0.02; // Increase by 2%
                break;
            case "At Home":
                premium = estimatedValue * 0.03; // Increase by 3%
                break;
            case "European":
                premium = estimatedValue * 0.04; // Increase by 4%
                break;
            default:
                // Set a default value or handle unrecognized breakdown cover option
                break;
        }

        // Increment premium if Windscreen Repair is selected
        if (windscreenRepair.equals("Yes")) {
            premium += 30;
        }

        // Increment premium if Total Mileage > 5000
        if (totalMileage >= 5000) {
            premium += 50;
        }

        // Increment premium if Parking Location is Public Place
        if (parkingLocation.equals("Public Place")) {
            premium += 30;
        }

        // Apply discount if no accidents last year
        if (accidentsLastYear == 0) {
            premium -= premium * 0.3; // 30% discount
        }

        if (estimatedValue <= 100) {
            premium = 0.0;
        }

        return (int) Math.round(premium);
    }
}
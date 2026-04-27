/**
 * TrainConsistManagementApp
 *
 * UC17: Sort Bogie Names using Arrays.sort()
 *
 * Demonstrates built-in optimized sorting (alphabetical).
 *
 * @author Mahathi
 * @version 1.0
 */

import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie names
        String[] bogies = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Display original array
        System.out.println("Original Bogies: " + Arrays.toString(bogies));

        // Sort using built-in method
        Arrays.sort(bogies);

        // Display sorted array
        System.out.println("Sorted Bogies: " + Arrays.toString(bogies));
    }
}
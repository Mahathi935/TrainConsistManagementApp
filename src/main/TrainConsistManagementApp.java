/**
 * TrainConsistManagementApp
 *
 * UC1: Initialize Train and Display Consist Summary
 *
 * Demonstrates application startup and dynamic initialization using ArrayList.
 *
 * @author Mahathi
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty consist (dynamic list)
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        System.out.println("Train initialized successfully.");
    }
}

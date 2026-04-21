/**
 * TrainConsistManagementApp
 *
 * UC2: Add Passenger Bogies using ArrayList operations
 *
 * Demonstrates add, remove, contains, and order preservation.
 *
 * @author Mahathi
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList
        List<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display after insertion
        System.out.println("After Adding Bogies: " + bogies);

        // Remove a bogie
        bogies.remove("AC Chair");
        System.out.println("After Removing AC Chair: " + bogies);

        // Check existence
        boolean exists = bogies.contains("Sleeper");
        System.out.println("Is Sleeper Present? " + exists);

        // Final state
        System.out.println("Final Bogie List: " + bogies);
    }
}
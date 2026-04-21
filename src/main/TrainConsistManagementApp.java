/**
 * TrainConsistManagementApp
 *
 * UC6: Map Bogie to Capacity using HashMap
 *
 * Demonstrates key–value mapping for real-world attributes.
 *
 * @author Mahathi
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashMap (bogie → capacity)
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert values
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display mapping
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
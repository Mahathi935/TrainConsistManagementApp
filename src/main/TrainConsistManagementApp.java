/**
 * TrainConsistManagementApp
 *
 * UC5: Preserve Insertion Order using LinkedHashSet
 *
 * Demonstrates uniqueness + ordered storage of bogies.
 *
 * @author Mahathi
 * @version 1.0
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet (ordered + unique)
        Set<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Add duplicate intentionally
        train.add("Sleeper"); // will be ignored

        // Display formation
        System.out.println("Train Formation (Ordered & Unique): " + train);
    }
}
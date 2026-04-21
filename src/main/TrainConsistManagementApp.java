/**
 * TrainConsistManagementApp
 *
 * UC4: Maintain Ordered Bogie IDs using LinkedList
 *
 * Demonstrates ordered insertion, deletion, and middle insertion.
 *
 * @author Mahathi
 * @version 1.0
 */

import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for ordered consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies (initial order)
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train: " + train);

        // Insert Pantry Car at position 2 (index 2)
        train.add(2, "Pantry Car");
        System.out.println("After Adding Pantry Car: " + train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Final consist
        System.out.println("Final Train Consist: " + train);
    }
}
/**
 * TrainConsistManagementApp
 *
 * UC8: Filter Bogies using Stream API
 *
 * Demonstrates filtering using streams and lambda expressions.
 *
 * @author Mahathi
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Bogie class (same as UC7)
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("General", 80));

        // Apply stream filter (capacity > 60)
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("Filtered Bogies (Capacity > 60):");

        for (Bogie b : filtered) {
            System.out.println(b.name + " → " + b.capacity);
        }

        // Show original list unchanged
        System.out.println("\nOriginal List Size: " + bogies.size());
    }
}
/**
 * TrainConsistManagementApp
 *
 * UC19: Binary Search for Bogie ID
 *
 * Demonstrates efficient searching on sorted data using divide-and-conquer.
 *
 * @author Mahathi
 * @version 1.0
 */

import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sorted array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Ensure sorted (safety step)
        Arrays.sort(bogieIds);

        String searchId = "BG309";

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = searchId.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison > 0) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        // Result
        if (found) {
            System.out.println("Bogie Found: " + searchId);
        } else {
            System.out.println("Bogie Not Found: " + searchId);
        }
    }
}
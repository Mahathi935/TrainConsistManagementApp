/**
 * TrainConsistManagementApp
 *
 * UC18: Linear Search for Bogie ID
 *
 * Demonstrates searching in an unsorted array using sequential traversal.
 *
 * @author Mahathi
 * @version 1.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key
        String searchId = "BG309";

        boolean found = false;

        // Linear Search
        for (String id : bogieIds) {

            if (id.equals(searchId)) {
                found = true;
                break; // stop early if found
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie Found: " + searchId);
        } else {
            System.out.println("Bogie Not Found: " + searchId);
        }
    }
}
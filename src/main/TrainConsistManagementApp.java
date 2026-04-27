/**
 * TrainConsistManagementApp
 *
 * UC20: Prevent search on empty collection using IllegalStateException
 *
 * Demonstrates fail-fast validation before performing search.
 *
 * @author Mahathi
 * @version 1.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Empty bogie collection
        String[] bogieIds = {};

        String searchId = "BG101";

        // Defensive check (fail-fast)
        if (bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in train.");
        }

        // (Search logic will not run if empty)
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie Found: " + searchId);
        } else {
            System.out.println("Bogie Not Found: " + searchId);
        }
    }
}
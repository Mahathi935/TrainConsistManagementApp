/**
 * TrainConsistManagementApp
 *
 * UC16: Bubble Sort (Manual Sorting)
 *
 * Sorts passenger bogie capacities without using built-in methods.
 *
 * @author Mahathi
 * @version 1.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.print("Original Capacities: ");
        printArray(capacities);

        // Bubble Sort
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Capacities: ");
        printArray(capacities);
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
import java.util.HashMap;
import java.util.Map;

public class TrainConsistManangementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ✅ Create a HashMap to store bogie name → capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // ✅ Insert capacities for passenger bogies
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // ✅ Display bogie capacities
        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " seats");
        }

        // ✅ Example: lookup capacity quickly
        String bogieToCheck = "AC Chair";
        System.out.println("\nCapacity of " + bogieToCheck + ": " + bogieCapacity.get(bogieToCheck) + " seats");
    }
}
import java.util.HashSet;
import java.util.Set;

public class TrainConsistManangementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ✅ Create a HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // ✅ Add bogie IDs (including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // ✅ Display unique bogie IDs
        System.out.println("\nFinal Bogie IDs in Train:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Display total unique count
        System.out.println("\nTotal unique bogies: " + bogieIds.size());
    }
}

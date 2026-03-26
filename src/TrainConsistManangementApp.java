import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManangementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ✅ Create LinkedHashSet to maintain order + uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // ✅ Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // ✅ Attempt to add duplicate
        trainFormation.add("Sleeper"); // ignored automatically

        // ✅ Display final formation
        System.out.println("\nFinal Train Formation:");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }

        // Display total count
        System.out.println("\nTotal bogies: " + trainFormation.size());
    }
}
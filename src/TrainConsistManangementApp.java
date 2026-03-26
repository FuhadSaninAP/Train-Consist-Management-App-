import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainConsistManangementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ✅ Create a list to store passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();

        // ✅ Add bogies
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 60));
        passengerBogies.add(new Bogie("First Class", 40));

        // ✅ Sort bogies by capacity (descending)
        passengerBogies.sort(Comparator.comparingInt(b -> b.capacity));
        // For descending order: Comparator.comparingInt(Bogie::getCapacity).reversed();
        // Here using lambda for simplicity

        // ✅ Display sorted bogies
        System.out.println("\nPassenger Bogies Sorted by Capacity:");
        for (Bogie bogie : passengerBogies) {
            System.out.println(bogie);
        }
    }
}
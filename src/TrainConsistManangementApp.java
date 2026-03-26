

import java.util.ArrayList;
import java.util.List;

        class PassengerBogie {
            String type;
            int seatCapacity;

            PassengerBogie(String type, int seatCapacity) {
                this.type = type;
                this.seatCapacity = seatCapacity;
            }

            @Override
            public String toString() {
                return type + " Bogie (Seats: " + seatCapacity + ")";
            }
        }

        public class TrainConsistManangementApp {

            public static void main(String[] args) {

                System.out.println("=== Train Consist Management App ===");

                // Initialize train consist
                List<PassengerBogie> trainConsist = new ArrayList<>();

                // Initial count
                System.out.println("Initial number of bogies: " + trainConsist.size());

                // ✅ Add passenger bogies
                PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
                PassengerBogie acChair = new PassengerBogie("AC Chair", 60);
                PassengerBogie firstClass = new PassengerBogie("First Class", 40);

                trainConsist.add(sleeper);
                trainConsist.add(acChair);
                trainConsist.add(firstClass);

                System.out.println("\nAfter adding bogies:");
                System.out.println("Total bogies: " + trainConsist.size());

                // Display all bogies
                for (PassengerBogie bogie : trainConsist) {
                    System.out.println(bogie);
                }

                // ✅ Remove a bogie
                trainConsist.remove(acChair);

                System.out.println("\nAfter removing AC Chair bogie:");
                System.out.println("Total bogies: " + trainConsist.size());

                // Display remaining bogies
                for (PassengerBogie bogie : trainConsist) {
                    System.out.println(bogie);
                }

                // ✅ Check if a bogie exists
                if (trainConsist.contains(sleeper)) {
                    System.out.println("\nSleeper bogie is present in the train.");
                }
            }
        }

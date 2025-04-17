package com.pluralsight;

import java.util.Scanner;

public class VehicleInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[20];
        int vehicleCount = 6;

        // Önceden yüklenmiş 6 araç
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500f);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000f);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700f);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500f);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500f);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000f);

        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("6 - Quit");
            System.out.print("Enter your command: ");
            int command = scanner.nextInt();

            if (command == 1) {
                listAllVehicles(vehicles, vehicleCount);
            } else if (command == 6) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option, try again.");
            }
        }

        scanner.close();

    }

    public static void listAllVehicles(Vehicle[] vehicles, int count) {
        System.out.println("\n--- Vehicle Inventory ---");
        for (int i = 0; i < count; i++) {
            System.out.println(vehicles[i].toString());
        }
    }
}

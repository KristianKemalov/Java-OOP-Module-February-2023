package Polymorphism.Vehicles;


import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        LinkedHashMap<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", getVehicle(sc));
        vehicles.put("Truck", getVehicle(sc));
        vehicles.put("Bus", getVehicle(sc));

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");
            String commandName = command[0];
            String vehicleType = command[1];
            double argument = Double.parseDouble(command[2]);

            switch (commandName) {
                case "Drive":
                    System.out.println(vehicles.get(vehicleType).drive(argument));
                    break;
                case "Refuel":
                    try {
                        vehicles.get(vehicleType).refuel(argument);
                    } catch (IllegalArgumentException exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;
                case "DriveEmpty":
                    Bus bus = (Bus) vehicles.get(vehicleType);
                    System.out.println(bus.driveEmpty(argument));


            }

        }
        vehicles.values().forEach(System.out::println);

    }

    private static Vehicle getVehicle(Scanner sc) {
        String[] vehicleData = sc.nextLine().split(" ");
        String vehicleType = vehicleData[0];
        double fuelAmount = Double.parseDouble(vehicleData[1]);
        double fuelConsumption = Double.parseDouble(vehicleData[2]);
        double tankCapacity = Double.parseDouble(vehicleData[3]);

        switch (vehicleType) {
            case "Car":
                return new Car(fuelAmount, fuelConsumption, tankCapacity);
            case "Truck":
                return new Truck(fuelAmount, fuelConsumption, tankCapacity);
            case "Bus":
                return new Bus(fuelAmount, fuelConsumption, tankCapacity);
            default:
                throw new IllegalArgumentException("Missing car");
        }
    }
}
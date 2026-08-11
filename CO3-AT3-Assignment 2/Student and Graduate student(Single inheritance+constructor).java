import java.util.Scanner;

public class Vehicle {
    String brand;
    String model;

    Vehicle() {
        brand = "Unknown";
        model = "Unknown";
    }

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String brand1 = sc.nextLine();
        String model1 = sc.nextLine();

        String brand2 = sc.nextLine();
        String model2 = sc.nextLine();
        double battery = sc.nextDouble();
        double chargingTime = sc.nextDouble();

        Vehicle vehicle1 = new Vehicle();

        Vehicle vehicle2 = new Vehicle(brand1, model1);

        ElectricVehicle electricVehicle = new ElectricVehicle(
            brand2, model2, battery, chargingTime
        );

        System.out.println("Default Vehicle Details");
        vehicle1.displayDetails();

        System.out.println("\nParameterized Vehicle Details");
        vehicle2.displayDetails();

        System.out.println("\nElectric Vehicle Details");
        electricVehicle.displayDetails();

        sc.close();
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class ElectricVehicle extends Vehicle {
    double batteryCapacity;
    double chargingTime;

    ElectricVehicle(String brand, String model,
                    double batteryCapacity, double chargingTime) {

        super(brand, model);

        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}
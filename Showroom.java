import java.util.Scanner;

class Vehicle {
    String brand;
    String model;
    int year;

    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class Showroom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Brand: ");
        String brand = input.nextLine();

        System.out.print("Enter Model: ");
        String model = input.nextLine();

        System.out.print("Enter Year: ");
        int year = input.nextInt();
        input.nextLine(); // Consume leftover newline

        System.out.print("Enter Fuel Type: ");
        String fuelType = input.nextLine();

        Car car = new Car(brand, model, year, fuelType);
        car.displayDetails();

        input.close();
    }
}
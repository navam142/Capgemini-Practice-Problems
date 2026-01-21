package oopsproblems;

// Insurable Interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract Vehicle Class
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters and Setters
    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }

    // Abstract Method
    public abstract double calculateRentalCost(int days);
}

// Car Subclass
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private double insuranceRate = 0.05;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + insurancePolicyNumber + ", Rate: " + (insuranceRate * 100) + "%";
    }

    public void displayDetails() {
        System.out.println("Vehicle Number: " + getVehicleNumber());
        System.out.println("Type: " + getType());
        System.out.println("Rental Rate: " + getRentalRate());
        System.out.println(getInsuranceDetails());
    }
}

// Bike Subclass
class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public void displayDetails() {
        System.out.println("Vehicle Number: " + getVehicleNumber());
        System.out.println("Type: " + getType());
        System.out.println("Rental Rate: " + getRentalRate());
    }
}

// Truck Subclass
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private double insuranceRate = 0.10;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + insurancePolicyNumber + ", Rate: " + (insuranceRate * 100) + "%";
    }

    public void displayDetails() {
        System.out.println("Vehicle Number: " + getVehicleNumber());
        System.out.println("Type: " + getType());
        System.out.println("Rental Rate: " + getRentalRate());
        System.out.println(getInsuranceDetails());
    }
}

// VehicleRentalSystem Class
public class VehicleRentalSystem {
    public static void calculateCosts(Vehicle vehicle, int days) {
        System.out.println("Vehicle Details:");
        if (vehicle instanceof Car) {
            ((Car) vehicle).displayDetails();
        } else if (vehicle instanceof Bike) {
            ((Bike) vehicle).displayDetails();
        } else if (vehicle instanceof Truck) {
            ((Truck) vehicle).displayDetails();
        }
        System.out.println("Rental Cost for " + days + " days: " + vehicle.calculateRentalCost(days));
        if (vehicle instanceof Insurable) {
            System.out.println("Insurance Cost: " + ((Insurable) vehicle).calculateInsurance());
            System.out.println("Insurance Details: " + ((Insurable) vehicle).getInsuranceDetails());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Vehicle car = new Car("KA-01-1234", 2000, "CAR-INS-123");
        Vehicle bike = new Bike("KA-02-5678", 500);
        Vehicle truck = new Truck("KA-03-9012", 5000, "TRK-INS-456");

        calculateCosts(car, 5);
        calculateCosts(bike, 3);
        calculateCosts(truck, 7);
    }
}

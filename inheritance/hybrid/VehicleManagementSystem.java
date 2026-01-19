package inheritance.hybrid;

interface Refuelable {
    void refuel(int litres);
}

class Vehicle {
    protected String model;
    protected int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void showVehicleInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    private int batteryPercentage;

    public ElectricVehicle(String model, int maxSpeed, int batteryPercentage) {
        super(model, maxSpeed);
        this.batteryPercentage = batteryPercentage;
    }

    public void charge(int percent) {
        batteryPercentage += percent;
        if (batteryPercentage > 100) batteryPercentage = 100;

        System.out.println("Charging... Battery is now " + batteryPercentage + "%");
    }

    public void displayType() {
        System.out.println("Vehicle Type: Electric Vehicle");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelLevel; // in litres
    private int tankCapacity;

    public PetrolVehicle(String model, int maxSpeed, int fuelLevel, int tankCapacity) {
        super(model, maxSpeed);
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
    }

    @Override
    public void refuel(int litres) {
        fuelLevel += litres;
        if (fuelLevel > tankCapacity) fuelLevel = tankCapacity;

        System.out.println("Refueling... Fuel is now " + fuelLevel + " litres");
    }

    public void displayType() {
        System.out.println("Vehicle Type: Petrol Vehicle");
    }
}


public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 60);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180, 15, 40);

        ev.displayType();
        ev.showVehicleInfo();
        ev.charge(25);

        System.out.println();

        pv.displayType();
        pv.showVehicleInfo();
        pv.refuel(20);
    }
}

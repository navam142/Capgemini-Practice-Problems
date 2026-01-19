package inheritance.single;

class Device {
    protected String deviceId;
    protected boolean status;

    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status   : " + (status ? "ON" : "OFF"));
    }
}

class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, boolean status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        System.out.println("---- Thermostat Status ----");
        System.out.println("Device ID           : " + deviceId);
        System.out.println("Status              : " + (status ? "ON" : "OFF"));
        System.out.println("Temperature Setting : " + temperatureSetting + "°C");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        Device d1 = new Device("D101", true);
        Thermostat t1 = new Thermostat("T202", true, 24.5);

        System.out.println("---- Generic Device ----");
        d1.displayStatus();

        System.out.println();
        t1.displayStatus();
    }
}

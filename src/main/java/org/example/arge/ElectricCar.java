package org.example.arge;

public class ElectricCar extends CarSkeleton {
    public double avgKmPerCharge;
    public int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public String startEngine() {
        return "Electric Car engine is starting with " + batterySize + " battery size";
    }

    @Override
    public String drive() {
        runEngine();
        return "Electric Car is driving at " + avgKmPerCharge + " km per charge";

    }
}

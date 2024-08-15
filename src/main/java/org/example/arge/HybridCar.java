package org.example.arge;

public class HybridCar extends CarSkeleton {
    public double avgKmPerLiter;
    public int batterySize;
    public int cylinders;

    public HybridCar(String name, String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        return "HybridCar engine is starting with " + cylinders + " cylinders and a battery size of " + batterySize + " kWh";
    }

    @Override
    public String drive() {
        runEngine();
        return "HybridCar is driving at " + avgKmPerLiter + " km per litre and battery capacity of " + batterySize + " kWh";

    }
}

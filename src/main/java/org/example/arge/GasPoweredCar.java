package org.example.arge;

public class GasPoweredCar extends CarSkeleton {

    public double averageKmPerLiter;
    public int cylinders;

    public GasPoweredCar(String name, String description, double averageKmPerLiter, int cylinders) {
        super(name, description);
        this.averageKmPerLiter = averageKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        return "Gas Powered Car engine is starting with" + cylinders + "cylinders";
    }

    @Override
    public String drive() {
        runEngine();
        return "GasPoweredCar is driving at " + averageKmPerLiter + " km per litre";

    }
}


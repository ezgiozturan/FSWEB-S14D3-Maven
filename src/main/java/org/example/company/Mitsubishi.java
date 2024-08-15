package org.example.company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine () {
        return "Mitsubishi"+ getName() + " engine is starting";
    }
    public String accelerate() {
        return "Mitsubishi"+ getName()+ " is accelerating";
    }

    public String brake() {
        return "Mitsubishi"+getName() + " is braking";
    }
}

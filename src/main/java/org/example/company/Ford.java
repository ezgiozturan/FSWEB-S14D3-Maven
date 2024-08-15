package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine () {
        return "Ford"+ getName() + " engine is starting";
    }
    public String accelerate() {
        return "Ford"+ getName()+ " is accelerating";
    }

    public String brake() {
        return "Ford"+getName() + " is braking";
    }
}

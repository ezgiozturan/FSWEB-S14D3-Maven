package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine () {
        return "Holden"+ getName() + " engine is starting";
    }
    public String accelerate() {
        return "Holden"+ getName()+ " is accelerating";
    }

    public String brake() {
        return "Holden"+getName() + " is braking";
    }
}


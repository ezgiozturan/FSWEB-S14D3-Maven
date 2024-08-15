package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car( int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    public String startEngine(){
        String message = getClass().getSimpleName() + "'s engine is starting";
        System.out.println(message);
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName() + " is accelerating");
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println(getClass().getSimpleName() + " is braking");
        return "the car is braking" ;
    }
}

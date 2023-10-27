package Abstraction;

public abstract class Vehicle {

    private String vehicleName = "vehicle";

    Vehicle(String name) {
        this.vehicleName = name;
    }

    public void getName() {
        System.out.println(this.vehicleName);
    }

    abstract String speed();
}

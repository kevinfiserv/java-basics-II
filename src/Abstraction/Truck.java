package Abstraction;

public final class Truck extends Vehicle {
    public Truck(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    String speed() {
        return "The Truck goes 65 MPH";
    }

}

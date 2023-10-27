package Abstraction;

public final class Car extends Vehicle {

    public Car(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    String speed() {
        return "The car goes 65 MPH";
    }

}
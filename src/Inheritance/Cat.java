package Inheritance;

import java.util.Objects;

public class Cat {

    // Data...
    private String name;

    // Constructors...
    public Cat() {
        this.name = "Bob";
    }
    public Cat(String name) {
        this.name = name;
    }

    // Methods...
    public String getName() {
        return name;
    }

    // Overrides...
    @Override
    public String toString() {
        return "This is: " + name;
    }

}
package Composition;

import java.util.ArrayList;

import Abstraction.Billable;

public class Table implements Billable {

    private Integer width = 20;
    private Integer length = 10;
    private Integer legLength = 25;
    private ArrayList<Leg> legs = new ArrayList<>();

    public Table(Integer numLegs, int legLength, int width, int length) {
        this.width = width;
        this.length = length;
        this.legLength = legLength;
        for (int i = 0; i < numLegs; i++) {
            legs.add(new Leg(this.legLength));
        }
    }

    public Table(Integer numLegs) {

        for (int i = 0; i < numLegs; i++) {
            legs.add(new Leg(25));
        }
    }

    public void getTableValues() {
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("LegLength: " + legLength);
    }

    public Float getPrice() {
        return (float) (1.0 * this.length * this.width);
    }
}
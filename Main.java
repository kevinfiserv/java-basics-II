
import java.util.ArrayList;

import Abstraction.*;
import Composition.Table;
import Ecapsulation.*;
import Inheritance.Cat;
import Polymorphism.Athlete;
import Polymorphism.Basketball;
import Polymorphism.Football;
import Polymorphism.Soccer;

public class Main {
    public static void main(String[] args) {
        var myCat = new Cat("Gypsy");
        System.out.println(myCat.toString());

        var myDog = new Cat("Motas");
        System.out.println(myDog.toString());

        var myTable = new Table(4);
        myTable.getTableValues();
        System.out.println(myTable.getPrice());
        System.out.println();
        var mySpecialTable = new Table(4, 55, 33, 33);
        mySpecialTable.getTableValues();

        Vehicle myCar = new Car("Acura");
        Vehicle myTruck = new Truck("John Deere");
        myCar.getName();
        myTruck.getName();

        Employee kevin = new Employee("Kevin", "Ramos", (byte) 22, 1234);
        kevin.setSalary(80000.00);
        kevin.speak();

        var athletes = new ArrayList<Athlete>();
        var soccer = new Soccer();
        var football = new Football();
        var baskteball = new Basketball();

        athletes.add(soccer);
        athletes.add(football);
        athletes.add(baskteball);

        for (Athlete athlete : athletes) {
            System.out.println(athlete.name());
        }

    }
}

package Ecapsulation;

public class Employee extends Person {

    private double salary = 0;

    public Employee(String firstName, String lastName, Byte age, Integer ssn) {
        super(firstName, lastName, age, ssn);
        // TODO Auto-generated constructor stub
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void speak() {
        System.out.println(this.getFirstName() + " " + this.getLastName() + " Salary: " + this.salary);
    }

}

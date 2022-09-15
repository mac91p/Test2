package pl.test.zad3.model;

import pl.test.zad3.model.Person;

public class Student extends Person {

    private int group;
    private double scholarship;


    public Student(String firstName, String lastName, String pesel, String city, int group, double scholarship) {
        super(firstName, lastName, pesel, city);
        this.group = group;
        this.scholarship = scholarship;
    }

    @Override
    public double getIncome() {
        return scholarship;
    }

}

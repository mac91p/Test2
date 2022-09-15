package pl.test.zad3.model;

public abstract class Person {

    private String firstName;
    private String lastName;
    private String pesel;
    private String city;

    public Person(String firstName, String lastName, String pesel, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.city = city;
    }

    public abstract double getIncome();

    public String getSex() {
        String sex;
        int i = Character.getNumericValue(pesel.toCharArray()[10]);
        if (i % 2 == 0)
            sex = "Female";
        else {
            sex = "Male";
        }
        return sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

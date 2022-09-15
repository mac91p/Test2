package pl.test.zad3.app;

import pl.test.zad3.service.PersonService;
import pl.test.zad3.model.Employee;
import pl.test.zad3.model.Person;
import pl.test.zad3.model.Student;

public class Runner {
    public static void main(String[] args) {


        Student student1 = new Student("Janek", "Dzbanek", "98100809319", "Koziegłpwy", 3, 1150);
        Student student2 = new Student("Ula", "Cebula", "96050809389", "Kije", 2, 1000);
        Student student3 = new Student("Adrian", "Puchacki", "95050109136", "Warszawa", 1, 950);

        Employee employee1 = new Employee("Jacek", "Placek", "80050109335", "Kielce", "Plumber", 5000);
        Employee employee2 = new Employee("Radosław", "Rumian", "97020308723", "Kraków", "IT support", 4000);
        Employee employee3 = new Employee("Janina", "Słonina", "72020088882", "Kraków", "Project Manager", 14000);

        Person[] people = {student1, student2, student3, employee1, employee2, null};

        PersonService personService = new PersonService();

        System.out.println("personService.countFemales(people) = " + personService.countFemales(people));
        System.out.println("personService.getMaxIncome(people) = " + personService.getMaxIncome(people));
    }
}

package pl.test.zad3.service;

import pl.test.zad3.model.Person;

public class PersonService {


    public int countFemales(Person[] people) {
        if (people == null)
            throw new IllegalArgumentException("No array has been choosen");
        int cnt = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i] != null && people[i].getSex().equals("Female"))
                ++cnt;
        }
        return cnt;
    }

    public Person getMaxIncome(Person[] people) {
        if (people == null)
            throw new IllegalArgumentException("No array has been choosen");
        Person maxIncome = people[0];
        for (int i = 0; i < people.length; i++) {
            if (people[i] != null && people[i].getIncome() > maxIncome.getIncome())
                maxIncome = people[i];
        }
        return maxIncome;
    }


}

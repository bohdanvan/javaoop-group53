package com.bvan.oop.lessons1_2.person.oop;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class People {

    private final ArrayList<Person> people = new ArrayList<>();

    public void add(Person person) {
        people.add(person);
    }

    public int agesSum() {
        int sum = 0;
        for (Person person : people) {
            sum += person.getAge();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        for (Person person : people) {
            joiner.add(person.toString());
        }
        return "People:\n" + joiner.toString();
    }
}

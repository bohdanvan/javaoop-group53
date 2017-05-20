package com.bvan.oop.lessons1_2.person.oop;

/**
 * @author bvanchuhov
 */
public class PersonRunner {

    public static void main(String[] args) {
        Person person = new Person("Bob", 10);

        String message = person.sayHello();
        System.out.println(message);

        System.out.println(person.toString());
    }
}

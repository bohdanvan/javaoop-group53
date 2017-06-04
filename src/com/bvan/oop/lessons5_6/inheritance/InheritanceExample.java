package com.bvan.oop.lessons5_6.inheritance;

/**
 * @author bvanchuhov
 */
public class InheritanceExample {

    public static void main(String[] args) {
        Person person = new Developer("John", "Google");
        person.sayHello();

        // BAD STYLE
        if (person instanceof Developer) {
            Developer developer = (Developer) person;
            developer.writeCode();
        }
    }
}



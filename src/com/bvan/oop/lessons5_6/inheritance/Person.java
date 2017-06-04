package com.bvan.oop.lessons5_6.inheritance;

/**
 * @author bvanchuhov
 */
public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("I'm " + name);
    }

    protected String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

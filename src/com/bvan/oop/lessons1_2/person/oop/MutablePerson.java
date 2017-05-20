package com.bvan.oop.lessons1_2.person.oop;

/**
 * @author bvanchuhov
 */
public class MutablePerson {

    private String name; // field
    private int age;

    // constructor
    public MutablePerson(String name, int age) {
        checkAge(age);

        this.name = name;
        this.age = age;
    }

    public MutablePerson(String name) {
        this(name, 0);
    }

    public String sayHello() {
        return "Hello, I'm " + name + ", " + age + " years old";
    }

    public String getName() { // getter
        return name;
    }

    public void setName(String name) { // setter
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        checkAge(age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void checkAge(int age) {
        if (!isAge(age)) {
            throw new IllegalArgumentException("illegal age: " + age);
        }
    }

    private boolean isAge(int age) {
        return age >= 1 && age <= 120;
    }
}

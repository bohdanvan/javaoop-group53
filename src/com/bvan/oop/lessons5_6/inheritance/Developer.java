package com.bvan.oop.lessons5_6.inheritance;

/**
 * @author bvanchuhov
 */
public class Developer extends Person {

    private final String company;

    public Developer(String name, String company) {
        super(name);
        this.company = company;
    }

    @Override
    public void sayHello() {
        System.out.println("I'm cool " + getName() + ". " + "I work in " + company);
        writeCode();
        super.sayHello();
    }

    public void writeCode() {
        System.out.println("I'm coding very hard");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}

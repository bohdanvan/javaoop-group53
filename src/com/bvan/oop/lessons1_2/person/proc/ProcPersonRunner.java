package com.bvan.oop.lessons1_2.person.proc;

/**
 * @author bvanchuhov
 */
public class ProcPersonRunner {

    public static void main(String[] args) {
        ProcPerson p = new ProcPerson();
        p.name = "John";
        p.age = 25;

        String message = ProcPersonRunner.getPersonInfo(p);

        System.out.println(message);
    }

    private static String getPersonInfo(ProcPerson person) {
        return "Hello, I'm " + person.name +
                ", " + person.age + " years old";
    }
}

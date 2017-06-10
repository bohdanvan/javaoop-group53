package com.bvan.oop.lessons7_8.generic.swapper;

import com.bvan.oop.common.Person;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class SwapperRunner {

    public static void main(String[] args) {
        Person[] people = {
                new Person("John", 25),
                new Person("Bob", 30)
        };
        System.out.println(Arrays.toString(people));

        Swapper.swapGenerics(people, 0, 1);
        System.out.println(Arrays.toString(people));
    }
}

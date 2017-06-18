package com.bvan.oop.lessons9_10.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class SetExample {

    public static void main(String[] args) {
        Set<String> friends = new LinkedHashSet<>();

        friends.add("Jesse");
        friends.add("John");
        friends.add("Phil");
        friends.add("Andy");
        friends.add("John");
        friends.add("Jesse");
        friends.add("Andy");
        friends.add("Andy");
        friends.add("Bob");
        friends.add("John");
        friends.add("Jesse");

        System.out.println(friends);
    }
}

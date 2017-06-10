package com.bvan.oop.lessons7_8.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class OldCollectionsExample {

    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("John");
        names.add("Bob");

        names.add(1);
    }
}

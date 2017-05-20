package com.bvan.oop.lessons1_2;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }

        System.out.println(list);
    }
}

package com.bvan.oop.lessons1_2.dynamic_array.oop;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    private int[] elems;
    private int size = 0;


    public DynamicArray(int initialCapacity) {
        this.elems = new int[initialCapacity];
    }

    public DynamicArray() {
        this(10);
    }

    public void addLast(int n) {
        if (size == elems.length) {
            elems = Arrays.copyOf(elems, elems.length * 2);
        }
        elems[size++] = n;
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            joiner.add(String.valueOf(elems[i]));
        }
        return joiner.toString();
    }
}

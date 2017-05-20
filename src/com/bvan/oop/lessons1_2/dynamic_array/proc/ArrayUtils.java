package com.bvan.oop.lessons1_2.dynamic_array.proc;

/**
 * @author bvanchuhov
 */
public class ArrayUtils {

    private ArrayUtils() {}

    public static int sum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }
}

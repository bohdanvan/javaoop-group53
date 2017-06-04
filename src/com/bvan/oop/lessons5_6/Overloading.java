package com.bvan.oop.lessons5_6;

/**
 * @author bvanchuhov
 */
public class Overloading {

    public static void main(String[] args) {
        int sum = sum(10, 20, 40, 1000);
        System.out.println(sum);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int... array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }
}

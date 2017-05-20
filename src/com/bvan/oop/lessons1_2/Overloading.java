package com.bvan.oop.lessons1_2;

/**
 * @author bvanchuhov
 */
public class Overloading {

    public static void main(String[] args) {
        int sum1 = sum(10, 20);
        double sum2 = sum(10.0, 20);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static String sum(String a, String b) {
        return a + b;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }
}

package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class Bar {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            Runnable runnable = new Drinker();

            Thread thread = new Thread(runnable);
            thread.start();
        }

        System.out.println("Bar is closed");
    }
}


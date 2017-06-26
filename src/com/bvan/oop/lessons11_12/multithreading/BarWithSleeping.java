package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class BarWithSleeping {

    public static void main(String[] args) {
        new Thread(new Drinker()).start();
    }
}

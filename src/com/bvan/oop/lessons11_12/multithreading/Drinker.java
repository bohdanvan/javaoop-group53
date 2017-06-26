package com.bvan.oop.lessons11_12.multithreading;

public class Drinker implements Runnable {

    private static int nextId = 1;

    private final int id = nextId++;

    @Override
    public void run() {
        for (int beer = 1; beer <= 5; beer++) {
            ThreadUtils.println(drinkerInfo() + "I'm drinking " + beer + " beer");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private String drinkerInfo() {
        return "I'm " + id + " drinker. ";
    }
}

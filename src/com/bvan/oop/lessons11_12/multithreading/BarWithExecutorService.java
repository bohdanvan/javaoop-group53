package com.bvan.oop.lessons11_12.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author bvanchuhov
 */
public class BarWithExecutorService {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int drinker = 1; drinker <= 5; drinker++) {
            executorService.execute(new Drinker());
        }
        executorService.shutdown();

        ThreadUtils.println("Goodbye");
    }
}

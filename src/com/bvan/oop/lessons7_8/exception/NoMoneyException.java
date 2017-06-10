package com.bvan.oop.lessons7_8.exception;

/**
 * @author bvanchuhov
 */
public class NoMoneyException extends RuntimeException {

    public NoMoneyException(String message) {
        super(message);
    }

    public NoMoneyException(long money) {
        this("Money is " + money);
    }
}

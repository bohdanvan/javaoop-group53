package com.bvan.oop.lessons7_8.exception;

import java.io.IOException;

/**
 * @author bvanchuhov
 */
public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("Hello");

        try {
            bar();
            System.out.println("After foo");
        } catch (Exception e) {

        } finally {

        }

        System.out.println("Bye");
    }

    public static void fooWithCheckedException() throws IOException {
        System.out.println("fooWithCheckedException");
        throw new IOException();
    }



    public static void bar() throws IOException {
        System.out.println("bar: begin");
        fooWithCheckedException();
        System.out.println("bar: end");
    }

    /**
     * @throws IllegalArgumentException
     */
    public static void fooWithUncheckedException() {
        System.out.println("fooWithUncheckedException");
        throw new IllegalArgumentException("some problem in foo");
    }

    /**
     * @throws NoMoneyException
     */
    public static void pay() {

    }
}

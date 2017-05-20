package com.bvan.oop.lessons1_2.dynamic_array.proc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ProcDynamicArrayApp {

    public static void main(String[] args) {
        startApp();
    }

    private static void startApp() {
        int[] elems = readClientElemsFromConsole();

        System.out.println(Arrays.toString(elems));
        System.out.println("sum = " + ArrayUtils.sum(elems));
        System.out.println("Goodbye");
    }

    private static int[] readClientElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        int[] elems = new int[10];
        int size = 0;

        int n = readInt(scanner);
        while (n != 0) {
            // add last
            if (size == elems.length) {
                elems = Arrays.copyOf(elems, elems.length * 2);
            }
            elems[size++] = n;

            n = readInt(scanner);
        }
        return Arrays.copyOf(elems, size);
    }

    private static int readInt(Scanner scanner) {
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // idle

            System.out.println("Sorry, illegal number");
            System.out.print(">> ");
        }
        return scanner.nextInt();
    }

    private static int[] addLast(int[] elems, int n) {
        int[] newElems = Arrays.copyOf(elems, elems.length + 1);
        newElems[newElems.length - 1] = n;
        elems = newElems;
        return elems;
    }
}

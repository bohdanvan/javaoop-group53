package com.bvan.oop.lessons1_2.dynamic_array.oop;

/**
 * @author bvanchuhov
 */
public class OOPDynamicArrayApp {

    public static void main(String[] args) {
        startApp();
    }

    private static void startApp() {
        DynamicArray elems = readClientElemsFromConsole();

        System.out.println(elems.toString());
        System.out.println("Goodbye");
    }

    private static DynamicArray readClientElemsFromConsole() {
        ConsoleReader consoleReader = new ConsoleReader();

        DynamicArray elems = new DynamicArray();

        int n = consoleReader.readInt();
        while (n != 0) {
            elems.addLast(n);

            n = consoleReader.readInt();
        }
        return elems;
    }
}

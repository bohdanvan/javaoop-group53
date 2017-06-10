package com.bvan.oop.lessons7_8.generic.format;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Printer<T> {

    private final List<T> products = new ArrayList<>();

    public void add(T product) {
        products.add(product);
    }

    public void print(Formatter formatter) {
        for (T product : products) {
            String s = formatter.format(product);
            System.out.println(s);
        }
    }
}

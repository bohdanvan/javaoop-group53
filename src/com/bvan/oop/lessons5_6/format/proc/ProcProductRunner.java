package com.bvan.oop.lessons5_6.format.proc;

import com.bvan.oop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public class ProcProductRunner {

    public static void main(String[] args) {
        ProcProducts products = new ProcProducts();
        products.add(new Product("MacBook", 2000));
        products.add(new Product("Lenovo", 1500));

        products.print("name");
        System.out.println();

        products.print("JSON");
        System.out.println();

        products.print("CSV");
        System.out.println();
    }
}

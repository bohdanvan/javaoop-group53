package com.bvan.oop.lessons7_8.generic.format;

/**
 * @author bvanchuhov
 */
public class ProductRunner {

    public static void main(String[] args) {
        Printer<Product> products = new Printer<>();
        products.add(new Product("iPhone", 1500));
        products.add(new Product("Lenovo Notebook", 1000));

        products.print(new NameFormatter());
        System.out.println();
        products.print(new ToStringFormatter<Product>());
    }
}

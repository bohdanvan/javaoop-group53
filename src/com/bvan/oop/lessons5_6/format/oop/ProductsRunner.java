package com.bvan.oop.lessons5_6.format.oop;

import com.bvan.oop.lessons5_6.format.Product;
import com.bvan.oop.lessons5_6.format.proc.ProcProducts;

/**
 * @author bvanchuhov
 */
public class ProductsRunner {

    public static void main(String[] args) {
        Products products = new Products();
        products.add(new Product("MacBook", 2000));
        products.add(new Product("Lenovo", 1500));

        products.print(new CsvFormatter());
        System.out.println();

        products.print(new NameFormatter());
        System.out.println();

        products.print(new Formatter() {
            @Override
            public String format(Product product) {
                return String.valueOf(product.getPrice());
            }
        });
    }
}

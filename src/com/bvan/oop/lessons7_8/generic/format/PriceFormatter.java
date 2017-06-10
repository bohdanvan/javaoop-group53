package com.bvan.oop.lessons7_8.generic.format;

/**
 * @author bvanchuhov
 */
public class PriceFormatter implements Formatter<Product> {

    @Override
    public String format(Product elem) {
        return String.valueOf(elem.getPrice());
    }
}

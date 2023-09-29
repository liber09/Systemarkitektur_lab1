package org.example;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        Product tempProduct;
        products.add(new Product("milk",15,5));
        products.add(new Product("butter",25,2));
        products.add(new Product("bread",23,3));
        products.add(new Product("yoghurt",24,2));
        products.add(new Product("cheese",150,1));
    }
}

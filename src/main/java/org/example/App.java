package org.example;

import org.example.discounts.CustomDiscount;
import org.example.interfaces.Discount;
import org.example.discounts.FridayDiscount;
import org.example.discounts.MilkDiscount;
import org.example.discounts.QuantityDiscount;
import org.example.product.Product;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Product> products = createProducts();
        Discount fridayDiscount = new FridayDiscount(null);
        Discount milkDiscount = new MilkDiscount(fridayDiscount);
        Discount quantityDiscount = new QuantityDiscount(milkDiscount);

        Discount customDiscount = new CustomDiscount(quantityDiscount,"10% off on cheese",
                product -> product.name().equalsIgnoreCase("CHEESE"),
                product -> product.price()*0.1);

        printResult(products, customDiscount);
    }

    private static ArrayList<Product> createProducts(){
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("milk",15,5));
        products.add(new Product("butter",25,2));
        products.add(new Product("bread",23,3));
        products.add(new Product("yoghurt",24,10));
        products.add(new Product("cheese",150,1));
        return products;
    }

    private static void printResult(ArrayList<Product> products, Discount discount) {
        double totalDiscount = 0;
        System.out.println("PRODUCT INFO\n--------------");
        for (Product product : products) {
            totalDiscount = discount.apply(product);
            System.out.println("Product name: " + product.name() +"\n" +
                    "Product price: " + product.price());
            if (totalDiscount != 0.0){
                System.out.println("Total discount: " + totalDiscount);
                System.out.println("Product price after discounts: " + (product.price() - totalDiscount));
                System.out.println("Applied discounts: " + discount.getDescription(product) + "\n");
            }else{
                System.out.println("Applied discounts: " + discount.getDescription(product)+ "\n");
            }
        }

    }
}

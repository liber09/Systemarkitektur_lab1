package org.example.discounts;

import org.example.product.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiscountTests {

    Product wine = new Product("Wine",120,2);
    Product cheese = new Product("cheese",90,5);
    Product water = new Product("water",12,4);

    CustomDiscount wineDiscount = new CustomDiscount(null,
            "wine is too expensive, 50% off",
            product -> product.name().equalsIgnoreCase("wine"),
            product -> product.price() * 0.5);

    CustomDiscount cheeseDiscount = new CustomDiscount(null,
            "10% off on cheese",
            product -> product.name().equalsIgnoreCase("Cheese"),
            product -> product.price() * 0.1);

    CustomDiscount waterDiscount = new CustomDiscount(null,
            "20% off on water",
            product -> product.name().equalsIgnoreCase("Water"),
            product -> product.price() * 0.2);

    @Test
    void isApplicable(){
        assertTrue(wineDiscount.isApplicable(wine));
        assertFalse(wineDiscount.isApplicable(water));
        assertEquals(60, wineDiscount.apply(wine));
    }

    @Test
    void calculateDiscount(){
        assertTrue(cheeseDiscount.isApplicable(cheese));
        assertEquals(9.0,cheeseDiscount.calculateDiscount(cheese));
    }

}

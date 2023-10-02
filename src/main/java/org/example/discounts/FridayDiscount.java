package org.example.discounts;

import org.example.product.Product;

import java.time.LocalDate;

public class FridayDiscount extends BaseDiscount{
    public FridayDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public boolean isApplicable(Product product) {
        return LocalDate.now().getDayOfWeek().getValue() == 5;
    }

    @Override
    public double calculateDiscount(Product product) {
        double discountPercent = 0.1;
        return product.price() * discountPercent;
    }
}

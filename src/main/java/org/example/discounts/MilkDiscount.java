package org.example.discounts;

import org.example.interfaces.Discount;
import org.example.product.Product;

public class MilkDiscount extends BaseDiscount{
    public MilkDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return product.name().equalsIgnoreCase("milk");
    }

    @Override
    protected double calculateDiscount(Product product) {
        double milkDiscount = 0.05;
        return product.price() * milkDiscount;
    }
}

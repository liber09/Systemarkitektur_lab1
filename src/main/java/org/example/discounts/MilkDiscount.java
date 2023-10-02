package org.example.discounts;

import org.example.product.Product;

public class MilkDiscount extends BaseDiscount{
    public MilkDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public boolean isApplicable(Product product) {
        return product.name().equalsIgnoreCase("milk");
    }

    @Override
    public double calculateDiscount(Product product) {

        return 0;
    }
}

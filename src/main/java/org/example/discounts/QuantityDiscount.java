package org.example.discounts;

import org.example.product.Product;

public class QuantityDiscount extends BaseDiscount{
    private final int count = 5;

    public QuantityDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return product.count() >= count;
    }

    @Override
    protected double calculateDiscount(Product product) {
        if (product.count() >= count) {
            double discountPercent = 0.1;
            return product.price()* discountPercent;
        }
        return 0;
    }
}

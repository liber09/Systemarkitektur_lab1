package org.example.discounts;

import org.example.product.Product;

public class QuantityDiscount extends BaseDiscount{
    public QuantityDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public boolean isApplicable(Product product) {
        return product.count() > 4;
    }

    @Override
    public double calculateDiscount(Product product) {
        return 0;
    }
}

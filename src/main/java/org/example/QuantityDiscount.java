package org.example;

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

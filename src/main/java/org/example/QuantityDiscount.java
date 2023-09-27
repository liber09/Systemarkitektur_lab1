package org.example;

public class QuantityDiscount extends BaseDiscount{
    public QuantityDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    public boolean isApplicable(Product product) {
        return false;
    }

    @Override
    public double calculateDiscount(Product product) {
        return 0;
    }
}

package org.example;

public class FridayDiscount extends BaseDiscount{
    public FridayDiscount(Discount nextDiscount) {
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

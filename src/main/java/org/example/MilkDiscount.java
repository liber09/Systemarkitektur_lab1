package org.example;

public class MilkDiscount extends BaseDiscount{
    public MilkDiscount(Discount nextDiscount) {
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

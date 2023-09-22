package org.example;

public abstract class BaseDiscount implements Discount{

    private Discount nextDiscount;
    @Override
    public void apply(Product product) {

    }

    @Override
    public String getDescription(Product product) {
        return null;
    }

    public abstract boolean isApplicable(Product product);

    public abstract double calculateDiscount(Product product);
}

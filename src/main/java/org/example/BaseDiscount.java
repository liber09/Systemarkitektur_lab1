package org.example;

public abstract class BaseDiscount implements Discount{

    public BaseDiscount(Discount nextDiscount){
    }
    @Override
    public void apply(Product product, String additionalInfo) {

    }

    @Override
    public String getDescription(Product product) {
        return null;
    }

    public abstract boolean isApplicable(Product product);

    public abstract double calculateDiscount(Product product);
}

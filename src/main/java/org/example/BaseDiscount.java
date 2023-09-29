package org.example;

public abstract class BaseDiscount implements Discount{

    public BaseDiscount(Discount nextDiscount){
    }
    @Override
    public void apply(Product product, String additionalInfo) {
        if (isApplicable(product)){
            calculateDiscount(product);
        };
    }

    @Override
    public String getDescription(Product product) {

        return product.name() + " gets a discount of " + calculateDiscount(product);
    }

    public abstract boolean isApplicable(Product product);

    public abstract double calculateDiscount(Product product);
}

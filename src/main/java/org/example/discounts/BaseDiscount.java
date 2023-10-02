package org.example.discounts;

import org.example.product.Product;

import java.util.ArrayList;

public abstract class BaseDiscount implements Discount{

    protected final Discount nextDiscount;

    protected abstract boolean isApplicable(Product product);

    protected abstract double calculateDiscount(Product product);

    public BaseDiscount(Discount nextDiscount){
        this.nextDiscount = nextDiscount;
    }

    @Override
    public String getDescription(Product product) {
        ArrayList<String> discounts = new ArrayList<>();
        String discountString = "";
        if (isApplicable(product)){
            discounts.add(this.getClass().getSimpleName());
        }
        if (nextDiscount != null){
            discounts.add(nextDiscount.getDescription(product));
        }
        if (discounts.isEmpty()){
            return "There are no discounts on these products";
        }else{
            for(int i=0; i<discounts.size(); i++){
                discountString = String.join(", ", discounts);
            }
        }
        return discountString;
    }

    @Override
    public double apply(Product product) {
        double discount = isApplicable(product) ? calculateDiscount(product) : 0.0;
        if (nextDiscount != null){
            discount += nextDiscount.apply(product);
        };
        return discount;
    }
}

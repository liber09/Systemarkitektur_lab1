package org.example.discounts;

import org.example.interfaces.CalculateDiscount;
import org.example.interfaces.Discount;
import org.example.interfaces.IsApplicable;
import org.example.product.Product;

public class CustomDiscount extends BaseDiscount {
    private final IsApplicable isApplicable;
    private final CalculateDiscount calculateDiscount;
    public CustomDiscount(Discount nextDiscount, String _description,
                          IsApplicable _isApplicable,
                          CalculateDiscount _calculateDiscount) {
        super(nextDiscount);
        this.isApplicable = _isApplicable;
        this.calculateDiscount = _calculateDiscount;
        this.descripion = _description;
    }

    @Override
    protected boolean isApplicable(Product product) {
        return isApplicable.isApplicable(product);
    }

    @Override
    protected double calculateDiscount(Product product) {
        return calculateDiscount.calculateDiscount(product);
    }
}

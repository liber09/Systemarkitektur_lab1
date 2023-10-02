package org.example.discounts;

import org.example.product.Product;

public interface Discount {
    double apply(Product product);

    String getDescription(Product product);
}

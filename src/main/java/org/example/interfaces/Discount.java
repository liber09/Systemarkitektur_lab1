package org.example.interfaces;

import org.example.product.Product;

public interface Discount {
    double apply(Product product);

    String getDescription(Product product);
}

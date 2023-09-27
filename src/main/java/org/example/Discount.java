package org.example;

public interface Discount {
    void apply(Product product, String additionalInfo);

    String getDescription(Product product);
}

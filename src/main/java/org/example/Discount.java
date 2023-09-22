package org.example;

public interface Discount {
    public void apply(Product product);
    public String getDescription(Product product);
}

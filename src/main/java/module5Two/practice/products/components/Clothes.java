package module5Two.practice.products.components;

import module5Two.practice.products.Product;

public class Clothes extends Product {
    public Clothes(long id, String name, int quantity, String description, double price) {
        super(id, name, quantity, description, price);
    }
    Brand b = new Brand();
}

package module5Two.practice.components;

import module5Two.practice.Product;

public class Clothes extends Product {
    public Clothes(long id, String name, int quantity, String description, double price) {
        super(id, name, quantity, description, price);
    }
    Brand b = new Brand();
}

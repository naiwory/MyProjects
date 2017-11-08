package module5Two.practice.products.components;

import module5Two.practice.products.TechProduct;
import module5Two.practice.products.components.techSpecifications.TechSpecComp;

public class Computer extends TechProduct {
    public Computer(long id, String name, int quantity, String description, double price, int garanteeLength) {
        super(id, name, quantity, description, price, garanteeLength);
    }
    TechSpecComp tsc = new TechSpecComp();
}

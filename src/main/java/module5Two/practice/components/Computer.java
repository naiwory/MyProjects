package module5Two.practice.components;

import module5Two.practice.TechProduct;
import module5Two.practice.components.techSpecifications.TechSpecComp;

public class Computer extends TechProduct {
    public Computer(long id, String name, int quantity, String description, double price, int garanteeLength) {
        super(id, name, quantity, description, price, garanteeLength);
    }
    TechSpecComp tsc = new TechSpecComp();
}

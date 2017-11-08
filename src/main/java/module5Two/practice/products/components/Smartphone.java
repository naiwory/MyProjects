package module5Two.practice.products.components;

import module5Two.practice.products.TechProduct;
import module5Two.practice.products.components.techSpecifications.TechSpecSm;

public class Smartphone extends TechProduct {

    public Smartphone(long id, String name, int quantity, String description, double price, int garanteeLength) {
        super(id, name, quantity, description, price, garanteeLength);
    }

    TechSpecSm tss = new TechSpecSm();
}

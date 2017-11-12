package module5Two.practice.components;

import module5Two.practice.TechProduct;
import module5Two.practice.components.techSpecifications.TechSpecSm;

public class Smartphone extends TechProduct {

    public Smartphone(long id, String name, int quantity, String description, double price, int garanteeLength) {
        super(id, name, quantity, description, price, garanteeLength);
    }

    TechSpecSm tss = new TechSpecSm();
}

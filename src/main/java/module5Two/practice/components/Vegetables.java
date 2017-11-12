package module5Two.practice.components;

import module5Two.practice.NutritionProduct;

public class Vegetables extends NutritionProduct {
    protected String sort;

    public Vegetables(long id, String name, int quantity, String description, double price) {
        super(id, name, quantity, description, price);
    }
}

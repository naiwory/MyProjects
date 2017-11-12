package module5Two.practice;

import module5Two.practice.components.ExpirationDate;

public abstract class NutritionProduct extends Product {
    public NutritionProduct(long id, String name, int quantity, String description, double price) {
        super(id, name, quantity, description, price);
    }

    ExpirationDate ed = new ExpirationDate();
}

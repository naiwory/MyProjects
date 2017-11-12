package module5Two.practice;

public abstract class TechProduct extends Product {
    protected int garanteeLength;

    public TechProduct(long id, String name, int quantity, String description, double price, int garanteeLength) {
        super(id, name, quantity, description, price);
        this.garanteeLength = garanteeLength;
    }

}

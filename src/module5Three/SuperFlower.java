package module5Three;

public abstract class SuperFlower {
    protected double price;

    public SuperFlower(){

    }

    public SuperFlower(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

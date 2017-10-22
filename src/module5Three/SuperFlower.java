package module5Three;

public abstract class SuperFlower {
    protected int price;

    public SuperFlower(){

    }

    public SuperFlower(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

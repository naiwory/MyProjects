package module7.homework;

public class Fruit {

    private FruitType fruit;
    private int shelfLife;
    private String dateOfIncome;
    private double price;

    public Fruit(){
        fruit = FruitType.apple;
        shelfLife = 10;
        dateOfIncome = "unknown";
        price = 15;
    }

    public Fruit(FruitType fruit, int shelfLife, String dateOfIncome, double price) {
        this.fruit = fruit;
        this.shelfLife = shelfLife;
        this.dateOfIncome = dateOfIncome;
        this.price = price;
    }

    public enum FruitType {
        apple, strawberry, lemon, peach, orange, banana, watermelon, blueberry, cloudberry
    }

    public FruitType getFruit() {
        return fruit;
    }

    public void setFruit(FruitType fruit) {
        this.fruit = fruit;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getDateOfIncome() {
        return dateOfIncome;
    }

    public void setDateOfIncome(String dateOfIncome) {
        this.dateOfIncome = dateOfIncome;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

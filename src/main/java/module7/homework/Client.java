package module7.homework;

public class Client {

    private String name;
    private Fruit.FruitType fruit;
    private int count;

    public Client(){
        name = "unknown";
        fruit = Fruit.FruitType.apple;
        count = 1;
    }

    public Client(String name, Fruit.FruitType fruit, int count) {
        this.name = name;
        this.fruit = fruit;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fruit.FruitType getFruit() {
        return fruit;
    }

    public void setFruit(Fruit.FruitType fruit) {
        this.fruit = fruit;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

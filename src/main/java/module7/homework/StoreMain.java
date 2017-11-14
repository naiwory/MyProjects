package module7.homework;

import java.util.ArrayList;
import java.util.Date;

public class StoreMain {
    public static void main(String[] args) throws Exception{
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit(Fruit.FruitType.strawberry, 5, "13.11.2017", 25.5));
        fruits.add(new Fruit(Fruit.FruitType.lemon, 10, "13.11.2017", 12.3));
        fruits.add(new Fruit(Fruit.FruitType.peach, 8, "13.11.2017", 43.9));
        fruits.add(new Fruit(Fruit.FruitType.cloudberry, 13, "13.11.2017", 34.7));
        fruits.add(new Fruit(Fruit.FruitType.watermelon, 7, "13.11.2017", 5.6));

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Client("Vanessa", Fruit.FruitType.apple, 46));
        clients.add(new Client("Sandy", Fruit.FruitType.blueberry, 509));
        clients.add(new Client("Cathy", Fruit.FruitType.orange, 78));

        FruitStore fs = new FruitStore(0, fruits, clients);

        fs.save("files/homework7/supply.txt");

        fs.addFruits("files/homework7/supply.txt");

        for(Fruit fruit : fruits){
            System.out.println(fruit.getFruit());
            System.out.println(fruit.getShelfLife());
            System.out.println(fruit.getDateOfIncome());
            System.out.println(fruit.getPrice());
        }
    }
}

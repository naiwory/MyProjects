package module5Three.homework;

import module5Three.homework.flowers.Daisy;
import module5Three.homework.flowers.Rose;
import module5Three.homework.flowers.SuperFlower;
import module5Three.homework.flowers.Tulip;

public class FlowersMain {

    public static void main(String[] args) {
        FlowerStore fs = new FlowerStore();
        SuperFlower[] flowers = new SuperFlower[]{
                new Rose(100),
                new Tulip(45),
                new Daisy(70)
        };
        //System.out.println(fs.sell(3, 5, 6));
        System.out.println(fs.sellSequence(3, 5, 6));
        //FlowersLoader.load("files/flowers.txt");
        //FlowersSaver.save("files/flowers.txt", flowers);
    }
}

package module5Three;

public class FlowersMain {

    public static void main(String[] args) {
        FlowerStore fs = new FlowerStore();
        SuperFlower[] flowers = new SuperFlower[]{
                new Rose(),
                new Tulip(),
                new Daisy()
        };
        //System.out.println(fs.sell(3, 5, 6));
        //System.out.println(fs.sellSequence(3, 5, 6));
        FlowersLoader.load("flowers.txt");
        //FlowersSaver.save("flowers.txt", flowers);
    }
}

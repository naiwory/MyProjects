package module5.carInformation.Practice;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(8.0, 5.7);
        Point point1 = new Point(9.6, 7.5);
        Circle circle = new Circle(4, point);
        Circle circle1 = new Circle(6, point1);
        CircleGenerator cg = new CircleGenerator();

        System.out.println(point.calcLength(point1));
        System.out.println(circle.collisionCheck(circle1));
        cg.generate(5);
        System.out.println(cg.calcCountOfCollisions());
    }
}

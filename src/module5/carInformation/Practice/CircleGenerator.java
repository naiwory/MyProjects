package module5.carInformation.Practice;

import java.util.Random;

public class CircleGenerator {
    Circle[] circle = new Circle[]{};
    Point point = new Point(8.9, 9.8);
    Circle c = new Circle(10, point);

    public void generate(int countOfCircles){
        double radius;
        for(int i = 1; i == countOfCircles; i++) {
            radius = Math.random() * 100;
            circle[i].setRadius(radius);
            circle[i].center.setX(Math.random() * 100);
            circle[i].center.setY(Math.random() * 100);
        }
    }

    public int calcCountOfCollisions() {
        int result = 0;
        for (int i = 0; i < circle.length - 1; i++) {
            if (c.collisionCheck(circle[i]))
                result++;
        }
        return result;
    }
}

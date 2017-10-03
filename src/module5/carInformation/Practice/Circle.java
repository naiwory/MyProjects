package module5.carInformation.Practice;

public class Circle {
    private double radius;
    Point center = new Point(7.8, 4.2);

    public Circle(double radius, Point center){
        this.radius = radius;
        this.center = center;
    }

    public boolean collisionCheck(Circle otherCircle){
        boolean res = true;
        double result = center.calcLength(otherCircle.center);
        if (result < radius + otherCircle.getRadius())
            res = true;
        else if(result >= radius + otherCircle.getRadius())
            res = false;
        return res;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getPoint() {
        return center;
    }

    public void setPoint(Point center) {
        this.center = center;
    }
}

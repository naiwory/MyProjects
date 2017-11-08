package module5.carInformation.Practice;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
    this.x = x;
    this.y = y;
};

    public double calcLength(Point otherPoint){
        double result = Math.sqrt((otherPoint.getY() - y)*(otherPoint.getY() - y) +
                (otherPoint.getX() - x)*(otherPoint.getX() - x));
        return result;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

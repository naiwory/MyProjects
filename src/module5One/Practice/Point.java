package module5One.Practice;

import javafx.application.Application;
import javafx.stage.Stage;

public class Point{
    public Point(){

    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    private final static Point ZERO = new Point(0, 0);
    private double x;
    private double y;

    public double calcLength(Point otherPoint){
        double result = Math.sqrt((otherPoint.getY() - y)*(otherPoint.getY() - y) +
                (otherPoint.getX() - x)*(otherPoint.getX() - x));
        return result;
    }

    public double calcLength(){
        return calcLength(ZERO);
    }

    public Point normalize(){
       return new Point(
               x / calcLength(),
               y / calcLength()
       );
    }

    public Point multiply(double value){
        return new Point(x * value, y * value);
    }

    public Point minus(Point p){
        return new Point(x - p.x, y - p.y);
    }

    public Point plus(Point p){
        return new Point(x + p.x, y + p.y);
    }

    public static Point getZERO() {
        return ZERO;
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

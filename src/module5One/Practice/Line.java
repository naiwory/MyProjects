package module5One.Practice;

import javafx.scene.layout.Pane;

public class Line {
    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    private Point p1, p2;
    private javafx.scene.shape.Line lineFx;

    public double calcLength(){
        return p1.calcLength(p2);
    }

    public Point getPointOnLine(float percent){
        Point direction = p2.minus(p1);
        direction = direction.normalize();
        double length = p1.calcLength(p2) * percent;
        direction = direction.multiply(length);
        return p1.plus(direction);
    }

    public void draw(Pane root){
        if(lineFx == null){
            lineFx = new javafx.scene.shape.Line();
        }
        lineFx.setStartX(p1.getX());
        lineFx.setEndX(p2.getX());
        lineFx.setStartY(p1.getY());
        lineFx.setEndY(p2.getY());
        root.getChildren().addAll(lineFx);
    }

    public void clear(Pane root){
        root.getChildren().remove(lineFx);
        lineFx = null;
    }



    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public javafx.scene.shape.Line getLineFx() {
        return lineFx;
    }

    public void setLineFx(javafx.scene.shape.Line lineFx) {
        this.lineFx = lineFx;
    }
}

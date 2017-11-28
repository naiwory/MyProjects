package module5One.practice;

import javafx.scene.layout.Pane;

public class Triangle {
    private Line l1, l2, l3;
    private Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void draw(Pane root){
        root.getChildren().addAll(l1.getLineFx(), l2.getLineFx(), l3.getLineFx());
    }

    public void clear(Pane root){
        l1.clear(root);
        l2.clear(root);
        l3.clear(root);
    }

    public Line getL1() {
        return l1;
    }

    public void setL1(Line l1) {
        this.l1 = l1;
    }

    public Line getL2() {
        return l2;
    }

    public void setL2(Line l2) {
        this.l2 = l2;
    }

    public Line getL3() {
        return l3;
    }

    public void setL3(Line l3) {
        this.l3 = l3;
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

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }
}

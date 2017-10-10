package module5One;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class Star {

    private double x;
    private double y;
    private double r;

    public Star(){

    }

    public Star(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void initButtons(Pane root) {


        TextField tfX = new TextField("Введите x центра звезды");
        tfX.setTranslateX(10);
        tfX.setTranslateY(10);

        TextField tfY = new TextField("Введите y центра звезды");
        tfY.setTranslateX(10);
        tfY.setTranslateY(50);

        TextField tfR = new TextField("Введите радиус звезды");
        tfR.setTranslateX(10);
        tfR.setTranslateY(90);

        Button button = new Button("Отправить данные");
        button.setTranslateX(350);
        button.setTranslateY(10);
        button.setOnMouseClicked(event -> {
                    x = Double.parseDouble(tfX.getText()),
                    y = Double.parseDouble(tfY.getText()),
                    r = Double.parseDouble(tfR.getText())
        });


        root.getChildren().addAll(tfX, tfY, tfR, button);
    }

    public void drawStar(Pane root) {
        Line[] star = new Line[]{
                new Line(250, 150, 270, 220),
                new Line(270, 220, 350, 220),
                new Line(350, 220, 290, 260),
                new Line(290, 260, 310, 330),
                new Line(310, 330, 250, 290),
                new Line(250, 290, 190, 330),
                new Line(190, 330, 210, 260),
                new Line(210, 260, 150, 220),
                new Line(150, 220, 230, 220),
                new Line(230, 220, 250, 150)
        };
        root.getChildren().addAll(star);
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

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}

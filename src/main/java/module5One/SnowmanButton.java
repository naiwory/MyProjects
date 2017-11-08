package module5One;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.shape.Circle;

import java.util.Random;

public class SnowmanButton {

    private double min;
    private double max;
    private int n;

    public SnowmanButton() {
    }

    public SnowmanButton(double min, double max, int n) {
        this.min = min;
        this.max = max;
        this.n = n;
    }

    public static Color random(){
        Random r = new Random();
        return Color.color(r.nextDouble(), r.nextDouble(), r.nextDouble());
    }

    public Circle[] drawSnowman(Pane root){

        Circle[] snowman = new Circle[n];

        for(int i = 0; i < snowman.length; i++) {
        snowman[i] = new Circle(250, (snowman[i - 1].getRadius() * 2) + (snowman[i].getRadius()),
                min + Math.random() * (max - min), Color.TRANSPARENT);
        snowman[i].setStroke(random());
    }
        root.getChildren().addAll(snowman);
        return snowman;
}

    public Circle[] drawSnowmanHead(Pane root) {

        Circle[] snowmanHead = new Circle[3];

        for (int i = 0; i < 3; i++) {
            snowmanHead[i] = new Circle(2, 2, 2, Color.TRANSPARENT);
            snowmanHead[i].setStroke(random());
        }
        root.getChildren().addAll(snowmanHead);
        return snowmanHead;
    }


    public void initButtons(Pane root){
        TextField tf = new TextField("Введите количество кругов");
        tf.setTranslateX(10);
        tf.setTranslateY(10);

        TextField tfMin = new TextField("Введите минимальный радиус круга");
        tfMin.setTranslateX(10);
        tfMin.setTranslateY(50);

        TextField tfMax = new TextField("Введите максимальный радиус круга");
        tfMax.setTranslateX(10);
        tfMax.setTranslateY(90);

        Button button = new Button("Отправить данные");
        button.setTranslateX(350);
        button.setTranslateY(10);
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int n = Integer.parseInt(tf.getText());
                double min = Double.parseDouble(tfMin.getText());
                double max = Double.parseDouble(tfMax.getText());
                drawSnowman(root);

                root.getChildren().addAll(tf, tfMin, tfMax, button);
            }

        });
    }

    public void buttonR(Pane root, Circle[] snowman) {
        Button buttonR = new Button("Покрась в красный");
        buttonR.setTranslateX(250);
        buttonR.setTranslateY(10);
        buttonR.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                for (int i = 0; i < snowman.length; i++) {
                    snowman[i].setFill(Paint.valueOf("#FF0000"));
                    snowman[i].setStroke(Paint.valueOf("#FF0000"));
                }
                root.getChildren().add(buttonR);
            }
        });
    }

    public void buttonG(Pane root, Circle[] snowman) {
        Button buttonG = new Button("Покрась в оттенки серого");
        buttonG.setTranslateX(350);
        buttonG.setTranslateY(10);
        buttonG.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Stop[] stops = new Stop[]{
                        new Stop(0, Color.BLACK),
                        new Stop(0.5f, Color.GRAY),
                        new Stop(1, Color.LIGHTGRAY)
                };
                LinearGradient gradient = new LinearGradient(
                        0, 0,
                        1, 1,
                        true,
                        CycleMethod.NO_CYCLE,
                        stops);

                for(int i = 0; i < snowman.length; i++)
                snowman[i].setStroke(gradient);
                root.getChildren().add(buttonG);
            }
        });
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}



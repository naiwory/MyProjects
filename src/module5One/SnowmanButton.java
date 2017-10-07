package module5One;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.Random;

public class SnowmanButton extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private double min;
    private double max;
    private int n;

    public static Color random(){
        Random r = new Random();
        return Color.color(r.nextDouble(), r.nextDouble(), r.nextDouble());
    }

    public void drawSnowman(Pane root){

    Circle[] snowman = new Circle[n];

        for(int i = 0;i<snowman.length;i++) {
        snowman[i] = new Circle(200, 100, min + Math.random() * (max - min), Color.TRANSPARENT);
        snowman[i].setStroke(random());
    }
        root.getChildren().addAll(snowman);

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
                root.getChildren().addAll(buttonR);
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

                snowman.setStroke(gradient);
                root.getChildren().addAll(buttonG);
            }
        });
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root = new Pane();
        drawSnowman(root);
        initButtons(root);
        buttonR(root, snowman);
        buttonG(root, snowman);

        Scene scene = new Scene(root);



        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setX(Screen.getPrimary().getBounds().getWidth() - primaryStage.getWidth());
        primaryStage.show();
    }

}

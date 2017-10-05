package module5One;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.Scanner;

public class SnowmanConsole extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество кругов:");
        int n = sc.nextInt();
        System.out.println("Введите минимальный радиус круга:");
        int min = sc.nextInt();
        System.out.println("Введите максимальный радиус круга:");
        int max = sc.nextInt();

        Circle[] circle = new Circle[n];

        for(int i = 0; i < circle.length; i++){
            circle[i] = new Circle(min + Math.random() * max,);
            circle[i].setFill(Paint.valueOf(""));
            circle[i].setStroke(Paint.valueOf(""));
        }
        Pane root = new Pane();
        root.getChildren().addAll(circle);
        Scene scene = new Scene(root);

        Button buttonR = new Button("Покрась в красный");
        buttonR.setTranslateX(250);
        buttonR.setTranslateY(10);
        buttonR.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                for(int i = 0; i < circle.length; i++){
                    circle[i].setFill(Paint.valueOf("#FF0000"));
                    circle[i].setStroke(Paint.valueOf("#FF0000"));
                }
            }
        });

        Button buttonG = new Button("Покрась в красный");
        buttonG.setTranslateX(350);
        buttonG.setTranslateY(10);
        buttonG.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                for(int i = 0; i < circle.length; i++){
                    circle[i].setFill(Paint.valueOf("#FF0000"));
                    circle[i].setStroke(Paint.valueOf("#FF0000"));
                }
            }
        });

        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setX(Screen.getPrimary().getBounds().getWidth() - primaryStage.getWidth());
        primaryStage.show();
    }

}

package module8.homework;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class GeometryInMotion extends Application{

    public static void main ( String[] args ) {
        launch(args);
    }

    @Override
    public void start ( Stage primaryStage ) throws Exception {
        Pane root = new Pane();

        TextField tfMin = new TextField("Minimal quantity of rectangles");
        tfMin.setTranslateX(10);
        tfMin.setTranslateY(10);

        TextField tfMax = new TextField("Maximum quantity of rectangles");
        tfMax.setTranslateX(170);
        tfMax.setTranslateY(10);

        Button button = new Button("Enter");
        button.setTranslateX(350);
        button.setTranslateY(10);
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int min = Integer.parseInt(tfMin.getText());
                int max = Integer.parseInt(tfMax.getText());
            }

        });

        Button multyThreads = new Button("Multy Threads");
        multyThreads.setTranslateX(50);
        multyThreads.setTranslateY(60);
        multyThreads.setOnMouseClicked(new EventHandler<MouseEvent> () {
            @Override
            public void handle(MouseEvent event) {
               Thread[] rectangles = new Thread[]{};
            }
        });

        Button singleThread = new Button("Single Thread");
        singleThread.setTranslateX(200);
        singleThread.setTranslateY(60);
        singleThread.setOnMouseClicked(new EventHandler<MouseEvent> () {
            @Override
            public void handle(MouseEvent event) {

            }
        });

        Button optimalThreads = new Button("Optimal Threads");
        optimalThreads.setTranslateX(350);
        optimalThreads.setTranslateY(60);
        optimalThreads.setOnMouseClicked(new EventHandler<MouseEvent> () {
            @Override
            public void handle(MouseEvent event) {

            }
        });

        root.getChildren().addAll(multyThreads, singleThread, optimalThreads, tfMin, tfMax, button);

        primaryStage.setScene(new Scene (root));
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.show();

    }
}

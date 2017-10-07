package module5One;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Star extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private double x;
    private double y;
    private double r;

    @Override
    public void start(Stage primaryStage) throws Exception {
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
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                x = Double.parseDouble(tfX.getText());
                y = Double.parseDouble(tfY.getText());
                r = Double.parseDouble(tfR.getText());

            }
        });


        Line[] line = new Line[10];
        for (int i = 0; i < line.length; i++) {
            line[i] = new Line();
        }

        Pane root = new Pane();
        root.getChildren().addAll(line);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setX(Screen.getPrimary().getBounds().getWidth() - primaryStage.getWidth());
        primaryStage.show();
    }
}

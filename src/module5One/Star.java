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


    @Override
    public void start(Stage primaryStage) throws Exception {

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

        Pane root = new Pane();
        //initButtons(root);
        root.getChildren().addAll(star);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setX(Screen.getPrimary().getBounds().getWidth() - primaryStage.getWidth());
        primaryStage.show();
    }
}

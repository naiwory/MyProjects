package module5One;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Practice extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    void drawCircle(GraphicsContext gc, double x, double y, double radius) {
        gc.setStroke(SnowmanButton.random());
        gc.setLineWidth(1 + Math.random() * (10 - 1));
        gc.strokeOval(x + radius, y + radius, radius * 2, radius * 2);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final Canvas canvas = new Canvas(1000,800);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        for(int i = 0; i < 200; i++) {
            drawCircle(gc,
                    0 + Math.random () * ((int) canvas.getWidth() - 0),
                    0 + Math.random () * ((int) canvas.getHeight() - 0),
                    10 + Math.random() + (100 - 10));
        }

        Pane root = new Pane();
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}

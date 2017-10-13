package module5One;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class FXMain extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root = new Pane();

        SnowmanConsole sc = new SnowmanConsole();
        sc.console();
        sc.drawSnowman(root);
        sc.buttonR(root, sc.drawSnowman(root));
        sc.buttonG(root, sc.drawSnowman(root));

        SnowmanButton sb = new SnowmanButton();
        sb.drawSnowman(root);
        sb.buttonR(root, sb.drawSnowman(root));
        sb.buttonG(root, sb.drawSnowman(root));

        Star star = new Star();
        //star.initButtons(root);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setX(Screen.getPrimary().getBounds().getWidth() - primaryStage.getWidth());
        primaryStage.show();
    }
}

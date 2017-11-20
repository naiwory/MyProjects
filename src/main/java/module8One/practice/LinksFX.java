package module8One.practice;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LinksFX extends Application{

    ExecutorService pool = Executors.newFixedThreadPool ( 2 );

    public static void main ( String[] args ) {

        launch(args);
    }

    @Override
    public void start ( Stage primaryStage ) throws Exception {
        Pane root = new Pane();

        ImageView imageView = new ImageView();

        imageView.setFitWidth(100);
        imageView.setFitHeight(100);
        imageView.setX(100);
        imageView.setY(300);

        root.getChildren().add(imageView);

        primaryStage.setScene(new Scene (root));
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.show();



        pool.submit(() -> {

            try {

                URL url = new URL("https://www.hdwallpapers.in/walls/lotus_flowers-wide.jpg");
                Image image = new Image(url.openStream());
                Platform.runLater(() -> {imageView.setImage(image);});

            } catch (Exception e) {

                e.printStackTrace();

            }

        });



        pool.shutdown();

    }

}

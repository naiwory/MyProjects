package module9.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class YoutubeDownloadJavaFX extends Application{

    private static final int WINDOW_HEIGHT = 900;

    private static final int WINDOW_WIDTH = 1350;

    private static final int VERTICAL_OFFSET = 50;

    private ArrayList<String> videolds = new ArrayList <> (  );

    private final ExecutorService pool = Executors.newFixedThreadPool(4);

    public static void main ( String[] args ) {
        launch(args);
    }

    @Override
    public void start ( Stage primaryStage ) throws Exception {
        Pane root = new Pane (  );

        ScrollPane scrollPane = new ScrollPane();

        scrollPane.setTranslateX(0);

        scrollPane.setTranslateY(VERTICAL_OFFSET);

        scrollPane.setPannable(true);

        scrollPane.setPrefSize(WINDOW_WIDTH, WINDOW_HEIGHT - VERTICAL_OFFSET);

        // авто обновление размеров для scrollPane при ресайзе окна

        root.heightProperty().addListener((arg0, arg1, arg2) -> {

            scrollPane.setPrefHeight(arg2.doubleValue() - VERTICAL_OFFSET);

        });

        root.widthProperty().addListener((arg0, arg1, arg2) -> {

            scrollPane.setPrefWidth(arg2.doubleValue());

        });

        TextField tf = new TextField ( "Enter video IDs" );
        tf.setTranslateX ( 10 );
        tf.setTranslateY ( 10 );

        Button btn = new Button ( "Submit" );
        btn.setTranslateX ( 200 );
        btn.setTranslateY ( 10 );
        btn.setOnMouseClicked ( (event) -> {
            String text = tf.getText ();
            String[] split = text.split ( "," );

        } );





        root.getChildren ().addAll ( tf, btn, scrollPane);

        primaryStage.setScene(new Scene (root));

        primaryStage.setHeight(WINDOW_HEIGHT);

        primaryStage.setWidth(WINDOW_WIDTH);

        primaryStage.show();

    }

    /*private void generateImage(Pane content, int y, int width, ThumbnailImage image) {

        if (image == null) return;



        ImageView imageView = new ImageView(new Image (image.url));

        imageView.setTranslateX(width);

        imageView.setTranslateY(y);

        imageView.setFitHeight(image.height);

        imageView.setFitWidth(image.width);



        content.getChildren().addAll(imageView);

        content.setPrefHeight(y + image.height);

        content.setPrefWidth(width + image.width);

    }*/
}

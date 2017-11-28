package module8One.homework;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class PicturesDownload extends Application{

    private Random random = new Random (  );

    public static String[] read(String path)throws Exception{
        String json = new Scanner (new File (path)).useDelimiter("\\Z").next();
        String[] links = json.split ( "/n" );
        return links;
    }

    public static void main ( String[] args ) {
        launch(args);
    }

    @Override
    public void start ( Stage primaryStage ) throws Exception {
        String[] links = read("files/homework8One/pictures.txt");

        Pane root = new Pane();
        Pane content = new Pane();
        content.setTranslateX ( 0 );
        content.setTranslateY ( 50 );

        Button refresh = new Button ( "Refresh" );
        refresh.setTranslateY ( 10 );
        refresh.setTranslateX ( 10 );
        refresh.setOnMouseClicked ( (event) -> {
            content.getChildren ().clear ();
            for(int i = 0; i < 25; i++){
                Image image = new Image(links[1 + random.nextInt ( 50 )]);

                ImageView ivl = new ImageView();
                ivl.setImage(image);
                ivl.setFitHeight ( 50 );
                ivl.setFitWidth ( 50 );
                ivl.setTranslateX ( 10 );
                content.getChildren ().add ( ivl );
            }
        } );

        root.getChildren ().addAll ( content, refresh );

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);

        primaryStage.setHeight(1000);

        primaryStage.setWidth(1000);

        primaryStage.setTitle("Random Pictures");

        primaryStage.show();
    }
}

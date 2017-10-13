package module5Two;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.util.Random;

public class Player6 extends Player3{

    public Player6(double PRICE, String songName, String[] playlist) {
        super(PRICE, songName, playlist);
    }

    public void shuffle(){
        Random r = new Random();
        for (String song : super.getPlaylist()) {
            System.out.println("Playing: " + song);
        }
    }

    @Override
    public void show(Pane root) {
        super.show(root);
        Button button = new Button();
        button.setTranslateX(150);
        button.setTranslateY(50);
        button.setOnMouseClicked(event -> shuffle());

        root.getChildren().add(button);
    }
}

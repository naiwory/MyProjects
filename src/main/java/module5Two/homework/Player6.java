package module5Two.homework;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class Player6 extends Player3{


    public Player6(String songName, double PRICE, String[] playlist) {
        super(songName, PRICE, playlist);
    }

    public void shuffle(){
        for (int i = (int)Math.round(Math.random() * super.getPlaylist().length - 1);
             i < (int)Math.round(Math.random() * super.getPlaylist().length); i++) {
            System.out.println("Playing: " + super.getPlaylist()[i]);
        }
    }

    @Override
    public void show(Pane root) {
        super.show(root);
        Button button = new Button("Перемешай все песни");
        button.setTranslateX(450);
        button.setTranslateY(50);
        button.setOnMouseClicked(event -> shuffle());

        root.getChildren().add(button);
    }
}

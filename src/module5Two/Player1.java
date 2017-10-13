package module5Two;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class Player1 {

    private final static double PRICE;
    private String songName;

    public Player1(double PRICE, String songName) {
        this.PRICE = PRICE;
        this.songName = songName;
    }

    public void playSong(){
        System.out.println("Playing: " + songName);
    }

    public void show(Pane root){
        Button button = new Button();
        button.setTranslateX(50);
        button.setTranslateY(50);
        button.setOnMouseClicked(event -> playSong());

        root.getChildren().add(button);
    }

    public static double getPRICE() {
        return PRICE;
    }
}

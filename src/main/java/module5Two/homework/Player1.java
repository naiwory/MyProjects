package module5Two.homework;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class Player1 extends Player{

    private final double PRICE;

    public Player1(String songName, double PRICE) {
        super(songName);
        this.PRICE = PRICE;
    }


    public void playSong(){
        System.out.println("Playing: " + super.getSongName());
    }

    public void show(Pane root){
        Button button = new Button("Проиграй песню");
        button.setTranslateX(50);
        button.setTranslateY(50);
        button.setOnMouseClicked(event -> playSong());

        root.getChildren().add(button);
    }

    public double getPRICE() {
        return PRICE;
    }
}

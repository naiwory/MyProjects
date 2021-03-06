package module5Two.homework;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class Player3 extends Player1{

    private String[] playlist = new String[]{};

    public Player3(String songName, double PRICE, String[] playlist) {
        super(songName, PRICE);
        this.playlist = playlist;
    }


    @Override
    public void playSong() {
        System.out.println("Playing: " + playlist[0]);
    }

    public void playAllSongs(){
        for (String song : playlist) {
            System.out.println("Playing: " + song);
        }
    }

    @Override
    public void show(Pane root) {
        super.show(root);
        Button button = new Button("Проиграй все песни");
        button.setTranslateX(250);
        button.setTranslateY(50);
        button.setOnMouseClicked(event -> playAllSongs());

        root.getChildren().add(button);
    }

    public String[] getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String[] playlist) {
        this.playlist = playlist;
    }
}

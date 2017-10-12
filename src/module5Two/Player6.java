package module5Two;

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
}

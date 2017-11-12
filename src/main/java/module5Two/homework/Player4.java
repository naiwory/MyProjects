package module5Two.homework;

public class Player4 extends Player3 {


    public Player4(String songName, double PRICE, String[] playlist) {
        super(songName, PRICE, playlist);
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + super.getPlaylist()[getPlaylist().length - 1]);
    }
}

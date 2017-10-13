package module5Two;

public class Player4 extends Player3 {


    public Player4(double PRICE, String songName, String[] playlist) {
        super(PRICE, songName, playlist);
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + super.getPlaylist()[getPlaylist().length - 1]);
    }
}

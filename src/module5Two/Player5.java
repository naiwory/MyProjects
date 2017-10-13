package module5Two;

public class Player5 extends Player3 {


    public Player5(double PRICE, String songName, String[] playlist) {
        super(PRICE, songName, playlist);
    }

    @Override
    public void playAllSongs() {
        for(int i = super.getPlaylist().length - 1; i < 0; i--){
            System.out.println("Playing: " + super.getPlaylist()[i]);
        }
    }
}

package module5Two.homework;

public class Player5 extends Player3 {


    public Player5(String songName, double PRICE, String[] playlist) {
        super(songName, PRICE, playlist);
    }

    @Override
    public void playAllSongs() {
        for(int i = super.getPlaylist().length - 1; i >= 0; i--){
            System.out.println("Playing: " + super.getPlaylist()[i]);
        }
    }
}

package module5Two;

public class Player3 extends Player1{

    private String[] playlist = new String[]{};

    public Player3(double PRICE, String songName, String[] playlist) {
        super(PRICE, songName);
        this.playlist = playlist;
    }

    @Override
    public void playSong() {
        super.playSong();
    }

    public void playAllSongs(){
        for (String song : playlist) {
            System.out.println("Playing: " + song);
        }
    }

    public String[] getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String[] playlist) {
        this.playlist = playlist;
    }
}

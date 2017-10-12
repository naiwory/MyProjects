package module5Two;

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

    public static double getPRICE() {
        return PRICE;
    }
}

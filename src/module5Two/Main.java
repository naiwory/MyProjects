package module5Two;

public class Main {
    public static void main(String[] args) {
        Player1 p1 = new Player1(100, "Love Is For Suckers");
        System.out.println("Player1:");
        p1.playSong();

        Player2 p2 = new Player2(120, "My Immortal");
        System.out.println();
        System.out.println("Player2:");
        p2.playSong();

        Player3 p3 - new Player3(140, "Synthetic Sun", new String[]{"Alice In Wounderland", "Rape My Soul",
        "64389000", "Narcissus"});
        System.out.println();
        System.out.println("Player3:");
        p3.playSong();
        p3.playAllSongs();

        Player4 p4 = new Player4(160, "Dissapear", new String[]{"End Of The Dream", "Everybody's Fool",
        "Field Of Innocence", "Made Of Stone", "Sweet Sacrifice"});
        System.out.println();
        System.out.println("Player4:");
        p4.playSong();
        p4.playAllSongs();

        Player5 p5 = new Player5(180, "All I Need", new String[]{"Bittersweet", "Cross",
        "A Dangerous Mind", "Deceiver Of Fools", "Empty Eyes", "Hand Of Sorrow"});
        System.out.println();
        System.out.println("Player5:");
        p5.playSong();
        p5.playAllSongs();

        Player6 p6 = new Player6(200, "In Perfect Harmony", new String[]{"In The Middle Of The Night",
                "Iron", "It's The Fear", "Murder", "Our Solemn Hour", "Stand My Ground"});
        System.out.println();
        System.out.println("Player5:");
        p5.playSong();
        p5.playAllSongs();

    }
}

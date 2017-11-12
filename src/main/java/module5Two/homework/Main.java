package module5Two.homework;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);

        /*Player1 p1 = new Player1( "Love Is For Suckers", 100);
        System.out.println("Player1:");
        p1.playSong();

        Player2 p2 = new Player2( "My Immortal", 120);
        System.out.println();
        System.out.println("Player2:");
        p2.playSong();

        Player3 p3 = new Player3( "Call Me When You're Sober", 140, new String[]{"Synthetic Sun",
                "Alice In Wounderland", "Rape My Soul", "64389000", "Narcissus"});
        System.out.println();
        System.out.println("Player3:");
        p3.playSong();
        System.out.println();
        p3.playAllSongs();

        Player4 p4 = new Player4( "Dissapear", 160, new String[]{"End Of The Dream", "Everybody's Fool",
                "Field Of Innocence", "Made Of Stone", "Sweet Sacrifice"});
        System.out.println();
        System.out.println("Player4:");
        p4.playSong();
        System.out.println();
        p4.playAllSongs();

        Player5 p5 = new Player5( "All I Need", 180, new String[]{"Bittersweet", "Cross",
                "A Dangerous Mind", "Deceiver Of Fools", "Empty Eyes", "Hand Of Sorrow"});
        System.out.println();
        System.out.println("Player5:");
        p5.playSong();
        System.out.println();
        p5.playAllSongs();

        Player6 p6 = new Player6( "In Perfect Harmony", 200, new String[]{"In The Middle Of The Night",
                "Iron", "It's The Fear", "Murder", "Our Solemn Hour", "Stand My Ground"});
        System.out.println();
        System.out.println("Player6:");
        p6.playSong();
        System.out.println();
        p6.playAllSongs();
        System.out.println();
        p6.shuffle();*/

    }

    public void player1(Pane root) {
        Player1 p1 = new Player1( "Love Is For Suckers", 100);
        p1.show(root);
    }

    public void player2(Pane root) {
        Player2 p2 = new Player2( "My Immortal", 120);
        p2.show(root);
    }

    public void player3(Pane root) {
        Player3 p3 = new Player3( "Call Me When You're Sober", 140, new String[]{"Synthetic Sun",
                "Alice In Wounderland", "Rape My Soul", "64389000", "Narcissus"});
        p3.show(root);
    }

    public void player4(Pane root) {
        Player4 p4 = new Player4( "Dissapear", 160, new String[]{"End Of The Dream", "Everybody's Fool",
                "Field Of Innocence", "Made Of Stone", "Sweet Sacrifice"});
        p4.show(root);
    }

    public void player5(Pane root) {
        Player5 p5 = new Player5( "All I Need", 180, new String[]{"Bittersweet", "Cross",
                "A Dangerous Mind", "Deceiver Of Fools", "Empty Eyes", "Hand Of Sorrow"});
        p5.show(root);
    }

    public void player6(Pane root) {
        Player6 p6 = new Player6( "In Perfect Harmony", 200, new String[]{"In The Middle Of The Night",
                "Iron", "It's The Fear", "Murder", "Our Solemn Hour", "Stand My Ground"});
        p6.show(root);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setHeight(200);
        primaryStage.setWidth(600);

        player6(root);

        primaryStage.show();
    }
}

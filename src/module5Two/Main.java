package module5Two;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);

        Player1 p1 = new Player1(100, "Love Is For Suckers");
        System.out.println("Player1:");
        p1.playSong();

        Player2 p2 = new Player2(120, "My Immortal");
        System.out.println();
        System.out.println("Player2:");
        p2.playSong();

        Player3 p3 = new Player3(140, "Call Me When You're Sober", new String[]{"Synthetic Sun",
                "Alice In Wounderland", "Rape My Soul", "64389000", "Narcissus"});
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

    public void player1(Pane root) {
        Player1 p1 = new Player1(100, "Love Is For Suckers");
        p1.show(root);
    }

    public void player2(Pane root) {
        Player2 p2 = new Player2(120, "My Immortal");
        p2.show(root);
    }

    public void player3(Pane root) {
        Player3 p3 = new Player3(140, "Call Me When You're Sober", new String[]{"Synthetic Sun",
                "Alice In Wounderland", "Rape My Soul", "64389000", "Narcissus"});
        p3.show(root);
    }

    public void player4(Pane root) {
        Player4 p4 = new Player4(160, "Dissapear", new String[]{"End Of The Dream", "Everybody's Fool",
                "Field Of Innocence", "Made Of Stone", "Sweet Sacrifice"});
        p4.show(root);
    }

    public void player5(Pane root) {
        Player5 p5 = new Player5(180, "All I Need", new String[]{"Bittersweet", "Cross",
                "A Dangerous Mind", "Deceiver Of Fools", "Empty Eyes", "Hand Of Sorrow"});
        p5.show(root);
    }

    public void player6(Pane root) {
        Player6 p6 = new Player6(200, "In Perfect Harmony", new String[]{"In The Middle Of The Night",
                "Iron", "It's The Fear", "Murder", "Our Solemn Hour", "Stand My Ground"});
        p6.show(root);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setHeight(300);
        primaryStage.setWidth(300);

        player1(root);

        primaryStage.show();
    }
}

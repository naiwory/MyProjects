package module5Two;

import java.io.*;
import javazoom.jl.player.advanced.*;
import javazoom.jl.player.*;

public class RealPlayer {
    public static AdvancedPlayer explay;
    public static String muss = "doom.mp3";

    public static void main(String[] args) {

        try{
            InputStream potok = new FileInputStream(muss);
            AudioDevice auDev = new JavaSoundAudioDevice();
            explay = new AdvancedPlayer(potok,auDev);
            explay.play();
        }catch(Exception err){err.printStackTrace();}
    }
}

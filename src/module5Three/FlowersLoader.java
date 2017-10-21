package module5Three;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FlowersLoader {

    public static SuperFlower[] load(String path){
        try {
            Scanner sc = new Scanner(new FileReader(path));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

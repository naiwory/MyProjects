package module5Three;

import java.io.FileWriter;
import java.io.IOException;

public class FlowersSaver {

    public static void save(String path, SuperFlower[] flowers){
        try {
            FileWriter fw = new FileWriter(path);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

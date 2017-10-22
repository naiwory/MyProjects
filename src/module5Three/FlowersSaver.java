package module5Three;

import java.io.FileWriter;
import java.io.IOException;

public class FlowersSaver {

    public static void save(String path, SuperFlower[] flowers){
        try {
            FileWriter fw = new FileWriter(path);
            for(SuperFlower flower : flowers) {
                if (flower instanceof Rose) {
                    Rose rose = (Rose) flower;
                    fw.write(rose.getPrice());
                }
                if (flower instanceof Daisy){
                    Daisy daisy = (Daisy) flower;
                    fw.write(daisy.getPrice());
                }
                if (flower instanceof Tulip) {
                    Tulip tulip = (Tulip) flower;
                    fw.write(tulip.getPrice());
                }
            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

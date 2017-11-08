package module5Three.homework;

import module5Three.homework.flowers.Daisy;
import module5Three.homework.flowers.Rose;
import module5Three.homework.flowers.SuperFlower;
import module5Three.homework.flowers.Tulip;

import java.io.*;

public class FlowersLoader {

    private static final String SEPARATOR = ";";

    public static SuperFlower[] load(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            int count = Integer.parseInt(br.readLine());
            SuperFlower[] flowers = new SuperFlower[count];

            for(int i = 0; i < flowers.length; i++){
                String line = br.readLine();
                String[] data = line.split(SEPARATOR);

                if(data[0].equals(Rose.class.getSimpleName())){
                    flowers[i] = new Rose(Integer.parseInt(data[1]));
                }
                if(data[0].equals(Tulip.class.getSimpleName())){
                    flowers[i] = new Tulip(Integer.parseInt(data[1]));
                }
                if(data[0].equals(Daisy.class.getSimpleName())){
                    flowers[i] = new Daisy(Integer.parseInt(data[1]));
                }
            }
            return flowers;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

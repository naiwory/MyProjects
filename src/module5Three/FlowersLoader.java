package module5Three;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FlowersLoader {

    public static SuperFlower[] load(String path) {
        SuperFlower[] flowers = new SuperFlower[]{};
        String fileName = "Flowers.txt";
        Scanner inputStream = null;

        try {
            inputStream = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("error");
            System.exit(0);
        }
        int i = 0;
        while (inputStream.hasNextLine()) {
            int price = inputStream.nextInt();
            if(price == 100) {
                flowers[i] = new Rose(price);
                i++;
            }
            if(price == 70) {
                flowers[i] = new Daisy(price);
                i++;
            }
            if(price == 45) {
                flowers[i] = new Tulip(price);
                i++;
            }
            else
                return null;
        }
        inputStream.close();
        return flowers;
    }
}

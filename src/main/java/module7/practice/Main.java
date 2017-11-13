package module7.practice;

import com.alibaba.fastjson.JSON;
import module7.practice.stores.FruitProduct;
import module7.practice.stores.Store;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void readAndLoadLines(String path, ArrayList<String> line) throws IOException {
        Lines lines = new Lines(line);
        String json = JSON.toJSONString(lines);

        FileWriter fw = new FileWriter(path);
        fw.write(json);
        fw.flush();
        fw.close();

        json = new Scanner(path).useDelimiter("\\Z").next();
        lines = JSON.parseObject(json, Lines.class);
        System.out.println(lines);
    }

    public static void readAndLoadStores(String path){
        FruitProduct products = new FruitProduct("apple", 100, 5);
        Store store = new Store("Best shop", "Cozy street", products);
    }

    public static void main(String[] args) throws IOException {
        ArrayList<String> line = new ArrayList<>();
        line.add("First string");
        line.add("Second string");
        line.add("Third string");
        line.add("Fourth string");
        line.add("Fifth string");
        readAndLoadLines("files/lines.txt", line);

    }
}

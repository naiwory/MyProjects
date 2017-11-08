package module7;

import com.alibaba.fastjson.JSON;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FruitStore {
    private double moneyBalance;
    private ArrayList<Fruit> fruits = new ArrayList<>();
    private ArrayList<Client> clients = new ArrayList<>();

    public FruitStore(){
        moneyBalance = 0;
    }

    public FruitStore(double moneyBalance, ArrayList<Fruit> fruits, ArrayList<Client> clients) {
        this.moneyBalance = moneyBalance;
        this.fruits = fruits;
        this.clients = clients;
    }

    public void addFruits(String pathToJsonFile){

    }

    public void save(String pathToJsonFile) throws Exception{
        String json = JSON.toJSONString(fruits);
        FileWriter fw = new FileWriter(pathToJsonFile);
        fw.write(json);
        fw.flush();
        fw.close();

    }

    public void load(String pathToJsonFile) throws Exception{
        fruits = null;
        String json = new Scanner(new File(pathToJsonFile)).useDelimiter("\\Z").next();
        fruits = JSON.parseObject(json, Fruit.class);
    }

    public ArrayList<Fruit> getSpoiledFruits(Date date){
        return null;
    }

    public ArrayList<Fruit> getAvailableFruits(Date date){
        return null;
    }

    public void sell(String pathToJsonFile) throws Exception{
        clients = null;
        String json = new Scanner(new File(pathToJsonFile)).useDelimiter("\\Z").next();
        clients = JSON.parseObject(json, Client.class);
    }

    public double getMoneyBalance() {
        return moneyBalance;
    }

    public void setMoneyBalance(double moneyBalance) {
        this.moneyBalance = moneyBalance;
    }

    public ArrayList<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
}

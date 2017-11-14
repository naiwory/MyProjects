package module7.homework;

import com.alibaba.fastjson.JSON;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Company {

    private double companyBalance;
    private ArrayList<FruitStore> stores = new ArrayList<>();

    public Company(){
        companyBalance = 0;
    }

    public Company(double companyBalance, ArrayList<FruitStore> stores) {
        this.companyBalance = companyBalance;
        this.stores = stores;
    }

    public void save(String pathToJsonFile) throws Exception{
        String json = JSON.toJSONString(stores);
        FileWriter fw = new FileWriter(pathToJsonFile);
        fw.write(json);
        fw.flush();
        fw.close();
    }

    public void load(String pathToJsonFile) throws Exception{
        stores = null;
        String json = new Scanner(new File(pathToJsonFile)).useDelimiter("\\Z").next();
        stores = JSON.parseObject(json, ArrayList.class);
    }

    public FruitStore getFruitStore(int index){
        FruitStore store = new FruitStore();
        store = stores.get(index);
        return store;
    }

    public ArrayList<Fruit> getSpoiledFruits(Date date){
        return null;
    }

    public ArrayList<Fruit> getSpoiledFruits(Date date, Fruit.FruitType fruit){
        return null;
    }

    public ArrayList<Fruit> getAvailableFruits(Date date){
        return null;
    }

    public ArrayList<Fruit> getAvailableFruits(Date date, Fruit.FruitType fruit){
        return null;
    }

    public ArrayList<Fruit> getAddedFruits(Date date){
        return null;
    }

    public ArrayList<Fruit> getAddedFruits(Date date, Fruit.FruitType fruit){
        return null;
    }

    public double getCompanyBalance(){
        for(FruitStore store : stores)
            companyBalance += store.getMoneyBalance();
        return companyBalance;
    }

    public ArrayList<FruitStore> getStores() {
        return stores;
    }

    public void setStores(ArrayList<FruitStore> stores) {
        this.stores = stores;
    }
}

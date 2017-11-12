package module7.homework;

import java.util.ArrayList;
import java.util.Date;

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

    public void save(String pathToJsonFile){

    }

    public void load(String pathToJsonFile){

    }

    public FruitStore getFruitStore(int index){
        FruitStore store = new FruitStore();
        store = stores.get(index);
        return store;
    }

    public ArrayList<Fruit> getSpoiledFruits(Date date){
        return null;
    }

    public ArrayList<Fruit> getAvailableFruits(Date date){
        return null;
    }

    public ArrayList<Fruit> getAddedFruits(Date date){
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

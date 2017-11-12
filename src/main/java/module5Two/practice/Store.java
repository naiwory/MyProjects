package module5Two.practice;

import module5Two.practice.components.*;
import module5Two.practice.products.components.*;

public class Store {
    protected double purse;
    protected Clothes[] clothes = new Clothes[]{};
    protected Computer[] comp = new Computer[]{};
    protected Smartphone[] smart = new Smartphone[]{};
    protected Sweets[] sweets = new Sweets[]{};
    protected SweetWater[] sweet = new SweetWater[]{};
    protected Vegetables[] veggie = new Vegetables[]{};
    protected Water[] water = new Water[]{};

    public Store(double purse, Clothes[] clothes, Computer[] comp, Smartphone[] smart, Sweets[] sweets,
                 SweetWater[] sweet, Vegetables[] veggie, Water[] water) {
        this.purse = purse;
        this.clothes = clothes;
        this.comp = comp;
        this.smart = smart;
        this.sweets = sweets;
        this.sweet = sweet;
        this.veggie = veggie;
        this.water = water;
    }

    public double getPurse() {
        return purse;
    }

    public void setPurse(double purse) {
        this.purse = purse;
    }

    public Clothes[] getClothes() {
        return clothes;
    }

    public void setClothes(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public Computer[] getComp() {
        return comp;
    }

    public void setComp(Computer[] comp) {
        this.comp = comp;
    }

    public Smartphone[] getSmart() {
        return smart;
    }

    public void setSmart(Smartphone[] smart) {
        this.smart = smart;
    }

    public Sweets[] getSweets() {
        return sweets;
    }

    public void setSweets(Sweets[] sweets) {
        this.sweets = sweets;
    }

    public SweetWater[] getSweet() {
        return sweet;
    }

    public void setSweet(SweetWater[] sweet) {
        this.sweet = sweet;
    }

    public Vegetables[] getVeggie() {
        return veggie;
    }

    public void setVeggie(Vegetables[] veggie) {
        this.veggie = veggie;
    }

    public Water[] getWater() {
        return water;
    }

    public void setWater(Water[] water) {
        this.water = water;
    }
}

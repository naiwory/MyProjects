package module5Three;

public class FlowerStore {

    private double purse;

    Rose rose = new Rose();
    Tulip tulip = new Tulip();
    Daisy daisy = new Daisy();

    public SuperFlower[] sell(int roseQuantity, int tulipQuantity, int daisyQuantity){
        SuperFlower[] flowers = new SuperFlower[roseQuantity + tulipQuantity + daisyQuantity];
        for(int i = 0; i < roseQuantity; i++){
            flowers[i] = new Rose();
        }
        for(int i = roseQuantity; i < roseQuantity + tulipQuantity; i++){
            flowers[i] = new Tulip();
        }
        for(int i = roseQuantity + tulipQuantity; i < roseQuantity + tulipQuantity + daisyQuantity; i++){
            flowers[i] = new Daisy();
        }
        purse += (roseQuantity * rose.getPrice()) + (tulipQuantity * tulip.getPrice()) + (daisyQuantity * daisy.getPrice());
        return flowers;
    }

    public SuperFlower[] sellSequence(int roseQuantity, int tulipQuantity, int daisyQuantity){
        SuperFlower[] flowers = new SuperFlower[roseQuantity + tulipQuantity + daisyQuantity];
        for(int i = 0; i < roseQuantity; i++){
            flowers[i] = new Rose(100);
            for(int j = 0; i < daisyQuantity; j++){
                flowers[j] = new Daisy(70);
                for(int f = 0; f < tulipQuantity;f++){
                    flowers[f] = new Tulip(45);
                }
            }
        }
        purse += (roseQuantity * rose.getPrice()) + (tulipQuantity * tulip.getPrice()) + (daisyQuantity * daisy.getPrice());
        return flowers;
    }
}

package module5Two.practice.components;

public class Brand {
    protected String yearOfFoundation;
    protected String name;
    protected long quantityOfWorkers;
    protected byte quantityOfCountries;

    public Brand(){
        yearOfFoundation = "01.01.2001";
        name = "name";
        quantityOfWorkers = 100000;
        quantityOfCountries = 50;
    }

    public Brand(String yearOfFoundation, String name, long quantityOfWorkers, byte quantityOfCountries) {
        this.yearOfFoundation = yearOfFoundation;
        this.name = name;
        this.quantityOfWorkers = quantityOfWorkers;
        this.quantityOfCountries = quantityOfCountries;
    }

    public String getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(String yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getQuantityOfWorkers() {
        return quantityOfWorkers;
    }

    public void setQuantityOfWorkers(long quantityOfWorkers) {
        this.quantityOfWorkers = quantityOfWorkers;
    }

    public byte getQuantityOfCountries() {
        return quantityOfCountries;
    }

    public void setQuantityOfCountries(byte quantityOfCountries) {
        this.quantityOfCountries = quantityOfCountries;
    }
}

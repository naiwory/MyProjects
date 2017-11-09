package stores;

public class TechProduct extends SuperProduct{
    private String description;
    private int guaranteeDuration;

    public TechProduct(String name, double price, String description, int guaranteeDuration) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.guaranteeDuration = guaranteeDuration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getGuaranteeDuration() {
        return guaranteeDuration;
    }

    public void setGuaranteeDuration(int guaranteeDuration) {
        this.guaranteeDuration = guaranteeDuration;
    }
}

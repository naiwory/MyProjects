package module5Two.practice.products.components;

public class ExpirationDate {
    protected String dateOfProduction;
    protected double optimalTemperature;
    protected int lengthOfExpiration;

    public ExpirationDate(){
        dateOfProduction = "01.01.2001";
        optimalTemperature = 7;
        lengthOfExpiration = 30;
    }

    public ExpirationDate(String dateOfProduction, double optimalTemperature, int lengthOfExpiration) {
        this.dateOfProduction = dateOfProduction;
        this.optimalTemperature = optimalTemperature;
        this.lengthOfExpiration = lengthOfExpiration;
    }

    public String getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public double getOptimalTemperature() {
        return optimalTemperature;
    }

    public void setOptimalTemperature(double optimalTemperature) {
        this.optimalTemperature = optimalTemperature;
    }

    public int getLengthOfExpiration() {
        return lengthOfExpiration;
    }

    public void setLengthOfExpiration(int lengthOfExpiration) {
        this.lengthOfExpiration = lengthOfExpiration;
    }
}

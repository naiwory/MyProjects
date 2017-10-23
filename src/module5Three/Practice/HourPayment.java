package module5Three.Practice;

public class HourPayment extends SuperEmployee{

    protected float quantityOfDays;
    protected float quantityOfHours;
    protected float oneHourSalary;

    public HourPayment(String employeeName, String employeeSurName, float quantityOfDays,
                       float quantityOfHours, float oneHourSalary) {
        super(employeeName, employeeSurName);
        this.quantityOfDays = quantityOfDays;
        this.quantityOfHours = quantityOfHours;
        this.oneHourSalary = oneHourSalary;
    }

    @Override
    public float calcSalary() {
        float oneMonthSalary = quantityOfDays * quantityOfHours * oneHourSalary;
        return oneMonthSalary;
    }

    public float getQuantityOfDays() {
        return quantityOfDays;
    }

    public void setQuantityOfDays(float quantityOfDays) {
        this.quantityOfDays = quantityOfDays;
    }

    public float getQuantityOfHours() {
        return quantityOfHours;
    }

    public void setQuantityOfHours(float quantityOfHours) {
        this.quantityOfHours = quantityOfHours;
    }

    public float getOneHourSalary() {
        return oneHourSalary;
    }

    public void setOneHourSalary(float oneHourSalary) {
        this.oneHourSalary = oneHourSalary;
    }
}

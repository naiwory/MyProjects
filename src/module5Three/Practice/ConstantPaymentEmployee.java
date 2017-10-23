package module5Three.Practice;

public class ConstantPaymentEmployee extends SuperEmployee{

    protected float oneMonthSalary;

    public ConstantPaymentEmployee(String employeeName, String employeeSurName, float oneMonthSalary) {
        super(employeeName, employeeSurName);
        this.oneMonthSalary = oneMonthSalary;
    }

    @Override
    public float calcSalary() {
        return oneMonthSalary;
    }

    public float getOneMonthSalary() {
        return oneMonthSalary;
    }

    public void setOneMonthSalary(float oneMonthSalary) {
        this.oneMonthSalary = oneMonthSalary;
    }
}

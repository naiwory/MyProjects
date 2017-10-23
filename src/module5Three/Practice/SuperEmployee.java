package module5Three.Practice;

public abstract class SuperEmployee {

    protected String employeeName;
    protected String employeeSurName;

    public SuperEmployee(String employeeName, String employeeSurName) {
        this.employeeName = employeeName;
        this.employeeSurName = employeeSurName;
    }

    public abstract float calcSalary();

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSurName() {
        return employeeSurName;
    }

    public void setEmployeeSurName(String employeeSurName) {
        this.employeeSurName = employeeSurName;
    }
}

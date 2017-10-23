package module5Three.Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Company {

    private final String PATH = "files/employees.txt";
    private final String SEPARATOR = ";";

    protected SuperEmployee[] employees = new SuperEmployee[]{};

    public Company(SuperEmployee[] employees) {
        this.employees = employees;
    }

    public double employeeSalaries(){
        double purse = 0;
        for(SuperEmployee employee : employees){
            purse += employee.calcSalary();
        }
        return purse;
    }

    public void show(){
        for(SuperEmployee employee : employees){
            System.out.println("Employee name: " + employee.getEmployeeName());
            System.out.println("Employee surname: " + employee.getEmployeeSurName());
            if(employee instanceof HourPayment){
                HourPayment hp = (HourPayment)employee;
                System.out.println("Quantity of working days: " + hp.getQuantityOfDays());
                System.out.println("Quantity of working hours: " + hp.getQuantityOfHours());
                System.out.println("One hour salary: " + hp.getOneHourSalary());
                System.out.println("Employee salary: " + hp.calcSalary());
            }
            if(employee instanceof ConstantPaymentEmployee){
                ConstantPaymentEmployee cpe = (ConstantPaymentEmployee)employee;
                System.out.println("Employee salary: " + cpe.getOneMonthSalary());

            }
        }
    }

    public void saveEmployees(){
        try {
            FileWriter fw = new FileWriter(PATH);
            for(SuperEmployee employee : employees) {
                fw.write("Employee name: " + employee.getEmployeeName() + "\n");
                fw.write("Employee surname: " + employee.getEmployeeSurName() + "\n");
                if (employee instanceof HourPayment) {
                    HourPayment hp = (HourPayment)employee;
                    fw.write("Quantity of working days: " + hp.getQuantityOfDays() + "\n");
                    fw.write("Quantity of working hours: " + hp.getQuantityOfHours() + "\n");
                    fw.write("One hour salary: " + hp.getOneHourSalary() + "\n");
                    fw.write("Employee salary: " + hp.calcSalary() + "\n");
                }
                if (employee instanceof ConstantPaymentEmployee){
                    ConstantPaymentEmployee cpe = (ConstantPaymentEmployee)employee;
                    fw.write("Employee salary: " + cpe.getOneMonthSalary() + "\n");
                }
            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SuperEmployee[] load() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(PATH));

            for(int i = 0; i < employees.length; i++){
                String line = br.readLine();
                String[] data = line.split(SEPARATOR);

                String employeeName = data[1];
                String employeeSurName = data[2];

                if(data[0].equals(HourPayment.class.getSimpleName())){
                    employees[i] = new HourPayment(employeeName, employeeSurName, Float.parseFloat(data[3]),
                            Float.parseFloat(data[4]), Float.parseFloat(data[5]));
                }
                if(data[0].equals(ConstantPaymentEmployee.class.getSimpleName())){
                    employees[i] = new ConstantPaymentEmployee(employeeName, employeeSurName, Float.parseFloat(data[3]));
                }
            }
            return employees;
        } catch (IOException e) {
            System.out.println("Exception");
        }
        return null;
    }

    public SuperEmployee[] sortEmployees(){
        Arrays.sort(employees);
        return null;
    }

    public SuperEmployee[] sortBackEmployees(){
        return null;
    }

    public SuperEmployee[] getEmployees() {
        return employees;
    }

    public void setEmployees(SuperEmployee[] employees) {
        this.employees = employees;
    }
}

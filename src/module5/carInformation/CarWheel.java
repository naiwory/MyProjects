package module5.carInformation;

import java.util.Scanner;

public class CarWheel {
    Scanner sc = new Scanner(System.in);

    private double tireIntegrity;

    public CarWheel(){
        tireIntegrity = 1;
    }

    public CarWheel(double tireIntegrity){
        if(tireIntegrity >= 0 && tireIntegrity <= 1)
            this.tireIntegrity = tireIntegrity;
        else
            System.out.println("Вы ввели неверное значение");
    }

    public void newTire(){
        if(tireIntegrity <= 0)
            tireIntegrity = 1;
        System.out.println("Колесо успешно заменено");
    }

    public double tireWipeOff(){
        System.out.println("Введите процент, на который вы хотите стереть колесо:");
        double percent = sc.nextDouble();
        percent = (tireIntegrity * percent) / 100;
        return tireIntegrity = (tireIntegrity - percent);
    }

    public void show(){
        System.out.println("Стертость колеса составляет: " + tireIntegrity);
    }

    public double getTireIntegrity() {
        return tireIntegrity;
    }

    public void setTireIntegrity() {
        System.out.println("Введите степень стертости колеса:");
        double ti = sc.nextDouble();
        tireIntegrity = ti;
        System.out.println("Степень стертости колеса: " + tireIntegrity);
    }
}

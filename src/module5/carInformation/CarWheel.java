package module5.carInformation;

public class CarWheel {
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
    }

    public double tireWipeOff(double percent){
        percent = (tireIntegrity * percent) / 100;
        return tireIntegrity = (tireIntegrity - percent);
    }

    public void show(){
        System.out.println(tireIntegrity);
    }

    public double getTireIntegrity() {
        return tireIntegrity;
    }

    public void setTireIntegrity(double tireIntegrity) {
        this.tireIntegrity = tireIntegrity;
    }
}

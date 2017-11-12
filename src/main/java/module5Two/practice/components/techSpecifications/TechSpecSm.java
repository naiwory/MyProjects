package module5Two.practice.components.techSpecifications;

public class TechSpecSm extends TechSpec{
    protected String operativeSystem;
    protected double screenDiagonale;
    protected double batteryWorkTime;

    public TechSpecSm(){
        operativeSystem = "Android";
        screenDiagonale = 4.5;
        batteryWorkTime = 8;
    }

    public TechSpecSm(String operativeSystem, double screenDiagonale, double batteryWorkTime) {
        this.operativeSystem = operativeSystem;
        this.screenDiagonale = screenDiagonale;
        this.batteryWorkTime = batteryWorkTime;
    }

    public String getOperativeSystem() {
        return operativeSystem;
    }

    public void setOperativeSystem(String operativeSystem) {
        this.operativeSystem = operativeSystem;
    }

    public double getScreenDiagonale() {
        return screenDiagonale;
    }

    public void setScreenDiagonale(double screenDiagonale) {
        this.screenDiagonale = screenDiagonale;
    }

    public double getBatteryWorkTime() {
        return batteryWorkTime;
    }

    public void setBatteryWorkTime(double batteryWorkTime) {
        this.batteryWorkTime = batteryWorkTime;
    }
}

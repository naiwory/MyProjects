package module5.carInformation;

import java.util.Scanner;

public class Car {
    Scanner sc = new Scanner(System.in);

    private String dateOfConstruction;
    private String typeOfEngine;
    private double maxSpeed;
    private double accelerationTime100km;
    private int passengers;
    private int currentPassengers = 4;
    private double currentSpeed;
    private CarWheel[] carWheel = new CarWheel[] {new CarWheel(), new CarWheel(), new CarWheel(), new CarWheel()};
    private CarDoor[] carDoor = new CarDoor[]{new CarDoor(), new CarDoor(), new CarDoor(), new CarDoor()};

    public Car(String dateOfConstruction){
       this.dateOfConstruction = dateOfConstruction;
    }

    public Car(String typeOfEngine, double maxSpeed, double accelerationTime100km, int passengers, int currentPassengers, double currentSpeed){
        this.typeOfEngine = typeOfEngine;
        this.maxSpeed = maxSpeed;
        this.accelerationTime100km = accelerationTime100km;
        this.passengers = passengers;
        this.currentPassengers = currentPassengers;
        this.currentSpeed = currentSpeed;
    }

    public int onePassengerMore(){ return currentPassengers += 1; }

    public int onePassengerLess(){
        return currentPassengers -= 1;
    }

    public int noMorePassengers(){
        return currentPassengers = 0;
    }

    public boolean doorByIndex(){
        System.out.println("Введите значение индекса:");
        int i = sc. nextInt();
        return carDoor[i].isDoors() && carDoor[i].isWindows();
    }

    public double wheelByIndex(){
        System.out.println("Введите значение индекса:");
        int i = sc. nextInt();
        return carWheel[i].getTireIntegrity();
    }

    public void wheelsOffTheCar(){
        for(int i = 0; i <= carWheel.length; i++)
            carWheel[i] = null;
        System.out.println("Колеса сняты");
    }

    public CarWheel moreWheels(){
        System.out.println("Введите количество новых колес:");
        int x = sc.nextInt();
        CarWheel[] cw = new CarWheel[carWheel.length + x];
        for(int i = 0; i < carWheel.length; i++)
            cw[i] = carWheel[i];
            return null;
    }

    private double currentMaxSpeed;
    public double currentMaxSpeed() {
        if (currentPassengers == 0)
            return currentMaxSpeed = 0;

        double min = carWheel[0].getTireIntegrity();
        for (int i = 1; i < carWheel.length; i++) {
            if (carWheel[i].getTireIntegrity() < min) {
                min = carWheel[i].getTireIntegrity();
            }
        }
        return currentMaxSpeed = maxSpeed * min;
    }

    public void show(){
        System.out.println("Дата производства автомобиля - " + dateOfConstruction);
        System.out.println("Тип двигателя - " + typeOfEngine);
        System.out.println("Максимальная скорость - " + maxSpeed);
        System.out.println("Время разгона до 100 км - " + accelerationTime100km);
        System.out.println("Количество вмещаемых пассажиров - " + passengers);
        System.out.println("Текущее количество пассажиров - " + currentPassengers);
        System.out.println("Текущая скорость - " + currentSpeed);

        for(CarWheel a : carWheel){
            System.out.print(a.getTireIntegrity() + " ");
        }
        System.out.println();
        for(CarDoor a : carDoor){
            System.out.print(a.isDoors() + " ");
        }
        System.out.println();
        System.out.println("Текущая максимальная скорость - " + currentMaxSpeed);
    }

    public String getDateOfConstruction(){
        return dateOfConstruction;
    }

    public void setDateOfConstruction() {
        System.out.println("Введите дату производства автомобиля:");
        String doc = sc.nextLine();
        dateOfConstruction = doc;
        System.out.println("Дата приозводства автомобиля: " + dateOfConstruction);
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine() {
        System.out.println("Введите тип двигателя:");
        String tof = sc.nextLine();
        typeOfEngine = tof;
        System.out.println("Тип двигателя: " + typeOfEngine);
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed() {
        System.out.println("Введите максимальную скорость:");
        double ms = sc.nextDouble();
        maxSpeed = ms;
        System.out.println("Максимальная скорость: " + maxSpeed);
    }

    public double getAccelerationTime100km() {
        return accelerationTime100km;
    }

    public void setAccelerationTime100km() {
        System.out.println("Введите время разгона до 100 км:");
        double at = sc.nextDouble();
        accelerationTime100km = at;
        System.out.println("Время разгона до 100 км: " + accelerationTime100km);
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers() {
        System.out.println("Введите общее число пассажиров:");
        int p = sc.nextInt();
        passengers = p;
        System.out.println("Общее число пассажиров: " + passengers);
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public void setCurrentPassengers() {
        System.out.println("Введите текущее число пассажиров:");
        int cp = sc.nextInt();
        currentPassengers = cp;
        System.out.println("Текущее число пассажиров: " + currentPassengers);
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed() {
        System.out.println("Введите текущую скорость:");
        double cs = sc.nextDouble();
        currentSpeed = cs;
        System.out.println("Текущая скорость: " + currentSpeed);
    }

    public CarWheel[] getCarWheel() {
        return carWheel;
    }

    public void setCarWheel(CarWheel[] carWheel) {

        this.carWheel = carWheel;
    }

    public CarDoor[] getCarDoor() {
        return carDoor;
    }

    public void setCarDoor(CarDoor[] carDoor) {
        this.carDoor = carDoor;
    }

    public double getCurrentMaxSpeed() {
        return currentMaxSpeed;
    }

}

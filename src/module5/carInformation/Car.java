package module5.carInformation;

public class Car {
    private String typeOfEngine;
    private double maxSpeed;
    private double accelerationTime100km;
    private int passengers;
    private int currentPassengers;
    private double currentSpeed;
    private CarWheel[] carWheel = new CarWheel[] {new CarWheel(), new CarWheel(), new CarWheel(), new CarWheel()};
    private CarDoor[] carDoor = new CarDoor[]{new CarDoor(), new CarDoor(), new CarDoor(), new CarDoor()};

    public Car(final String dateOfConstruction){

    }

    public Car(String typeOfEngine, double maxSpeed, double accelerationTime100km, int passengers, int currentPassengers, double currentSpeed){
        this.typeOfEngine = typeOfEngine;
        this.maxSpeed = maxSpeed;
        this.accelerationTime100km = accelerationTime100km;
        this.passengers = passengers;
        this.currentPassengers = currentPassengers;
        this.currentSpeed = currentSpeed;
    }

    public int onePassengerMore(){
        return currentPassengers++;
    }

    public int onePassengerLess(){
        return currentPassengers--;
    }

    public int noMorePassengers(){
        return currentPassengers = 0;
    }

    public CarDoor doorByIndex(int i){
        return carDoor[i];
    }

    public CarWheel wheelByIndex(int i){
        return carWheel[i];
    }

    public void wheelsOffTheCar(){
        for(int i = 0; i <= carWheel.length; i++){
            carWheel[i] = null;
        }
    }

    public CarWheel moreWheels(int x){
        for()
    }

    double currentMaxSpeed;
    public double currentMaxSpeed(){
        if(currentPassengers == 0)
            return currentMaxSpeed = 0;

        double min = carWheel[0].getTireIntegrity();
        for(int i = 1; i < carWheel.length; i++) {
            if(carWheel[i].getTireIntegrity() < min) {
                min = carWheel[i].getTireIntegrity();
            }
        }
        return currentMaxSpeed = maxSpeed * min;

    }

    public void show(){
        System.out.println();
        System.out.println(typeOfEngine);
        System.out.println(maxSpeed);
        System.out.println(accelerationTime100km);
        System.out.println(passengers);
        System.out.println(currentPassengers);
        System.out.println(currentSpeed);

        for(CarWheel a : carWheel){
            System.out.print(a);
        }
        System.out.println();
        for(CarDoor a : carDoor){
            System.out.print(a);
        }
        System.out.println(currentMaxSpeed);
    }

}

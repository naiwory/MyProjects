package module5.carInformation;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите, с каким объектом вы хотите взаимодействовать: Car, CarDoor или CarWheel?");
        String carMain = sc.nextLine();
        switch(carMain){
            case "Car":
                System.out.println("Введите дату производства автомобиля:");
            String doc = sc.nextLine();
            Car c = new Car(doc);
            System.out.println("Выберите один из методов данного объекта: onePassengerMore, onePassengerLess, " +
                    "noMorePassengers, doorByIndex, wheelByIndex, wheelsOffTheCar, moreWheels, currentMaxSpeed, show, " +
                    "getDateOfConstruction, getTypeOfEngine, setTypeOfEngine, getMaxSpeed, setMaxSpeed, getAccelerationTime100km, " +
                    "setAccelerationTime100km, getPassengers, setPassengers, getCurrentPassengers, setCurrentPassengers, getCurrentSpeed, " +
                    "setCurrentSpeed, getCarWheel, setCarWheel, getCarDoor, setCarDoor, getCurrentMaxSpeed");
            String car = sc.nextLine();
            switch(car) {
                case "onePassengerMore":
                    System.out.println(c.onePassengerMore());
                    break;
                case "onePassengerLess":
                    System.out.println(c.onePassengerLess());
                    break;
                case "noMorePassengers":
                    System.out.println(c.noMorePassengers());
                    break;
                case "doorByIndex":
                    System.out.println(c.doorByIndex());
                    break;
                case "wheelByIndex":
                    System.out.println(c.wheelByIndex());
                    break;
                case "wheelsOffTheCar":
                    c.wheelsOffTheCar();
                    break;
                case "moreWheels":
                    System.out.println(c.moreWheels());
                    break;
                case "currentMaxSpeed":
                    System.out.println(c.currentMaxSpeed());
                    break;
                case "show":
                    c.show();
                    break;
                case "getDateOfConstruction":
                    System.out.println(c.getDateOfConstruction());
                    break;
                case "setDateOfConstruction":
                    c.setDateOfConstruction();
                    break;
                case "getTypeOfEngine":
                    System.out.println(c.getTypeOfEngine());
                    break;
                case "setTypeOfEngine":
                    c.setTypeOfEngine();
                    break;
                case "getMaxSpeed":
                    System.out.println(c.getMaxSpeed());
                    break;
                case "setMaxSpeed":
                    c.setMaxSpeed();
                    break;
                case "getAccelerationTime100km":
                    System.out.println(c.getAccelerationTime100km());
                    break;
                case "setAccelerationTime100km":
                    c.setAccelerationTime100km();
                    break;
                case "getPassengers":
                    System.out.println(c.getPassengers());
                    break;
                case "setPassengers":
                    c.setPassengers();
                    break;
                case "getCurrentPassengers":
                    System.out.println(c.getCurrentPassengers());
                    break;
                case "setCurrentPassengers":
                    c.setCurrentPassengers();
                    break;
                case "getCurrentSpeed":
                    System.out.println(c.getCurrentSpeed());
                    break;
                case "setCurrentSpeed":
                    c.setCurrentSpeed();
                    break;
                case "getCarWheel":
                    System.out.println(c.getCarWheel());
                    break;
                //case "setCarWheel":
                //c.setCarWheel();
                //break;
                case "getCarDoor":
                    System.out.println(c.getCarDoor());
                    break;
                //case "setCarDoor":
                //c. setCarDoor();
                //break;
                case "getCurrentMaxSpeed":
                    System.out.println(c.getCurrentMaxSpeed());
                    break;
                default:
                    System.out.println("Вы ввели неверное значение, перезапустите программу и попробуйте еще раз");
                    break;
            }
            break;
            case "CarDoor":
            CarDoor cd = new CarDoor();
            System.out.println("Выберите один из методов данного объекта: openDoors, closeDoors, openCloseDoors, openWindows, closeWindows," +
                    " openCloseWindows, show, isDoors, setDoors, isWindows, setWindows");
            String carDoor = sc.nextLine();
            switch(carDoor) {
                case "openDoors":
                    cd.openDoors();
                    break;
                case "closeDoors":
                    cd.closeDoors();
                    break;
                case "openCloseDoors":
                    cd.openCloseDoors();
                    break;
                case "openWindows":
                    cd.openWindows();
                    break;
                case "closeWindows":
                    cd.closeWindows();
                    break;
                case "openCloseWindows":
                    cd.openCloseWindows();
                    break;
                case "show":
                    cd.show();
                    break;
                case "isDoors":
                    System.out.println(cd.isDoors());
                    break;
                case "setDoors":
                    cd.setDoors();
                    break;
                case "isWindows":
                    System.out.println(cd.isWindows());
                    break;
                case "setWindows":
                    cd.setWindows();
                    break;
                default:
                    System.out.println("Вы ввели неверное значение, перезапустите программу и попробуйте еще раз");
                    break;
            }
            break;
            case "CarWheel":
            CarWheel cw = new CarWheel();
            System.out.println("Выберите один из методов данного объекта: newTire, tireWipeOff, show, getTireIntegrity, setTireIntegrity");
            String carWheel = sc.nextLine();
            switch(carWheel) {
                case "newTire":
                    cw.newTire();
                    break;
                case "tireWipeOff":
                    System.out.println(cw.tireWipeOff());
                    break;
                case "show":
                    cw.show();
                    break;
                case "getTireIntegrity":
                    System.out.println(cw.getTireIntegrity());
                    break;
                case "setTireIntegrity":
                    cw.setTireIntegrity();
                    break;
                default:
                    System.out.println("Вы ввели неверное значение, перезапустите программу и попробуйте еще раз");
                    break;
            }
            default:
                System.out.println("Вы ввели неверное значение, перезапустите программу и попробуйте еще раз");
                break;
        }
    }
}

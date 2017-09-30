package module5.carInformation;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите, с каким объектом вы хотите взаимодействовать: Car, CarDoor или CarWheel?");
        String carMain = sc.nextLine();
        if(carMain == "Car"){
            //System.out.println("Введите дату производства автомобиля:");
            //String doc = sc.nextLine();
            Car c = new Car();
            System.out.println("Выберите один из методов данного объекта: onePassengerMore, onePassengerLess, " +
                    "noMorePassengers, doorByIndex, wheelByIndex, wheelsOffTheCar, moreWheels, currentMaxSpeed, show, " +
                    "getDateOfConstruction, getTypeOfEngine, setTypeOfEngine, getMaxSpeed, setMaxSpeed, getAccelerationTime100km, " +
                    "setAccelerationTime100km, getPassengers, setPassengers, getCurrentPassengers, setCurrentPassengers, getCurrentSpeed, " +
                    "setCurrentSpeed, getCarWheel, setCarWheel, getCarDoor, setCarDoor, getCurrentMaxSpeed");
            String car = sc.nextLine();
            if(car == "onePassengerMore")
                System.out.println(c.onePassengerMore());
            else if(car == "onePassengerLess")
                System.out.println(c.onePassengerLess());
            else if(car == "noMorePassengers")
                System.out.println(c.noMorePassengers());
            else if(car == "doorByIndex")
                System.out.println(c.doorByIndex());
            else if(car == "wheelByIndex")
                System.out.println(c.wheelByIndex());
            else if(car == "wheelsOffTheCar")
                c.wheelsOffTheCar();
            else if(car == "moreWheels")
                System.out.println(c.moreWheels());
            else if(car == "currentMaxSpeed")
                System.out.println(c.currentMaxSpeed());
            else if(car == "show")
                c.show();
            //else if(car == "getDateOfConstruction")
                //System.out.println(c.getDateOfConstruction());
            else if(car == "getTypeOfEngine")
                System.out.println(c.getTypeOfEngine());
            else if(car == "setTypeOfEngine")
                c.setTypeOfEngine();
            else if(car == "getMaxSpeed")
                System.out.println(c.getMaxSpeed());
            else if(car == "setMaxSpeed")
                c.setMaxSpeed();
            else if(car == "getAccelerationTime100km")
                System.out.println(c.getAccelerationTime100km());
            else if(car == "setAccelerationTime100km")
                c.setAccelerationTime100km();
            else if(car == "getPassengers")
                System.out.println(c.getPassengers());
            else if(car == "setPassengers")
                c.setPassengers();
            else if(car == "getCurrentPassengers")
                System.out.println(c.getCurrentPassengers());
            else if(car == "setCurrentPassengers")
                c.setCurrentPassengers();
            else if(car == "getCurrentSpeed")
                System.out.println(c.getCurrentSpeed());
            else if(car == "setCurrentSpeed")
                c.setCurrentSpeed();
            else if(car == "getCarWheel")
                System.out.println(c.getCarWheel());
            //else if(car == "setCarWheel")
                //c.setCarWheel();
            else if(car == "getCarDoor")
                System.out.println(c.getCarDoor());
            //else if(car == "setCarDoor")
                //c. setCarDoor();
            else if(car == "getCurrentMaxSpeed")
                System.out.println(c.getCurrentMaxSpeed());
            else
                System.out.println("Вы ввели неверное значение, перезапустите программу и попробуйте еще раз");
        }else if(carMain == "CarDoor"){
            CarDoor cd = new CarDoor();
            System.out.println("Выберите один из методов данного объекта: openDoors, closeDoors, openCloseDoors, openWindows, closeWindows," +
                    " openCloseWindows, show, isDoors, setDoors, isWindows, setWindows");
            String carDoor = sc.nextLine();
            if(carDoor == "openDoors")
                cd.openDoors();
            else if(carDoor == "closeDoors")
                cd.closeDoors();
            else if(carDoor == "openCloseDoors")
                cd.openCloseDoors();
            else if(carDoor == "openWindows")
                cd.openWindows();
            else if(carDoor == "closeWindows")
                cd.closeWindows();
            else if(carDoor == "openCloseWindows")
                cd.openCloseWindows();
            else if(carDoor == "show")
                cd.show();
            else if(carDoor == "isDoors")
                System.out.println(cd.isDoors());
            else if(carDoor == "setDoors")
                cd.setDoors();
            else if(carDoor == "isWindows")
                System.out.println(cd.isWindows());
            else if(carDoor == "setWindows")
                cd.setWindows();
            else
                System.out.println("Вы ввели неверное значение, перезапустите программу и попробуйте еще раз");
        }else if(carMain == "CarWheel"){
            CarWheel cw = new CarWheel();
            System.out.println("Выберите один из методов данного объекта: newTire, tireWipeOff, show, getTireIntegrity, setTireIntegrity");
            String carWheel = sc.nextLine();
            if(carWheel == "newTire")
                cw.newTire();
            else if(carWheel == "tireWipeOff")
                System.out.println(cw.tireWipeOff());
            else if(carWheel == "show")
                cw.show();
            else if(carWheel == "getTireIntegrity")
                System.out.println(cw.getTireIntegrity());
            else if(carWheel == "setTireIntegrity")
                cw.setTireIntegrity();
            else
                System.out.println("Вы ввели неверное значение, перезапустите программу и попробуйте еще раз");
        }
    }
}

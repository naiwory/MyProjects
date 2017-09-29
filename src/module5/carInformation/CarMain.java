package module5.carInformation;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите, с каким объектом вы хотите взаимодействовать: Car, CarDoor или CarWheel?");
        String carMain = sc.nextLine();
        if(carMain == "Car"){
            Car c = new Car("");
            System.out.println("Выберите один из методов данного объекта: onePassengerMore, onePassengerLess, noMorePassengers, doorByIndex, wheelByIndex, wheelsOffTheCar, moreWheels, currentMaxSpeed или show");
            String car = sc.nextLine();
            if(car == "onePassengerMore")
                c.onePassengerMore();
            else if(car == "onePassengerLess")
                c.onePassengerLess();
            else if(car == "noMorePassengers")
                c.noMorePassengers();
            else if(car == "doorByIndex")
                c.doorByIndex();
            else if(car == "wheelByIndex")
                c.wheelByIndex();
            else if(car == "wheelsOffTheCar")
                c.wheelsOffTheCar();
            else if(car == "moreWheels")
                c.moreWheels();
            else if(car == "currentMaxSpeed")
                c.currentMaxSpeed();
            else if(car == "show")
                c.show();
            else
                System.out.println("Вы ввели неверное значение, перезапустите программу и попробуйте еще раз");
        }else if(carMain == "CarDoor"){
            CarDoor cd = new CarDoor();
            System.out.println("Выберите один из методов данного объекта: openDoors, closeDoors, openCloseDoors, openWindows, closeWindows, openCloseWindows, show, isDoors, setDoors, isWindows, setWindows");
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
                cd.isDoors();
            else if(carDoor == "setDoors")
                cd.setDoors();
            else if(carDoor == "isWindows")
                cd.isWindows();
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
                cw.tireWipeOff();
            else if(carWheel == "show")
                cw.show();
            else if(carWheel == "getTireIntegrity")
                cw.getTireIntegrity();
            else if(carWheel == "setTireIntegrity")
                cw.setTireIntegrity();
            else
                System.out.println("Вы ввели неверное значение, перезапустите программу и попробуйте еще раз");
        }
    }
}

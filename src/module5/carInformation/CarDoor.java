package module5.carInformation;

import java.util.Scanner;

public class CarDoor {
    Scanner sc = new Scanner(System.in);

    private boolean doors;
    private boolean windows;

    public CarDoor(){
        doors = false;
        windows = false;
    }

    public CarDoor(boolean doors, boolean windows){
        this.doors = doors;
        this.windows = windows;
    }

    public void openDoors(){
        doors = true;
        System.out.println("Двери открыты");
    }

    public void closeDoors(){
        doors = false;
        System.out.println("Двери закрыты");
    }

    public void openCloseDoors(){
        if(doors = true) {
            doors = false;
            System.out.println("Двери закрыты");
        }
        else if(doors = false) {
            doors = true;
            System.out.println("Двери открыты");
        }
    }

    public void openWindows(){
        windows = true;
        System.out.println("Окна открыты");
    }

    public void closeWindows(){
        windows = false;
        System.out.println("Окна закрыты");
    }

    public void openCloseWindows(){
        if(windows = true) {
            windows = false;
            System.out.println("Окна закрыты");
        }
        else if(windows = false) {
            windows = true;
            System.out.println("Окна открыты");
        }
    }

    public void show(){
        if(doors = true)
            System.out.println("Двери открыты");
        else if(doors = false)
            System.out.println("Двери закрыты");
        if(windows = true)

            System.out.println("Окна открыты");
        else if(windows = false)
            System.out.println("Окна закрыты");
    }

    public boolean isDoors() {
        return doors;
    }

    public void setDoors() {
        System.out.println("Двери открыты или закрыты? Введите true или false:");
        boolean d = sc.nextBoolean();
        doors = d;
        System.out.println(doors);
    }

    public boolean isWindows() {
        return windows;
    }

    public void setWindows() {
        System.out.println("Окна открыты или закрыты? Введите true или false:");
        boolean w = sc.nextBoolean();
        windows = w;
        System.out.println(windows);
    }


}

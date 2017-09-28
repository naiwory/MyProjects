package module5.carInformation;

public class CarDoor {
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
    }

    public void closeDoors(){
        doors = false;
    }

    public void openCloseDoors(){
        if(doors = true) doors = false;
        else if(doors = false) doors = true;
    }

    public void openWindows(){
        windows = true;
    }

    public void closeWindows(){
        windows = false;
    }

    public void openCloseWindows(){
        if(windows = true) windows = false;
        else if(windows = false) windows = true;
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

    public void setDoors(boolean doors) {
        this.doors = doors;
    }

    public boolean isWindows() {
        return windows;
    }

    public void setWindows(boolean windows) {
        this.windows = windows;
    }


}

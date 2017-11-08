package module5Two.practice.products.components.memory;

public class Memory {
    protected int capacity;
    protected String typeOfMemory;

    public Memory(){
        capacity = 8;
        typeOfMemory = "DDR1";
    }

    public Memory(int capacity, String typeOfMemory) {
        this.capacity = capacity;
        this.typeOfMemory = typeOfMemory;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTypeOfMemory() {
        return typeOfMemory;
    }

    public void setTypeOfMemory(String typeOfMemory) {
        this.typeOfMemory = typeOfMemory;
    }
}

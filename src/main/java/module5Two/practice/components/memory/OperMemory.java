package module5Two.practice.components.memory;

public class OperMemory extends Memory {
    public OperMemory() {
        capacity = 8;
        typeOfMemory = "DDR1";
    }

    public OperMemory(int capacity, String typeOfMemory) {
        super(capacity, typeOfMemory);
    }
}

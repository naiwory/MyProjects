package module5Two.practice.products.components.memory;

public class VideoMemory extends Memory {
    public VideoMemory(){
        capacity = 8;
        typeOfMemory = "DDR1";
    }

    public VideoMemory(int capacity, String typeOfMemory) {
        super(capacity, typeOfMemory);
    }
}

package module6;

public class MyQueueArray<T> {
    private int size;
    private T[] array;

    public MyQueueArray(){
        size = Integer.MAX_VALUE;
    }

    public MyQueueArray(int size, T[] array) {
        this.size = size;
        this.array = array;
    }

    public void add(T value){
        array[array.length - 1] = value;
        size++;
    }

    public void remove(int index){
        array[index] = null;
        size--;
    }

    public void clear(){
        for (int i = 0; i < size; i++)
            array[i] = null;

        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek(){
        if(size == 0)
            return null;
        return array[0];
    }

    public T poll(){
        if(size == 0)
            return null;
        return array[0];
    }

}

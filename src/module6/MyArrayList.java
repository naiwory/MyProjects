package module6;

public class MyArrayList<T> {

    private int size;
    private T[] array;

    public MyArrayList(){
        size = Integer.MAX_VALUE;
    }

    public MyArrayList(int size, T[] array) {
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

    public T get(int index){
        return array[index];
    }

    }

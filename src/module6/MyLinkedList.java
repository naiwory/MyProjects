package module6;

public class MyLinkedList<T> {

    private int size;
    MyNode<T> first;
    MyNode<T> last;

    public MyLinkedList(){
        size = Integer.MAX_VALUE;
    }

    public MyLinkedList(int size, MyNode<T> first, MyNode<T> last) {
        this.size = size;
        this.first = first;
        this.last = last;
    }

    public void add(T value){
        last = (MyNode<T>) value;
        size++;
    }

    public void remove(int index){

    }

    public void clear(){
        for (MyNode<T> x = first; x != null; ) {
            MyNode<T> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public MyNode<T> get(int index){
        return null;
    }


    private static class MyNode<E> {
        E item;
        MyNode<E> next;
        MyNode<E> prev;

        MyNode(MyNode<E> prev, E element, MyNode<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}

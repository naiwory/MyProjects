package module6.homework;

public class MyHashMap<T, K> {

    private int size;
    private MyNode<T,K> first;
    private MyNode<T,K> last;

    public MyHashMap(){
        size = Integer.MAX_VALUE;
    }

    public MyHashMap(int size, MyNode<T, K> first, MyNode<T, K> last) {
        this.size = size;
        this.first = first;
        this.last = last;
    }

    public void put(T key, K value){
        last = (MyNode<T, K>) key;
        last = (MyNode<T, K>) value;
        last.next = null;
        size++;
    }

    public void remove(T key){
        MyNode<T, K>  node = new MyNode();
        if(node.key == key)
            node = null;
        size--;
    }

    public void clear(){
        for (MyNode<T, K> x = first; x != null; ) {
            MyNode<T, K> next = x.next;
            x.key = null;
            x.element = null;
            x.next = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public K get(T key){
        MyNode<T, K>  node = new MyNode();
        if(node.key == key)
        return node.element;
        return null;
    }

    private static class MyNode<T, K> {
        int count = 0;
        T key;
        K element;
        MyNode<T, K> next;

        MyNode(){
            count++;
        }

        MyNode(T key, K element, MyNode<T, K> next) {
            this.key = key;
            this.element = element;
            this.next = next;
            count++;
        }
    }
}

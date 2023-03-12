import java.util.Arrays;
import java.util.StringJoiner;

public class MyQueue<E> {
    private E[] arr;
    private int size;
    private int head; // індекс першого елемента
    private int tail; // індекс наступного за останнім елементом
    public MyQueue() {
        arr = (E[]) new Object[10]; // початковий розмір масиву 10
        size = 0;
        head = 0;
        tail = 0;
    }
    //додає елемент в кінець:
    public void add(E value){
        ifNeedNewSize();
        arr[tail]=value;
        tail = (tail + 1) % arr.length;
        size++;
    }
    private void ifNeedNewSize(){
        if(size==arr.length){
            System.out.println("Process is successful, size: "+ size + ", arr.length is: " + arr.length);
            int newSize = (arr.length*3)/2;
            arr = Arrays.copyOf(arr, newSize);
        }
    }
    @Override
    public String toString(){
        StringJoiner result1 = new StringJoiner(", ");
        for(int i =0; i<size; i++){
            result1.add(arr[i].toString());
        }
        return "["+ result1 +"]";
    }
    //очищає колекцію:
    void clear(){
        Arrays.fill(arr, null);
        size = 0;
        head = 0;
        tail = 0;
    }
    //повертає розмір колекції:
    public int size(){
        return size;
    }
    //повертає перший елемент з черги:
    public E peek(){
        if (size == 0) {
            return null;
        }
        return arr[head];
    }
    //повертає перший елемент з черги і видаляє його з колекції:
    public E poll(){
        if (size == 0) {
            return null;
        }
        E value = arr[head];
        arr[head] = null;
        head = (head + 1) % arr.length;
        size--;
        return value;
    }
}









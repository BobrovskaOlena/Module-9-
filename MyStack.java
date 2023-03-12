import java.util.Arrays;
public class MyStack<T> {
    private int size;
    private T[] elements;
    public MyStack() {
        size = 0;
       elements=(T[]) new Object[10];}
    //додає елемент в кінець:
    public void push(T value) {
        ifNeedNewSize();
        elements[size] = value;
        size++;
        reverse();
    }
    void reverse() {
        int a = 0;
        Object[] elements3 = new Object[elements.length];
        for (int i = elements.length - 1; i >= 0; i--) {
            elements3[a] = elements[i];
            a++;
        }
        System.out.println(Arrays.toString(elements3));
    }

    private void ifNeedNewSize() {
        if (size == elements.length) {
            System.out.println("The resizing process is successful");
            int newSize=(elements.length * 3) / 2;
            T[] newArray = (T[]) new Object[newSize];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }
    }

    //видаляє елемент за індексом:
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        T removed = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        return removed;
    }

    //очищає колекцію
    void clear() {
        size = 0;
        elements = (T[]) new Object[10];
    }

    //повертає розмір колекції:
    public int size() {
        return size;
    }

    //повертає перший елемент стеку:
    public T peek() {
        if (size == 0) {
            return null;
        }
        return elements[size - 1];
    }
        //повертає перший елемент стеку та видаляє його з колекції:
        public T pop(){
            T value = peek();
            if (size > 0) {
                size--;
            }
            return value;
        }
    }


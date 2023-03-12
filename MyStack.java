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
    public remove(int index) {
        Object[] newElements = new Object[elements.length - 1];
        int b = 0;
        for (int i = elements.length - 1; i >= 0; i--) {
            if (i != index) {
                newElements[b] = elements[i];
                b++;
            }
        }
        System.out.println(Arrays.toString(newElements));
    }

    //очищає колекцію
    void clear() {
        Arrays.fill(elements, null);
        System.out.println("After clearing Array:");
        elements = new Object[elements.length];
        System.out.println(Arrays.toString(elements));
    }

    //повертає розмір колекції:
    public int size() {
        return elements.length;
    }

    //повертає перший елемент стеку:
    public Object peek() {
        if (elements[number] == null) {
         number--;}
            return elements[number];
        }
        //повертає перший елемент стеку та видаляє його з колекції:
        public Object pop(){
        Object[] element1 = new Object[elements.length-1];
        int f = 0;
        for(int i = 1; i<elements.length; i++){
            element1[f] = elements[i];
            f++;
        }
        return "Element 1 : " + elements[0]+"new Array: "+Arrays.toString(element1);
    }

}







    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E removed = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
        return removed;
    }

    public void clear() {
        size = 0;
        array = (E[]) new Object[10];
    }

    public int size() {
        return size;
    }

    public E peek() {
        if (size == 0) {
            return null;
        }
        return array[size - 1];
    }

    public E pop() {
        E value = peek();
        if (size > 0) {
            size--;
        }
        return value;
    }
}
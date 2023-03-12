import java.util.StringJoiner;
public class MyArrayList<T> {
    private static final int INIT_NUMBER = 7;
    private int size = 0;
    private Object[] array;

    public MyArrayList(){
        array = new Object[INIT_NUMBER];
    }

    //додає елемент в кінець:
    public void add(T value){
        ifNeedNewSize();
        array[size]=value;
        size++;
    }
    private void ifNeedNewSize(){
        if(size==array.length){
            System.out.println("The resizing process is successful, size: "+ size + ", numbering.length is: " + array.length);
            int newNumber = (array.length*3)/2;
            Object[] newNumbering = new Object[newNumber];
            System.arraycopy(array, 0, newNumbering, 0, array.length);
            array=newNumbering;
            }
        }
    //повертає елемент за індексом
    public T get(int index){
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (T) array[index];
    }
    //повертає розмір колекції
    public int size(){
        return size;
    }

    @Override
    public String toString(){
        StringJoiner result = new StringJoiner(", ");
        for(int i =0; i<size; i++){
            result.add(array[i].toString());
        }
        return "["+ result +"]";
    }

    //видаляє елемент із вказаним індексом:
    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        T arr = (T) array[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(array, index + 1, array, index, numMoved);
        }
        array[--size] = null;
        return arr;
    }

    //очищає колекцію:
    public void clear(){
            array = new Object[INIT_NUMBER];
            size = 0;
        }
    }







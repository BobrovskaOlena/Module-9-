import java.util.StringJoiner;
import java.util.*;
public class MyArrayList<T> {
    private static final int INIT_NUMBER = 7;
    private Object[] array;
    private int counter;

    public MyArrayList(){
        array = new Object[INIT_NUMBER];
    }

    //додає елемент в кінець:
    public void add(T value){
        ifNeedNewSize();
        array[counter]=value;
        counter++;
    }
    private void ifNeedNewSize(){
        if(counter==array.length){
            System.out.println("The resizing process is successful, number: "+ counter + ", numbering.length is: " + array.length);
            int newNumber = (array.length*3)/2;
            Object[] newNumbering = new Object[newNumber];
            System.arraycopy(array, 0, newNumbering, 0, array.length);
            array=newNumbering;
        }
    }
    //повертає елемент за індексом
    public Object get(int index){
        return array[index];
    }
    //повертає розмір колекції
    public int size(){
        return counter;
    }

    @Override
    public String toString(){
        StringJoiner result = new StringJoiner(", ");
        for(int i =0; i<counter; i++){
            result.add(array[i].toString());
        }
        return "["+ result +"]";
    }

    //видаляє елемент із вказаним індексом:
    public void remove(int index1) {
        Object[] newNumbering1 = null;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i].equals(index1)){
                newNumbering1 = new Object[array.length-1];
                System.arraycopy(array, 0, newNumbering1, 0, i);
                if (array.length - 1 - i >= 0)
                    System.arraycopy(array, i + 1, newNumbering1, i, array.length - 1 - i);
                break;
            }
        }
        System.out.println("New Array after deleting element = "+index1+" and shifting: "+ Arrays.toString(newNumbering1));
    }

    //очищає колекцію:
    public void clear(){
        System.out.println("After clearing Array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        System.out.println(Arrays.toString(array));
    }
}


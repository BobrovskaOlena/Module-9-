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
    public void remove(int index) {
        Object[] afterRemove = new Object[array.length-1];
        int d = 0;
        for(int i = 0; i<array.length;i++){
            if(i==index){
                continue;
            }
            afterRemove[d]=array[i];
            d++;
        }
        System.out.println(Arrays.toString(afterRemove));
    }

    //очищає колекцію:
    public void clear(){
        System.out.println("After clearing Array:");
        Arrays.fill(array, null);
        int a=0;
        Object[] afterClear = new Object[a];
        for (Object o : array) {
            if (o == null) {
                a += 0;
            } else {
                afterClear[a] = o;
                a++;
            }
        }
        System.out.println(Arrays.toString(afterClear));
        System.out.println("Size after clear: " + afterClear.length);
    }
}


import java.util.StringJoiner;
import java.util.*;
public class MyArrayList<T> {
    private static final int INIT_NUMBER = 7;
    private Object[] numbering;
    private int number;

    public MyArrayList(){
        numbering = new Object[INIT_NUMBER];
    }

    //додає елемент в кінець:
    public void add(T value){
        ifNeedNewSize();
        numbering[number]=value;
        number++;
    }
    private void ifNeedNewSize(){
        if(number==numbering.length){
            System.out.println("The resizing process is successful, number: "+ number + ", numbering.length is: " + numbering.length);
            int newNumber = (numbering.length*3)/2;
            Object[] newNumbering = new Object[newNumber];
            System.arraycopy(numbering, 0, newNumbering, 0, numbering.length);
            numbering=newNumbering;
        }
    }
    //повертає елемент за індексом
    public Object get(int index){
        return numbering[index];
    }
    //повертає розмір колекції
    public int size(){
        return number;
    }

    @Override
    public String toString(){
        StringJoiner result = new StringJoiner(", ");
        for(int i =0; i<number; i++){
            result.add(numbering[i].toString());
        }
        return "["+ result +"]";
    }

    //видаляє елемент із вказаним індексом:
    public void remove(int index1) {
        Object[] newNumbering1 = null;
        for (int i = 0; i < numbering.length-1; i++) {
            if(numbering[i].equals(index1)){
                newNumbering1 = new Object[numbering.length-1];
                System.arraycopy(numbering, 0, newNumbering1, 0, i);
                if (numbering.length - 1 - i >= 0)
                    System.arraycopy(numbering, i + 1, newNumbering1, i, numbering.length - 1 - i);
                break;
            }
        }
        System.out.println("New Array after deleting element = "+index1+" and shifting: "+ Arrays.toString(newNumbering1));
    }

    //очищає колекцію:
    public void clear(){
        Arrays.fill(numbering, null);
        System.out.println("After clearing Array:");
        numbering = new Object[numbering.length];
        System.out.println(Arrays.toString(numbering));
    }
}


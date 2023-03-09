import java.util.Arrays;
import java.util.StringJoiner;

public class MyQueue<T> {
    private static final int number = 7;
    private Object[] arr = new Object[number];
    private int num;
    //додає елемент в кінець:
    public void add(T value){
        ifNeedNewSize();
        arr[num]=value;
        num++;
    }
    private void ifNeedNewSize(){
        if(num==arr.length){
            System.out.println("Process is successful, num: "+ num + ", buyers.length is: " + arr.length);
            int newNum = (arr.length*3)/2;
            Object[] newBuyers = new Object[newNum];
            System.arraycopy(arr, 0, newBuyers, 0, arr.length);
            arr=newBuyers;
        }
    }
    @Override
    public String toString(){
        StringJoiner result1 = new StringJoiner(", ");
        for(int i =0; i<number; i++){
            result1.add(arr[i].toString());
        }
        return "["+ result1 +"]";
    }
    //очищає колекцію:
    void clear(){
        Arrays.fill(arr, null);
        System.out.println("After clearing Array:");
        arr = new Object[arr.length];
        System.out.println(Arrays.toString(arr));
    }
    //повертає розмір колекції:
    public int size(){
        return arr.length;
    }
    //повертає перший елемент з черги:
    public Object peek(){
        return arr[0];
    }
    //повертає перший елемент з черги і видаляє його з колекції:
    public Object poll(){
        int b=0;
        Object[] a = new Object[arr.length-1];
         for(int i = 1; i<arr.length; i++){
            a[b]=arr[i];
            b++;
        }
   return "First element: " + arr[0]+ "afterPoll: "+Arrays.toString(a);}
}

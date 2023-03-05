import java.util.Arrays;
import java.util.StringJoiner;

public class MyQueue<T> {
    private static final int numberOfBuyers = 7;
    private Object[] buyers;
    private int num;

    public MyQueue(){
        buyers = new Object[numberOfBuyers];
    }
    //додає елемент в кінець:
    public void add(T value){
        ifNeedNewSize();
        buyers[num]=value;
        num++;
    }
    private void ifNeedNewSize(){
        if(num==buyers.length){
            System.out.println("Process is successful, num: "+ num + ", buyers.length is: " + buyers.length);
            int newNum = (buyers.length*3)/2;
            Object[] newBuyers = new Object[newNum];
            System.arraycopy(buyers, 0, newBuyers, 0, buyers.length);
            buyers=newBuyers;
        }
    }
    @Override
    public String toString(){
        StringJoiner result1 = new StringJoiner(", ");
        for(int i =0; i<numberOfBuyers; i++){
            result1.add(buyers[i].toString());
        }
        return "["+ result1 +"]";
    }
    //очищає колекцію:
    void clear(){
        Arrays.fill(buyers, null);
        System.out.println("After clearing Array:");
        buyers = new Object[buyers.length];
        System.out.println(Arrays.toString(buyers));
    }
    //повертає розмір колекції:
    void size(){
        System.out.println(buyers.length);
    }
    //повертає перший елемент з черги:
    void peek(){
        System.out.println(buyers[0]);
    }
    //повертає перший елемент з черги і видаляє його з колекції:
    void poll(){
        System.out.println(buyers[0]);
        int b=0;
        Object[] a = new Object[buyers.length-1];
         for(int i = 1; i<buyers.length; i++){
            a[b]=buyers[i];
            b++;
        }
        System.out.println(Arrays.toString(a));
        System.out.println("size after poll: " + a.length);
    }
}

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
    //очищає колекцію:
    void clear(){}
    //повертає розмір колекції:
    void size(){}
    //повертає перший елемент з черги:
    void peek(){}
    //повертає перший елемент з черги і видаляє його з колекції:
    void poll(){}
}

import java.util.Arrays;
public class MyStack<T> {
    private final int  count = 5;
    private Object[] books = new Object[count];
    private int number=0;

    //додає елемент в кінець:
    public void push(T value){
        ifNeedNewSize();
        books[number]=value;
        number++;
        reverse();}
        void reverse(){
            int a = 0;
        Object[]books3 = new Object[books.length];
        for(int i = books.length-1; i>=0; i--){
            books3[a] = books[i];
            a++;
        }
        System.out.println(Arrays.toString(books3));}

    private void ifNeedNewSize(){
        if(number==books.length){
            System.out.println("The resizing process is successful, count: "+ count + ", books.length is: " + books.length);
            int newCount = (books.length*3)/2;
            Object[] newBooks = new Object[newCount];
            System.arraycopy(books, 0, newBooks, 0, books.length);
            books=newBooks;
        }
    }
    //видаляє елемент за індексом:
    void remove(int index){
        Object[] newBooks1 = new Object[books.length-1];
        int b = 0;
        for (int i = books.length-1; i>=0; i--) {
            if (i != index) {
                newBooks1[b] = books[i];
                b++;
            }
        }
        System.out.println(Arrays.toString(newBooks1));
    }
    //очищає колекцію
    void clear(){
        Arrays.fill(books, null);
        System.out.println("After clearing Array:");
        books = new Object[books.length];
        System.out.println(Arrays.toString(books));
    }
    //повертає розмір колекції:
    void size(){
        System.out.println(books.length);
    }
    //повертає перший елемент стеку:
    void peek(){
        if(books[number]==null){
            number--;
         System.out.println(books[number]);
    }
    //повертає перший елемент стеку та видаляє його з колекції:
    /*void pop(){
        System.out.println(books[0]);
        Object[] books1 = new Object[books.length-1];
        for(int i = 0; i<books.length; i++){
            books1[i] = books[i+1];
        }
        System.out.println(Arrays.toString(books1));
    }*/
}}

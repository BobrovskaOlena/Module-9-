public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> numberOfBook = new MyStack<>();
        numberOfBook.push(1);
        numberOfBook.push(2);
        numberOfBook.push(3);
        numberOfBook.push(4);
        numberOfBook.push(5);
        numberOfBook.push(6);
        numberOfBook.push(7);
        numberOfBook.push(8);
        numberOfBook.push(9);
        numberOfBook.size();
        numberOfBook.peek();
        numberOfBook.remove(6);
        numberOfBook.remove(3);
        numberOfBook.pop();
        numberOfBook.clear();
    }
}

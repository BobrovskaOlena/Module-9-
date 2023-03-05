public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> names = new MyQueue<>();
        names.add("Olena");
        names.add("Anton");
        names.add("Katya");
        names.add("Margo");
        names.add("Oleg");
        names.add("Vita");
        names.add("Nadia");
        names.add("Maria");
        names.size();
        names.peek();
        System.out.println("size before poll: ");
        names.size();
        names.poll();
        names.clear();
    }
}

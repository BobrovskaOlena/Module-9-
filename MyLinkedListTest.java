public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        System.out.println("list.size() = " + list.size());
        list.add("a");
        System.out.println("list.size() = " + list.size());
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(3) = " + list.get(3));
        System.out.println("list.get(6) = " + list.get(6));
    }
}


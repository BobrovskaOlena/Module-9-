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
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.get(3) = " + list.get(3));
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.size() before remove = " + list.size());
        list.remove(4);
        System.out.println("list.size after remove() = " + list.size());
        System.out.println("list.size() before clear = " + list.size());
        list.clear();
        System.out.println("list.size() after clear = " + list.size());
    }
}



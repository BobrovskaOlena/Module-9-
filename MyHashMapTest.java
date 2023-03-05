public class MyHashMapTest {
    public static void main(String[] args) {
        /*MyHashMap<String, Integer> yearOfBirth = new MyHashMap<>();
        yearOfBirth.put("Olena", 1998);
        yearOfBirth.put("Anton", 1994);
        yearOfBirth.put("Marta", 1978);
        yearOfBirth.put("Oleg", 2000);
        yearOfBirth.put("Alex", 1970);
        //yearOfBirth.get("Anton");*/
        MyHashMap<Integer, String> map = new MyHashMap<Integer, String>();
        System.out.println("Going to add entries in map");
        map.put(null, "Nothing");
        map.put(1998, "Olena");
        map.put(2000, "John");
        map.put(1978,"Igor");
        map.put(1990, "Marta");
        map.put(1999, "Alex");
        System.out.println("Removing key 3");
        map.remove(3);



    }
}

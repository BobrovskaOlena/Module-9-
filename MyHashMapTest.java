public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        System.out.println("Going to add entries in map");
        map.put("Olena", 1998);
        map.put("John", 2000);
        map.put("Igor", 1978);
        map.put("Marta", 1990);
        map.put("Alex", 1999);
        map.put("Olha", 1968);
        map.size();
        map.get("Marta");
        map.get("John");
        map.remove("Igor");
        map.remove("Olena");
        map.remove("Alex");
        System.out.println("Map size: " + map.size());
        map.clear();
        



    }
}

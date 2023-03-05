public class MyHashMap {
    private String key;
    private Integer value;
    private Object next;

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Object getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = next;
    }
    private int capacity = 16;
    private final int d = 16;
    private final String[] listOfEmployees;
    private Integer[] Date;
    public MyHashMap(){
        listOfEmployees = new String[capacity];
        Date= new Integer[d];
    }
    public MyHashMap(int capacity){
        this.capacity = capacity;
        listOfEmployees = new String[capacity];
    }
    int number = 0;
    public void put(String key, Integer value){
        listOfEmployees[number] = key;
        number++;
    }}








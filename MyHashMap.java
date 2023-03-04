public class MyHashMap<K, V> {
    private K key;
    private V value;
    private MyHashMap<K, V> next;
    public MyHashMap(K key, V value, MyHashMap<K, V> next){
        this.key = key;
        this.value = value;
        this.next = next;
    }
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }

    public MyHashMap<K, V> getNext() {
        return next;
    }
    public void setNext(MyHashMap<K, V> next) {
        this.next = next;
    }}
    private int number = 8;
    private MyHashMap[] listOfEmployees;

    public MyHashMap(){
        listOfEmployees = new MyHashMap[number];
    }

    public MyHashMap(int number){
        this.number = number;
        listOfEmployees = new MyHashMap[number];
    }

   //додає пару ключ + значення:
    public void put(K key, V value){
        int index = index(key);
        MyHashMap newEntry = new MyHashMap(key, value, null);
        if(listOfEmployees[index] == null){
            listOfEmployees[index] = newEntry;
        }else {
            MyHashMap<K, V> previousNode = null;
            MyHashMap<K, V> currentNode = listOfEmployees[index];
            while(currentNode != null){
                if(currentNode.getKey().equals(key)){
                    currentNode.setValue(value);
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if(previousNode != null)
                previousNode.setNext(newEntry);
        }
    }
}
    //видаляє пару за ключем:
   /* void remove(Object key){}
    //очищає колекцію:
    void clear(){}
    //повертає розмір колекції:
    void size(){}
    //повертає значення (Object value) за ключем:
    void get(Object key){}*/


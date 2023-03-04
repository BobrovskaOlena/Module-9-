public class NodeHash<K, V> {
    private K key;
    private V value;
    private MyHashMap<K, V> next;
    public NodeHash(K key, V value, MyHashMap<K, V> next){
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
    }
}




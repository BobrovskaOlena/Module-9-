public class MyHashMap<K, V> {}
    /*private int number = 8;
    private final NodeHash<K, V>[] listOfEmployees;
    public MyHashMap(){
        listOfEmployees = new NodeHash[number];
    }

    public MyHashMap(int number){
        this.number = number;
        listOfEmployees = new NodeHash[number];
    }


    //додає пару ключ + значення:
    public void put(K key, V value) {
        NodeHash <K,V>newNode = new NodeHash<>(key, value, null);
        if (listOfEmployees[number] == null) {
            listOfEmployees[number] = newNode;
        } else {
            NodeHash<K, V> previousNode = null;
            NodeHash<K, V> currentNode = listOfEmployees[number];
            while (currentNode != null) {
                if (currentNode.getKey().equals(key)) {
                    currentNode.setValue(value);
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if (previousNode != null)
                previousNode.setNext(newNode);
        }
    }
    //видаляє пару за ключем:
    public void remove(K key){
        NodeHash previous = null;
        NodeHash nodeHash = listOfEmployees[number];
        while (nodeHash != null){
            if(nodeHash.getKey().equals(key)){
                if(previous == null){
                    nodeHash = nodeHash.getNext();
                    listOfEmployees[number] = nodeHash;
                    return;
                }else {
                    previous.setNext(nodeHash.getNext());
                    return;
                }
            }
            previous = nodeHash;
            nodeHash = nodeHash.getNext();
        }
    }
    //очищає колекцію:
   /* void clear(){}
    //повертає розмір колекції:
    void size(){}
    //повертає значення (Object value) за ключем:
    public V get(K key){
        V value = null;
        NodeHash<K, V> nodeHash = listOfEmployees[number];
        while (nodeHash != null){
            if(nodeHash.getKey().equals(key)) {
                value = nodeHash.getValue();
                break;
            }
            nodeHash = nodeHash.getNext();
        }
        return value;
    }
}*/

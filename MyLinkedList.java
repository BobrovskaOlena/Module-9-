public class MyLinkedList<T> {
 private Node1<T> head;
   //додає елемент в кінець:
    public void add(T element){
     Node1<T> node = new Node1<>();
     node.setValue(element);

     if (head==null){
      head = tail = node;
     } else {
      Node1<T> last = head;
      while (last.getNext() != null) {
       last = last.getNext();
      }
      last.setNext(node);
     }
    }
    //видаляє елемент із вказаним індексом:
    void remove(int index){}
    //очищає колекцію:
    void clear(){}
    //повертає розмір колекції:
    public int size(){
     if (head == null) {
      return 0;
     }

     int count = 1;
     Node1<T> last = head;
     while (last.getNext() != null) {
      last = last.getNext();
      count++;
     }

     return count;
    }
    //повертає елемент за індексом:
    public T get(int index){
     if (head == null) {
      throw new IndexOutOfBoundsException("List is empty");
     }

     Node1<T> search = head;
     for (int i = 0; i < index; i++) {
      search = search.getNext();

      if (search == null) {
       throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + size());
      }
     }
     return search.getValue();
    }
    }


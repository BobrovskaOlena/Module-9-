public class MyLinkedList<T> {
 private Node1<T> head;
 public int size;

 //додає елемент в кінець:
 public void add(T item) {
  Node1<T> node = new Node1<>();
  node.setValue(item);

  if (head == null) {
   head = node;
  } else {
   Node1<T> last = head;
   while (last.getNext() != null) {
    last = last.getNext();
   }
     last.setNext(node);
   size++;
  }
 }

 //видаляє елемент із вказаним індексом:
 public void remove(int i) {
  Node1<T> rem = head;
  for (int j = 0; j < i - 1; j++) {
   rem = rem.getNext();
  }
  rem.setNext(rem.getNext().getNext());
 }

 //очищає колекцію:
 public void clear() {
   head = null;
   size=0;
  }

 //повертає розмір колекції:
 public int size() {
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
 public T get(int index) {
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





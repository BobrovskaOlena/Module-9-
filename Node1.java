public class Node1<T> {
    private T value;
    private Node1<T> next;
    private Node1<T>previous;
    private Node1<T> current;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node1<T> getNext() {
        return next;
    }

    public void setNext(Node1<T> next) {
        this.next = next;
    }

    public Node1<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node1<T> previous) {
        this.previous = previous;
    }

    public Node1<T> getCurrent() {
        return current;
    }

    public void setCurrent(Node1<T> current) {
        this.current = current;
    }
}

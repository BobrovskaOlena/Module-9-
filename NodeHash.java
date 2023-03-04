public class NodeHash<T> {
    private T value;
    private NodeHash<T> next;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeHash<T> getNext() {
        return next;
    }

    public void setNext(NodeHash<T> next) {
        this.next = next;
    }
}

package list;

public class DoublyLinkedList<T> {
    private Node<T> head; // the first element of the collection
    private Node<T> tail; // the last element of the collection
    private int size; // the number of elements




    private Node createNewNode(T value) {
        return new Node(null, null, value);
    }

    public void add(T value) {
        Node newNode = createNewNode(value);
    }

    /*
     * return the size of the collection
     */
    public int size() {
        return size;
    }

    /*
     * tell if this collection is empty or not
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /*
     * clear all the element from the collection
     */
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    /*
     * add an element to the first position of the collection
     */
    public void addFirst(T element) {
        if (isEmpty()) {
            head = tail = createNewNode(element);
        } else {
            head.previousElement = new Node(head, null, element);
            head = head.previousElement;
        }
        size++;
    }

    // Internal node class to represent data
    private static class Node<T> {
        private Node nextElement;
        private Node previousElement;
        private T value;

        Node(Node<T> nextElement, Node<T> previousElement, T value) {
            this.nextElement = nextElement;
            this.previousElement = previousElement;
            this.value = value;
        }
    }
}

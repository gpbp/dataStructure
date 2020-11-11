package linkedList;

public class DoublyLinkedList<T> {
    private Node<T> head; // the first element of the collection
    private Node<T> tail; // the last element of the collection
    private int size; // the number of elements

    public void add(T element) {
        addFirst(element);
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
            head = tail = new Node(null, null, element);
        } else {
            head.previousElement = new Node(head, null, element);
            head = head.previousElement;
        }
        size++;
    }

    /*
     * add an element to the last position of the collection
     */
    public void addLast(T element) {
        if (isEmpty()) {
            head = tail = new Node(null, null, element);
        } else {
            tail.nextElement = new Node(null, tail, element);
            tail = tail.nextElement;
        }
        size++;
    }

    public T get(int index) {
        if (isEmpty())
            return null;
        else {
            Node<T> traversePointer = head;
            T result = null;
            int i = 0;
            while (traversePointer != null) {
                if (index == i) {
                    result = traversePointer.value;
                }
                i++;
                traversePointer = traversePointer.nextElement;
            }
            return result;
        }
    }

    public T peekLast() {
        if (isEmpty()) {
            return null;
        }
        return tail.value;
    }

    public T peekFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.value;
    }

    public T remove() {
        return removeFirst();
    }

    /*
     * remove the first element of the list
     */
    public T removeFirst() {
        if (isEmpty())
            return null;
        else {
            Node<T> result = head;
            head = head.nextElement;
            result.nextElement = null;
            head.previousElement = null;
            size--;
            return result.value;
        }
    }

    /*
     * remove the last element of the list
     */
    public T removeLast() {
        if (isEmpty())
            return null;
        else {
            Node<T> result = tail;
            tail = tail.previousElement;
            result.previousElement = null;
            tail.nextElement = null;
            size--;
            return result.value;
        }
    }

    /*
     * remove the nth element of the list
     */
    public T remove(int index) {
        if (isEmpty()) {
            return null;
        } else {
            Node<T> result = null;
            Node<T> traversePointer1 = head;
            Node<T> traversePointer2 = head;
            while (traversePointer != null) {

            }
            return result.value;
        }
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

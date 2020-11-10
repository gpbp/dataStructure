package list;

import exception.IndexOutOfBoundException;

public class SinglyLinkedList<T> {
    private int size; // number of elements
    private Node tail; // last element of the list
    private Node head; // first element of the list

    public void add(T value) {
        addFirst(value);
    }

    public void addFirst(T value) {
        if (isEmpty()) {
            head = tail = new Node(value, null);
        } else {
            Node<T> newNode = new Node(value, head);
            head = newNode;
        }
        size++;
    }

    public void add(T value, int index) throws IndexOutOfBoundException {
        if (index < 0 || index >= size) throw new IndexOutOfBoundException();
        if (index == size - 1) {
            addLast(value);
        } else if (index == 0) {
            addFirst(value);
        } else {
            Node<T> newNode = new Node(value, null);
            Node<T> traversePointer = head;
            int i = 0;
            while (traversePointer != null) {
                if (i == index - 1) {
                   newNode.nextElement = traversePointer.nextElement;
                   traversePointer.nextElement = newNode;
                }
                i++;
                traversePointer = traversePointer.nextElement;
            }
        }
    }

    public void addLast(T value) {
        if (isEmpty()) {
            head = tail = new Node(value, null);
        } else {
            Node<T> newNode = new Node(value, null);
            tail.nextElement = newNode;
        }
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public T get(int index) {
        int i = 0;
        Node<T> traversePointer = head;
        T result = null;
        while (traversePointer != null) {
            if (i == index) {
                result = traversePointer.value;
            }
            i++;
            traversePointer = traversePointer.nextElement;
        }
        return result;
    }

    public int size() {
        return size;
    }

    // internal class represents one node of the linked list
    private static class Node<T> {
        private Node<T> nextElement;
        private T value;

        Node(T value, Node<T> nextElement) {
            this.value = value;
            this.nextElement = nextElement;
        }
    }

}

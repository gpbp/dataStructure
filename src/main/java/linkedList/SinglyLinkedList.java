package linkedList;

import exception.IndexOutOfBoundException;

public class SinglyLinkedList<T> {
    private int size; // number of elements
    private Node<T> tail; // last element of the list
    private Node<T> head; // first element of the list

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
            Node<T> traversePointer = head;
            int i = 0;
            while (traversePointer != null) {
                if (i == index - 1) {
                    Node<T> newNode = new Node(value, traversePointer.nextElement);
                    traversePointer.nextElement = newNode;
                }
                i++;
                traversePointer = traversePointer.nextElement;
            }
        }
        size++;
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

    public T peekLast() {
        return tail.value;
    }

    public int size() {
        return size;
    }

    public T remove() {
        return removeFirst();
    }

    public T removeFirst() {
        if (size == 0)
            return null;
        else {
            Node<T> elementToRemove = head;
            head = head.nextElement;
            size--;
            return elementToRemove.value;
        }
    }

    public T removeLast() {
        if (size == 0)
            return null;
        else {
            Node<T> lastElement = tail;
            Node<T> traversePointer = head;
            for (int i = 0; i < size - 2; i++) {
                traversePointer = traversePointer.nextElement;
            }
            traversePointer.nextElement = null;
            size--;
            return lastElement.value;
        }
    }

    public T remove(int index) {
        if (isEmpty()) {
            return null;
        } else if (index == 0)
            return removeFirst();
        else if (index == size - 1)
            return removeLast();
        else {
            Node<T> traversePointer1 = head;
            Node<T> traversePointer2 = head.nextElement;
            Node<T> result = traversePointer2;
            for (int i = 0; i < size; i++) {
                if (i == index - 1) {
                    traversePointer1.nextElement = traversePointer2.nextElement;
                    traversePointer2.nextElement = null;
                    break;
                }
                traversePointer1 = traversePointer1.nextElement;
                traversePointer2 = traversePointer2.nextElement;
            }
            size--;
            return result.value;
        }
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

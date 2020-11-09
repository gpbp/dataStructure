package list;

import exception.IndexOutOfBoundException;

import java.util.Iterator;
import java.util.function.Consumer;

public class SinglyLinkedList<T> {
    private int size = 0; // number of elements
    private Node tail; // last element of the list
    private Node head; // first element of the list

    public void add(T value) {
        Node newNode = createNewNode(value);
        if (size == 0) {
            newNode.nextElement = null;
            head = newNode;
            tail = newNode;
        } else {
            newNode.nextElement = head;
            head = newNode;
        }
        size++;
    }

    public void add(int index, T value) {
        if (index < 0 && index > size) throw new IndexOutOfBoundsException();
        if (index == 0) {
            add(value);
        } else {
            Node nodeToAdd = createNewNode(value);
            Node traversePointer = head;
            int i = 0;
            while (traversePointer.nextElement != null) {
                if (i == index - 1) {
                    nodeToAdd.nextElement = traversePointer.nextElement;
                    traversePointer.nextElement = nodeToAdd;
                }
                i++;
                traversePointer = traversePointer.nextElement;
            }
        }
        size++;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public T get(int index) {
        int i = 0;
        Node traversePointer = head;
        T result = null;
        while (traversePointer.nextElement != null) {
            if (i == index) {
                result = traversePointer.value;
            }
            i++;
            traversePointer = traversePointer.nextElement;
        }
        return result;
    }


    private Node createNewNode(T value) {
        return new Node(value);
    }

    public int size() {
        return size;
    }

    // internal class represents one element of the linked list
    private class Node {
        private Node nextElement;
        private T value;

        Node(T value) {
            this.value = value;
        }
    }

}

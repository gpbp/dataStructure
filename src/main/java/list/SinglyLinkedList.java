package list;

import exception.IndexOutOfBoundException;

import java.util.Iterator;
import java.util.function.Consumer;

public class SinglyLinkedList<T> {
    private int size = 0; // number of elements excluding the tail
    private Node tail = null;
    private Node head = null;

    public void add(int index, T value) throws IndexOutOfBoundException {
        if (index < 0 || index >= size) throw new IndexOutOfBoundException();
        Node newNode = createNewNode(value);
        if (size <= 0) {
            newNode.setNextElement(tail);

        } else {
            for (int i = 0; i <= index; i++) {

            }
        }
        size++;
    }

    private Node createNewNode(T value) {
        return new Node(value);
    }
    public void remove(int element) {

    }

    public int size() {
        return size;
    }

    class Node {
        private Node nextElement;
        private T value;
        private int index;

        Node(T value) {
            this.value = value;
        }

        private Node getNextElement() {
            return nextElement;
        }

        private void setNextElement(Node nextElement) {
            this.nextElement = nextElement;
        }

        private T getValue() {
            return value;
        }

        private int getIndex() {
            return index;
        }

        private void setValue(T value) {
            this.value = value;
        }
    }

}

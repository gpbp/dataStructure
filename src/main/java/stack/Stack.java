package stack;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> linkedList = new LinkedList<>();

    public void push(T value) {
        linkedList.addFirst(value);
    }

    public T pop() {
        return linkedList.removeFirst();
    }

    public int size() {
        return linkedList.size();
    }

    public T peek() {
        return linkedList.peekLast();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void clear() {
        linkedList.clear();
    }

    public T search(int index) {
        if (index < 0 && index >= size()) throw new IndexOutOfBoundsException();
        return linkedList.get(index);
    }
}

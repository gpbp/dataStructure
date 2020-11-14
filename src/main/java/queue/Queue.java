package queue;

import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> linkedList = new LinkedList<>();

    public T poll() {
        return linkedList.removeFirst();
    }

    public void offer(T value) {
        linkedList.addLast(value);
    }

    public int size() {
        return linkedList.size();
    }

    public boolean isEmpty() {
        return linkedList.size() == 0;
    }

}

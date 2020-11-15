package queue;

import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> linkedList = new LinkedList<>();

    /*
     * remove the first element from the queue
     */
    public T poll() {
        return linkedList.removeFirst();
    }

    /*
     * add an element to the last position of the queue
     */
    public void offer(T value) {
        linkedList.addLast(value);
    }

    /*
     * return the size of the queue
     */
    public int size() {
        return linkedList.size();
    }

    /*
     * tell if the queue is empty or not
     */
    public boolean isEmpty() {
        return linkedList.size() == 0;
    }

    /*
     * clear the queue
     */
    public void clear() {
        linkedList.clear();
    }
}

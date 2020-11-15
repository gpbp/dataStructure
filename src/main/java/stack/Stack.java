package stack;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> linkedList = new LinkedList<>();

    /*
     * push one element into the stack
     */
    public void push(T value) {
        linkedList.addFirst(value);
    }

    /*
     * remove the first element from the stack
     */
    public T pop() {
        return linkedList.removeFirst();
    }

    /*
     * return the size of the stack
     */
    public int size() {
        return linkedList.size();
    }

    /*
     * peek the first element on top of the stack
     */
    public T peek() {
        return linkedList.peekLast();
    }

    /*
     * tell if the stack is empty or not
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /*
     * clear the stack
     */
    public void clear() {
        linkedList.clear();
    }

    /*
     * search an element by its given index
     */
    public T search(int index) {
        if (index < 0 && index >= size()) throw new IndexOutOfBoundsException();
        return linkedList.get(index);
    }
}

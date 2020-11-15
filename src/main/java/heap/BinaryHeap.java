package heap;

import java.util.List;

public class BinaryHeap<T extends Comparable<T>> {
    // the number of elements inside the heap
    private int size;
    // the internal capacity of the heap
    private int capacity;
    // a dynamic heap to track the elements inside the heap
    private List<T> heap = null;
    

    private class Node<T> {
        private Node<T> rightChild;
        private Node<T> leftChild;
        private T value;

        private Node(Node<T> rightChild, Node<T> leftChild, T value) {
            this.rightChild = rightChild;
            this.leftChild = leftChild;
            this.value = value;
        }
    }
}

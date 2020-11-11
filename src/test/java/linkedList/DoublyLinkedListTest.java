package linkedList;

import linkedList.DoublyLinkedList;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DoublyLinkedListTest {
    private DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();

    @After
    public void clearList() {
        doublyLinkedList.clear();
    }
    @Test
    public void addOneElement() {
        doublyLinkedList.add(4);
        assertTrue(doublyLinkedList.size() == 1);
    }

    @Test
    public void addTwoElement() {
        doublyLinkedList.add(5);
        doublyLinkedList.add(6);
        assertTrue(doublyLinkedList.size() == 2);
        assertTrue(doublyLinkedList.get(1).intValue() == 5);
    }

    @Test
    public void addLastElement() {
        doublyLinkedList.add(6);
        doublyLinkedList.add(5);
        doublyLinkedList.add(4);
        doublyLinkedList.addLast(3);
        assertTrue(doublyLinkedList.size() == 4);
    }

    @Test
    public void peekLastElement() {
        doublyLinkedList.add(6);
        doublyLinkedList.add(5);
        assertTrue(doublyLinkedList.peekLast().intValue() == 6);
    }

    @Test
    public void peekFirstElement() {
        doublyLinkedList.add(5);
        doublyLinkedList.add(6);
        assertTrue(doublyLinkedList.peekFirst().intValue() == 6);
    }

    @Test
    public void remove() {
        doublyLinkedList.add(5);
        doublyLinkedList.add(6);
        assertTrue(doublyLinkedList.remove().intValue() == 6);
        assertTrue(doublyLinkedList.size() == 1);
    }

    @Test
    public void removeLastElement() {
        doublyLinkedList.add(5);
        doublyLinkedList.add(6);
        assertTrue(doublyLinkedList.removeLast().intValue() == 5);
        assertTrue(doublyLinkedList.size() == 1);
    }

    @Test
    public void removeNthElement() {
        doublyLinkedList.add(5);
        doublyLinkedList.add(6);
        doublyLinkedList.add(7);
        doublyLinkedList.add(8);
        doublyLinkedList.add(9);
        assertTrue(doublyLinkedList.remove(1).intValue() == 8);
        assertTrue(doublyLinkedList.size() == 4);
    }
}

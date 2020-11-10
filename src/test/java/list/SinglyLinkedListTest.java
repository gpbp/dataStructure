package list;

import exception.IndexOutOfBoundException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Test;

public class SinglyLinkedListTest {
    private final Logger logger = LogManager.getLogger(SinglyLinkedListTest.class);

    private SinglyLinkedList<Integer> linkedList = new SinglyLinkedList();

    @After
    public void clearList() {
        linkedList.clear();
    }

    @Test
    public void addOneElement() {
        linkedList.add(4);
        assert(linkedList.size() == 1);
    }

    @Test
    public void addTwoElement() {
        linkedList.add(5);
        linkedList.add(6);
        assert(linkedList.size() == 2);
        assert(linkedList.get(1) == 5);
    }

    @Test
    public void addFirstElement() {
        linkedList.addFirst(5);
        assert(linkedList.size() == 1);
        assert(linkedList.get(0) == 5);
    }

    @Test
    public void addLastElement() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.addLast(6);
        assert(linkedList.size() == 4);
        assert(linkedList.get(3) == 6);
    }

    @Test
    public void addNthElement() throws IndexOutOfBoundException {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7, 3);
        assert(linkedList.size() == 7);
        System.out.print(linkedList.get(3));
        assert(linkedList.get(3) == 7);
    }
}

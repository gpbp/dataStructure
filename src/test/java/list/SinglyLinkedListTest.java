package list;

import org.junit.After;
import org.junit.Test;


public class SinglyLinkedListTest {
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
        assert(linkedList.get(1) == 6);
        assert(linkedList.get(0) == 5);
        assert(linkedList.size() == 2);
    }
}

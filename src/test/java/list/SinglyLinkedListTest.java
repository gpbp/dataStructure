package list;

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
        logger.info(linkedList.get(1));
        assert(linkedList.get(1) == 6);
        assert(linkedList.get(0) == 5);
        assert(linkedList.size() == 2);
    }
}

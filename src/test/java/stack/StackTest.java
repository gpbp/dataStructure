package stack;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StackTest {
    private Stack<Integer> stack = new Stack();

    @After
    public void clearStack() {
        stack.clear();
    }

    @Test
    public void pushTest() {
        stack.push(1);
        assertTrue(stack.peek() == 1);
        assertTrue(stack.size() == 1);
    }

    @Test
    public void popTest() {
        stack.push(1);
        stack.push(2);
        assertTrue(stack.pop() == 2);
        assertTrue(stack.peek() == 1);
        assertTrue(stack.size() == 1);
    }

    @Test
    public void searchTest() {
        stack.push(1);
        stack.push(2);
        assertTrue(stack.search(0) == 2);
        assertTrue(stack.search(1) == 1);
    }

    @Test
    public void isEmptyTest() {
        assertTrue(stack.isEmpty());
    }
}

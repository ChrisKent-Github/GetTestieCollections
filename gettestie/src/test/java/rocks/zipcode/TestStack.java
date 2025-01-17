package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStackPush() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @org.junit.Test
    public void TestStackPeek() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals("Hello world", stack.peek()); // true
    }

    @org.junit.Test
    public void TestStackPop() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.pop();
        assertEquals(true, stack.isEmpty()); // true
    }


    // Make a bigger test exercising more Stack methods.....
}

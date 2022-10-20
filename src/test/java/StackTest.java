import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackTest {

    @Test
    void isEmptyShouldReturnTrueOnEmptyStack() {
        Stack stack = new StackImpl();
        boolean result = stack.isEmpty();
        assertEquals(true, result);
    }

    @Test
    void isEmptyShouldReturnFalseOnNonEmptyStack() {
        Stack stack = new StackImpl();
        stack.push(1);
        boolean result = stack.isEmpty();
        assertEquals(false, result);
    }

    @Test
    void sizeShouldReturnZeroOnEmptyStack() {
        Stack stack = new StackImpl();
        int result = stack.size();
        assertEquals(0, result);
    }

    @Test
    void sizeShouldReturnTwoOnStackWithTwoElements() {
        Stack stack = new StackImpl();
        stack.push(1);
        stack.push(2);
        int result = stack.size();
        assertEquals(2, result);
    }

    @Test
    void popShouldThrowEmptyStackExceptionOnEmptyStack() {
        Stack stack = new StackImpl();
        assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    void popShouldRemoveAndReturnTopOfStackOnNonEmptyStack() {
        Stack stack = new StackImpl();
        stack.push(100);
        assertEquals(1, stack.size());
        int result = stack.pop();
        assertEquals(0, stack.size());
        assertEquals(100, result);
    }

    @Test
    void peekShouldThrowEmptyStackExceptionOnEmptyStack() {
        Stack stack = new StackImpl();
        assertThrows(EmptyStackException.class, stack::peek);
    }

    @Test
    void peekShouldReturnTopItemFromStackOnNonEmptyStack() {
        Stack stack = new StackImpl();
        stack.push(100);
        int result = stack.peek();
        assertEquals(100, result);
        assertEquals(1, stack.size());
    }

    @Test
    void pushShouldAddItemToTopOfStack() {
        Stack stack = new StackImpl();
        assertEquals(true, stack.isEmpty());
        stack.push(100);
        assertEquals(1, stack.size());
        assertEquals(100, stack.peek());
    }

}

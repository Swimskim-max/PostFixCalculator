import java.util.LinkedList;
import java.util.List;

/**
 * Stack implementation for doubles using LinkedList.
 *
 * @author David Sanchez
 */
public class StackOfDoubles implements Stack<Double> {

    LinkedList<Double> ll = new LinkedList<>();

    /**
     * Checks if stack is empty.
     *
     * @return true if empty
     */
    public boolean isEmpty() {
        return ll.isEmpty();
    }

    /**
     * Pushes value onto stack.
     *
     * @param val value to push
     */
    @Override
    public void push(Double val) {
        ll.push(val);
    }

    /**
     * Pops value from stack.
     *
     * @return top value
     */
    @Override
    public Double pop() {
        return ll.pop();
    }

    /**
     * Peeks at top value.
     *
     * @return top value without removing
     */
    @Override
    public Double peek() {
        return ll.peek();
    }
}
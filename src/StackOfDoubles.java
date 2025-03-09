import java.util.LinkedList;

public class StackOfDoubles implements Stack<Double> {

    LinkedList<Double> ll = new LinkedList<>();

    public boolean isEmpty() {
        //returns true is this collections contains no elements
        return ll.isEmpty();
    }

    /**
     * Push item onto top of stack.
     *
     * @param val
     */
    @Override
    public void push(Double val) {
        ll.push(val);

    }

    /**
     * Pop the item from the top of the stack and return it.
     *
     */
    @Override
    public Double pop() {
        /*
        Pops an element from the stack represented by this list.
        In other words, removes and returns the
        first element of this list.
         */
        return ll.pop();
    }

    /**
     * Return the top item on the stack without removing it.
     */
    @Override
    public Double peek() {
        //Retrieves but does now remove first element of this list.or null is list is empty
        return ll.peek();
    }

}

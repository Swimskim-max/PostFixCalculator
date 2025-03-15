import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.lang.Math;

/**
 * Postfix calculator using a stack and operator map.
 *
 * @author David Sanchez
 */
public class PostfixCalculator {
    private final StackOfDoubles operands;
    private final List<Double> newOperation;
    private final Map<String, Operator> operatorMap;

    /**
     * Creates calculator and maps operators to symbols.
     */
    PostfixCalculator() {
        Operator additionOperator = new addition();
        Operator equalsOperator = new equal();
        Operator subtractOperator = new subtraction();
        Operator multiplyOperator = new multiplication();
        Operator divideOperator = new division();
        Operator squareRootOperator = new square_root();

        newOperation = new LinkedList<>();
        operands = new StackOfDoubles();
        operatorMap = new HashMap<>();

        operatorMap.put("+", additionOperator);
        operatorMap.put("add", additionOperator);
        operatorMap.put("=", equalsOperator);
        operatorMap.put("print", equalsOperator);
        operatorMap.put("sub", subtractOperator);
        operatorMap.put("-", subtractOperator);
        operatorMap.put("*", multiplyOperator);
        operatorMap.put("mult", multiplyOperator);
        operatorMap.put("/", divideOperator);
        operatorMap.put("div", divideOperator);
        operatorMap.put("sqrt", squareRootOperator);
    }

    /**
     * Pushes operand onto stack.
     *
     * @param operand value to push
     */
    protected void storeOperand(double operand) {
        operands.push(operand);
        System.out.println("storeOperand " + operand);
    }

    /**
     * Evaluates operator with operands from stack.
     *
     * @param operatorString operator to evaluate
     */
    protected void evalOperator(String operatorString) {
        Operator operator = operatorMap.get(operatorString);
        for (int i = 0; i < operator.numArgs(); i++) {
            newOperation.add(operands.pop());
        }
        operands.push(operator.eval(newOperation));
        newOperation.clear();
    }

    /**
     * Addition operator.
     */
    public static class addition implements Operator {
        /**
         * Returns number of arguments.
         *
         * @return 2
         */
        @Override
        public int numArgs() {
            return 2;
        }

        /**
         * Adds two numbers.
         *
         * @param args list of operands
         * @return sum
         */
        @Override
        public double eval(List<Double> args) {
            double firstOperand = args.getLast();
            double secondOperand = args.getFirst();
            return firstOperand + secondOperand;
        }
    }

    /**
     * Subtraction operator.
     */
    public static class subtraction implements Operator {
        /**
         * Returns number of arguments.
         *
         * @return 2
         */
        @Override
        public int numArgs() {
            return 2;
        }

        /**
         * Subtracts two numbers.
         *
         * @param args list of operands
         * @return difference
         */
        @Override
        public double eval(List<Double> args) {
            double firstOperand = args.getLast();
            double secondOperand = args.getFirst();
            return firstOperand - secondOperand;
        }
    }

    /**
     * Multiplication operator.
     */
    public static class multiplication implements Operator {
        /**
         * Returns number of arguments.
         *
         * @return 2
         */
        @Override
        public int numArgs() {
            return 2;
        }

        /**
         * Multiplies two numbers.
         *
         * @param args list of operands
         * @return product
         */
        @Override
        public double eval(List<Double> args) {
            double firstOperand = args.getLast();
            double secondOperand = args.getFirst();
            return firstOperand * secondOperand;
        }
    }

    /**
     * Division operator.
     */
    public static class division implements Operator {
        /**
         * Returns number of arguments.
         *
         * @return 2
         */
        @Override
        public int numArgs() {
            return 2;
        }

        /**
         * Divides two numbers.
         *
         * @param args list of operands
         * @return quotient
         */
        @Override
        public double eval(List<Double> args) {
            double firstOperand = args.getLast();
            double secondOperand = args.getFirst();
            return firstOperand / secondOperand;
        }
    }

    /**
     * Equals operator.
     */
    public static class equal implements Operator {
        /**
         * Returns number of arguments.
         *
         * @return 1
         */
        @Override
        public int numArgs() {
            return 1;
        }

        /**
         * Prints and returns value.
         *
         * @param args list of operands
         * @return value
         */
        @Override
        public double eval(List<Double> args) {
            System.out.println(args.getLast());
            return args.getLast();
        }
    }

    /**
     * Square root operator.
     */
    public static class square_root implements Operator {
        /**
         * Returns number of arguments.
         *
         * @return 1
         */
        @Override
        public int numArgs() {
            return 1;
        }

        /**
         * Calculates square root.
         *
         * @param args list of operands
         * @return square root
         */
        @Override
        public double eval(List<Double> args) {
            double firstOperand = args.getLast();
            return Math.sqrt(firstOperand);
        }
    }
}
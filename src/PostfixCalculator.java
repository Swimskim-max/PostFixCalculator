import java.util.List;
import java.util.Map;

public class PostfixCalculator {
    private StackOfDoubles operands;
    private Map<String,Operator> operatorMap;

    PostfixCalculator(){

    }
    public class OperatorMath implements Operator{

        /**
         * How many arguments does this operator take?
         *
         * @return number of arguments required by this operator.
         */
        @Override
        public int numArgs() {
            return 0;
        }

        /**
         * Evaluate this operator using the given arguments.
         * Should not modify the list of arguments.
         *
         * @param args Argument list.
         * @return Result of the operation.
         */
        @Override
        public double eval(List<Double> args) {
            //how do i evaluate this?
            return 0;

        }
        //takes a double and pushes it onto the operand stack. does not return anything.
        public void storeOperand(double operand){
            operands.push(operand);
            return;
        }

        /**
         * Method takes an operator string, looks up the corresponding operator object
         * in the operator map, pop the appropriate number of operands(as given by the numArgs method)
         * and places them into a list, evaluates the operator with the operands in the list, and
         * pushes the result onto the operand stack. does not return anything.
         * @param operatorString
         */
        public void evalOperator(String operatorString) {

        }

    }





}

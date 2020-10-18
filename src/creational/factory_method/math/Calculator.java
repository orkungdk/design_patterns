package creational.factory_method.math;

import creational.factory_method.math.operation.Operation;
import creational.factory_method.math.operation.OperationFactory;

/**
 * @author orkungedik
 */
public class Calculator {

    /**
     * This method considers the {@code execution} parameter gets only three argument like "1 + 1" or "4 / 2".
     * Arguments needs to be separated with space. The method argument needs to be trimmed before the call.
     *
     * @param execution String representation of an arithmetic expression
     * @return
     */
    public void calculate(String execution) {
        System.out.print(execution + " = ");

        String[] args = execution.split(" ");

        Operand firstOperand = new Operand(args[0]);
        Operand secondOperand = new Operand(args[2]);

        Operation operation = OperationFactory.invoke(args[1]);

        System.out.println(operation.execute(firstOperand, secondOperand));
    }

}

package creational.factory_method.math.operation;

import creational.factory_method.math.Operand;

/**
 * @author orkungedik
 */
public class Subtraction implements Operation {

    @Override
    public double execute(Operand arg1, Operand arg2) {
        return arg1.getValue() - arg2.getValue();
    }
}

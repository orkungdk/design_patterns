package creational.factory_method.calculator.operations;

import creational.factory_method.calculator.Operand;

/**
 * @author orkungedik
 */
public class Division implements Operation {

    @Override
    public double execute(Operand arg1, Operand arg2) {
        return arg1.getValue() / arg2.getValue();
    }
}

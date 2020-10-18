package creational.factory_method.operations;

import creational.factory_method.Operand;

/**
 * @author orkungedik
 */
public class Addition implements Operation {

    @Override
    public double execute(Operand arg1, Operand arg2) {
        return arg1.getValue() + arg2.getValue();
    }
}

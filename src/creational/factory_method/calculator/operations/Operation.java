package creational.factory_method.calculator.operations;

import creational.factory_method.calculator.Operand;

/**
 * @author orkungedik
 */
public interface Operation {

    double execute(Operand arg1, Operand arg2);
}

package creational.factory_method.operations;

import creational.factory_method.Operand;

/**
 * @author orkungedik
 */
public interface Operation {

    double execute(Operand arg1, Operand arg2);
}
